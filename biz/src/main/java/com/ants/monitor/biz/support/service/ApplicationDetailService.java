/**
 * 
 */
package com.ants.monitor.biz.support.service;

import java.util.Map;

import com.ants.monitor.bean.bizBean.ApplicationBO;

/**
 * @author lixiangyang
 * 比父接口的粒度要小
 */
public interface ApplicationDetailService extends ApplicationService{

    Map<String, ApplicationBO> getApplicationsProvider();
    
    Map<String, ApplicationBO> getApplicationConsumers();
    
    Map<String, ApplicationBO> getApplicationConfigurators();
    
}
