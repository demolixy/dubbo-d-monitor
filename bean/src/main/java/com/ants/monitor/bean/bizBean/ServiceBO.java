package com.ants.monitor.bean.bizBean;

import java.util.Map;
import java.util.Set;

/**
 * services 的biz bean类
 * Created by zxg on 15/11/16.
 */
public class ServiceBO {

    private String serviceName;

    private Set<String> methods;

    private String owner;

    private Boolean isConsumer = false;

    // 若同个service 存在的方法不一样，则此service 出错
    private Boolean isWrong = false;

    //错误原因
    private String wrongReason;

    // ==================services.ftl 使用====================

    // 所属团队
    private String  organization ;

    // 所属的application
    private Set<String> ownerApp;

    //使用的app
    private Set<String> usedApp;

    //本地起了测试或线上，测试起了线上
    private Boolean isHostWrong = false;

    //每个method提供的host地址
    private Map<String,Set<HostBO>> methodsHost;

    //最后消费时间
    private String finalConsumerTime = "1997-01-01 00:00:00";

    /**
     * @return the serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * @param serviceName the serviceName to set
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * @return the methods
     */
    public Set<String> getMethods() {
        return methods;
    }

    /**
     * @param methods the methods to set
     */
    public void setMethods(Set<String> methods) {
        this.methods = methods;
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
     * @return the isWrong
     */
    public Boolean getIsWrong() {
        return isWrong;
    }

    /**
     * @param isWrong the isWrong to set
     */
    public void setIsWrong(Boolean isWrong) {
        this.isWrong = isWrong;
    }

    /**
     * @return the wrongReason
     */
    public String getWrongReason() {
        return wrongReason;
    }

    /**
     * @param wrongReason the wrongReason to set
     */
    public void setWrongReason(String wrongReason) {
        this.wrongReason = wrongReason;
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
     * @return the ownerApp
     */
    public Set<String> getOwnerApp() {
        return ownerApp;
    }

    /**
     * @param ownerApp the ownerApp to set
     */
    public void setOwnerApp(Set<String> ownerApp) {
        this.ownerApp = ownerApp;
    }

    /**
     * @return the usedApp
     */
    public Set<String> getUsedApp() {
        return usedApp;
    }

    /**
     * @param usedApp the usedApp to set
     */
    public void setUsedApp(Set<String> usedApp) {
        this.usedApp = usedApp;
    }

    /**
     * @return the isHostWrong
     */
    public Boolean getIsHostWrong() {
        return isHostWrong;
    }

    /**
     * @param isHostWrong the isHostWrong to set
     */
    public void setIsHostWrong(Boolean isHostWrong) {
        this.isHostWrong = isHostWrong;
    }

    /**
     * @return the methodsHost
     */
    public Map<String, Set<HostBO>> getMethodsHost() {
        return methodsHost;
    }

    /**
     * @param methodsHost the methodsHost to set
     */
    public void setMethodsHost(Map<String, Set<HostBO>> methodsHost) {
        this.methodsHost = methodsHost;
    }

    /**
     * @return the finalConsumerTime
     */
    public String getFinalConsumerTime() {
        return finalConsumerTime;
    }

    /**
     * @param finalConsumerTime the finalConsumerTime to set
     */
    public void setFinalConsumerTime(String finalConsumerTime) {
        this.finalConsumerTime = finalConsumerTime;
    }

    
    
}
