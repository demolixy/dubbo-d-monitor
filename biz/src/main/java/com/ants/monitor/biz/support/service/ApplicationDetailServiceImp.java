/**
 * 
 */
package com.ants.monitor.biz.support.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.MapUtils;

import com.alibaba.dubbo.common.Constants;
import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.alibaba.dubbo.common.utils.StringUtils;
import com.ants.monitor.bean.MonitorConstants;
import com.ants.monitor.bean.bizBean.ApplicationBO;
import com.ants.monitor.bean.bizBean.HostBO;
import com.ants.monitor.bean.bizBean.ServiceBO;
import com.ants.monitor.common.tools.Tool;

/**
 * @author lixiangyang
 *
 */
public class ApplicationDetailServiceImp extends ApplicationServiceImpl implements ApplicationDetailService {

    
    
    /* (non-Javadoc)
     * @see com.ants.monitor.biz.support.service.ApplicationDetailService#getApplicationsProvider()
     */
    @Override
    public Map<String, ApplicationBO> getApplicationsProvider() {
        //提供者处理
        //测试环境url
        Set<String> testUrlSet = new HashSet<>();
        for(Map.Entry<String,String> entry : MonitorConstants.ecsTestMap.entrySet()){
            testUrlSet.add(entry.getKey());
            testUrlSet.add(entry.getValue());
        }
        //所有服务器url,除测试环境外
        Set<String> onlineUrlSet = new HashSet<>();
        for(Map.Entry<String,String> entry : MonitorConstants.ecsMap.entrySet()){
            String url = entry.getKey();
            if(!testUrlSet.contains(url)) {
                onlineUrlSet.add(url);
            }
        }
        Map<String, ApplicationBO> appMap = new HashMap<>();
        Map<String, Map<String, Set<URL>>> registry = registryContainer.getRegistryCache();
        Map<String, Set<URL>> forbidServices = registry.get(Constants.CONFIGURATORS_CATEGORY);
        //service对应的所有提供者
        Map<String, Set<String>> serviceProviders = new HashMap<>();
        Map<String, Set<URL>> providersServices = registry.get(Constants.PROVIDERS_CATEGORY);
        // 提供者---拼基本信息
        for (Map.Entry<String, Set<URL>> serviceEntry : providersServices.entrySet()) {
            String serviceName = serviceEntry.getKey();
            //是否被禁止,禁止则不出现
            Set<URL> forbidSet = forbidServices.get(serviceName);

            //拼这个service对应的提供者
            Set<String> appSet = serviceProviders.get(serviceName);
            if(appSet == null){
                appSet = new HashSet<>();
                serviceProviders.put(serviceName,appSet);
            }

            Set<URL> urls = serviceEntry.getValue();
            for (URL url : urls) {
                //是否被禁止,禁止则不出现
                if(Tool.compareIsOverride(url, forbidSet)){
                    continue;
                }
                Set<HostBO> hostList = new HashSet<>();

                String application = url.getParameter(Constants.APPLICATION_KEY);
                //service的所有提供者
                appSet.add(application);
                //开始拼接BO
                ApplicationBO applicationBO = appMap.get(application);
                if (null == applicationBO) {
                    String organization = url.getParameter(MonitorConstants.ORGANICATION);

                    applicationBO = new ApplicationBO();
                    applicationBO.setApplicationName(application);
                    if(StringUtils.isEmpty(applicationBO.getOrganization())) applicationBO.setOrganization(organization == null ? "" : organization);
//                    if(StringUtils.isEmpty(applicationBO.getOwner())) applicationBO.setOwner(owners == null ? "" : owners);
                    appMap.put(application, applicationBO);
                } else {
                    hostList = applicationBO.getHostList();
                }
                String host = url.getHost();
                String port = String.valueOf(url.getPort());
                HostBO hostBO = new HostBO(host,port);
                hostList.add(hostBO);
                applicationBO.setHostList(hostList);
                applicationBO.setIsProvider(true);

                //==============start========================service的处理
                providerService(url,applicationBO,testUrlSet,onlineUrlSet);

            }

        }

        return null;
    }

