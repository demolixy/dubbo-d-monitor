package com.ants.monitor.bean.bizBean;

import java.util.Map;
import java.util.Set;

/**
 * app 的基础bizBean类
 * Created by zxg on 15/11/16.
 */
public class ApplicationBO {

    private String applicationName;

    private String owner = "";

    // 所属团队
    private String  organization;

    //提供服务的ip列表
    private Set<HostBO> hostList;

    //Service:online-test-local-wrong 四种类型
    private Map<String,Set<ServiceBO>> serviceMap;
//    private Set<ServiceBO> serviceSet;

    //providers
    private Set<String> providersSet;

    //consumers
    private Set<String> consumersSet;


    private Boolean isProvider = false;

    private Boolean isConsumer = false;


    //=========为前端服务
    private Integer serviceSum = 0;
    private Integer providerSum = 0;
    private Integer consumerSum = 0;
    /**
     * @return the applicationName
     */
    public String getApplicationName() {
        return applicationName;
    }
    /**
     * @param applicationName the applicationName to set
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    /**
     * @return the owner
     */
    public String getOwner() {
        return owner;
    }
    /**
     * @param owner the owner to set
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }
    /**
     * @return the organization
     */
    public String getOrganization() {
        return organization;
    }
    /**
     * @param organization the organization to set
     */
    public void setOrganization(String organization) {
        this.organization = organization;
    }
    /**
     * @return the hostList
     */
    public Set<HostBO> getHostList() {
        return hostList;
    }
    /**
     * @param hostList the hostList to set
     */
    public void setHostList(Set<HostBO> hostList) {
        this.hostList = hostList;
    }
    /**
     * @return the serviceMap
     */
    public Map<String, Set<ServiceBO>> getServiceMap() {
        return serviceMap;
    }
    /**
     * @param serviceMap the serviceMap to set
     */
    public void setServiceMap(Map<String, Set<ServiceBO>> serviceMap) {
        this.serviceMap = serviceMap;
    }
    /**
     * @return the providersSet
     */
    public Set<String> getProvidersSet() {
        return providersSet;
    }
    /**
     * @param providersSet the providersSet to set
     */
    public void setProvidersSet(Set<String> providersSet) {
        this.providersSet = providersSet;
    }
    /**
     * @return the consumersSet
     */
    public Set<String> getConsumersSet() {
        return consumersSet;
    }
    /**
     * @param consumersSet the consumersSet to set
     */
    public void setConsumersSet(Set<String> consumersSet) {
        this.consumersSet = consumersSet;
    }
    /**
     * @return the isProvider
     */
    public Boolean getIsProvider() {
        return isProvider;
    }
    /**
     * @param isProvider the isProvider to set
     */
    public void setIsProvider(Boolean isProvider) {
        this.isProvider = isProvider;
    }
    /**
     * @return the isConsumer
     */
    public Boolean getIsConsumer() {
        return isConsumer;
    }
    /**
     * @param isConsumer the isConsumer to set
     */
    public void setIsConsumer(Boolean isConsumer) {
        this.isConsumer = isConsumer;
    }
    /**
     * @return the serviceSum
     */
    public Integer getServiceSum() {
        return serviceSum;
    }
    /**
     * @param serviceSum the serviceSum to set
     */
    public void setServiceSum(Integer serviceSum) {
        this.serviceSum = serviceSum;
    }
    /**
     * @return the providerSum
     */
    public Integer getProviderSum() {
        return providerSum;
    }
    /**
     * @param providerSum the providerSum to set
     */
    public void setProviderSum(Integer providerSum) {
        this.providerSum = providerSum;
    }
    /**
     * @return the consumerSum
     */
    public Integer getConsumerSum() {
        return consumerSum;
    }
    /**
     * @param consumerSum the consumerSum to set
     */
    public void setConsumerSum(Integer consumerSum) {
        this.consumerSum = consumerSum;
    }

    

}