    /* (non-Javadoc)
     * @see com.ants.monitor.biz.support.service.ApplicationDetailService#getApplicationConsumers()
     */
    @Override
    public Map<String, ApplicationBO> getApplicationConsumers() {
        return Collections.emptyMap();
        /*
        // 消费者--拼 依赖和消费的app
        for (Map.Entry<String, Set<URL>> serviceEntry : consumersServices.entrySet()) {
            String serviceName = serviceEntry.getKey();
            //其service的 提供方
            Set<String> providers = serviceProviders.get(serviceName);
            if (providers == null) {
                //无提供者者 暂时此处不处理
                providers = new HashSet<>();
            }
            Set<URL> urls = serviceEntry.getValue();
            for (URL url : urls) {
                Set<HostBO> hostList = new HashSet<>();

                String applicationName = url.getParameter(Constants.APPLICATION_KEY);

                String owners = url.getParameter(MonitorConstants.OWNER);
                String organization = url.getParameter(MonitorConstants.ORGANICATION);

                ApplicationBO consumerApplicationBO = appMap.get(applicationName);
                if (null == consumerApplicationBO) {
                    // 此app 未提供服务
                    consumerApplicationBO = new ApplicationBO();
                    consumerApplicationBO.setApplicationName(applicationName);
                    if(StringUtils.isEmpty(consumerApplicationBO.getOrganization())) consumerApplicationBO.setOrganization(organization == null ? "" : organization);

                    hostList.add(new HostBO(url.getHost(),null));
                    consumerApplicationBO.setHostList(hostList);
                    appMap.put(applicationName, consumerApplicationBO);
                }else if (!consumerApplicationBO.getIsProvider()) {
                    // 未提供app服务的host
                    hostList = consumerApplicationBO.getHostList();
                    hostList.add(new HostBO(url.getHost(),null));
                    consumerApplicationBO.setHostList(hostList);
                }

                Set<String> providersSet = consumerApplicationBO.getProvidersSet();
                if (null == providersSet) {providersSet = new HashSet<>();}

                for (String provider : providers) {
                    //提供者set
                    providersSet.add(provider);
                    //反向补充每个提供者的数据
                    ApplicationBO providerApplicationBO = appMap.get(provider);
                    if (null != providerApplicationBO) {
                        Set<String> consumersSet = providerApplicationBO.getConsumersSet();
                        if (null == consumersSet) consumersSet = new HashSet<>();
                        // 提供了这些app
                        consumersSet.add(applicationName);
                        providerApplicationBO.setConsumersSet(consumersSet);

                        Map<String,Set<ServiceBO>> thisServiceMap = providerApplicationBO.getServiceMap();
                        for(Map.Entry<String,Set<ServiceBO>> entry : thisServiceMap.entrySet()){
                            Set<ServiceBO> serviceBOSet = entry.getValue();
                            for(ServiceBO serviceBO : serviceBOSet){
                                if(serviceBO.getServiceName().equals(serviceName)){
                                    // 此方法存在消费者
                                    serviceBO.setIsConsumer(true);
                                }
                            }
                        }
                    }
                }
                consumerApplicationBO.setProvidersSet(providersSet);
                consumerApplicationBO.setIsConsumer(true);
                if(owners != null && consumerApplicationBO.getOwner().equals("")){
                    consumerApplicationBO.setOwner(owners);
                }
                if(organization != null && consumerApplicationBO.getOrganization().equals("")){
                    consumerApplicationBO.setOrganization(organization);
                }

            }
        }
*/}

    /* (non-Javadoc)
     * @see com.ants.monitor.biz.support.service.ApplicationDetailService#getApplicationConfigurators()
     */
    @Override
    public Map<String, ApplicationBO> getApplicationConfigurators() {
        Map<String, ApplicationBO> appMap = new HashMap<>();
        Map<String, Map<String, Set<URL>>> registry = registryContainer.getRegistryCache();
        Map<String, Set<URL>> forbidServices = registry.get(Constants.CONFIGURATORS_CATEGORY);
        if(MapUtils.isEmpty(forbidServices)) {
            return Collections.emptyMap();
        }
        Iterator<Map.Entry<String, Set<URL>>> forbidItr = forbidServices.entrySet().iterator();
        while(forbidItr.hasNext()) {
            Map.Entry<String, Set<URL>> forbidEntry = forbidItr.next();
            Set<URL> forbidUrl = forbidEntry.getValue();
            for(URL url : forbidUrl) {
                Set<HostBO> hostList = new HashSet<>();
            }
        }
        // TODO
        return Collections.emptyMap();
    }

}
