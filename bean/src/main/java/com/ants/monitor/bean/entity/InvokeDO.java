package com.ants.monitor.bean.entity;

import java.util.Date;

public class InvokeDO {
    private String uuId;

    private String application;

    private String appType;

    private String service;

    private String method;

    private String consumerHost;

    private String consumerPort;

    private String providerHost;

    private String providerPort;

    private Integer success;

    private Integer failure;

    private Integer elapsed;

    private Integer concurrent;

    private Integer maxElapsed;

    private Integer maxConcurrent;

    private String invokeDate;

    private String invokeHour;

    private Long invokeTime;

    private Date gmtCreate;

    /**
     * @return the uuId
     */
    public String getUuId() {
        return uuId;
    }

    /**
     * @param uuId the uuId to set
     */
    public void setUuId(String uuId) {
        this.uuId = uuId;
    }

    /**
     * @return the application
     */
    public String getApplication() {
        return application;
    }

    /**
     * @param application the application to set
     */
    public void setApplication(String application) {
        this.application = application;
    }

    /**
     * @return the appType
     */
    public String getAppType() {
        return appType;
    }

    /**
     * @param appType the appType to set
     */
    public void setAppType(String appType) {
        this.appType = appType;
    }

    /**
     * @return the service
     */
    public String getService() {
        return service;
    }

    /**
     * @param service the service to set
     */
    public void setService(String service) {
        this.service = service;
    }

    /**
     * @return the method
     */
    public String getMethod() {
        return method;
    }

    /**
     * @param method the method to set
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * @return the consumerHost
     */
    public String getConsumerHost() {
        return consumerHost;
    }

    /**
     * @param consumerHost the consumerHost to set
     */
    public void setConsumerHost(String consumerHost) {
        this.consumerHost = consumerHost;
    }

    /**
     * @return the consumerPort
     */
    public String getConsumerPort() {
        return consumerPort;
    }

    /**
     * @param consumerPort the consumerPort to set
     */
    public void setConsumerPort(String consumerPort) {
        this.consumerPort = consumerPort;
    }

    /**
     * @return the providerHost
     */
    public String getProviderHost() {
        return providerHost;
    }

    /**
     * @param providerHost the providerHost to set
     */
    public void setProviderHost(String providerHost) {
        this.providerHost = providerHost;
    }

    /**
     * @return the providerPort
     */
    public String getProviderPort() {
        return providerPort;
    }

    /**
     * @param providerPort the providerPort to set
     */
    public void setProviderPort(String providerPort) {
        this.providerPort = providerPort;
    }

    /**
     * @return the success
     */
    public Integer getSuccess() {
        return success;
    }

    /**
     * @param success the success to set
     */
    public void setSuccess(Integer success) {
        this.success = success;
    }

    /**
     * @return the failure
     */
    public Integer getFailure() {
        return failure;
    }

    /**
     * @param failure the failure to set
     */
    public void setFailure(Integer failure) {
        this.failure = failure;
    }

    /**
     * @return the elapsed
     */
    public Integer getElapsed() {
        return elapsed;
    }

    /**
     * @param elapsed the elapsed to set
     */
    public void setElapsed(Integer elapsed) {
        this.elapsed = elapsed;
    }

    /**
     * @return the concurrent
     */
    public Integer getConcurrent() {
        return concurrent;
    }

    /**
     * @param concurrent the concurrent to set
     */
    public void setConcurrent(Integer concurrent) {
        this.concurrent = concurrent;
    }

    /**
     * @return the maxElapsed
     */
    public Integer getMaxElapsed() {
        return maxElapsed;
    }

    /**
     * @param maxElapsed the maxElapsed to set
     */
    public void setMaxElapsed(Integer maxElapsed) {
        this.maxElapsed = maxElapsed;
    }

    /**
     * @return the maxConcurrent
     */
    public Integer getMaxConcurrent() {
        return maxConcurrent;
    }

    /**
     * @param maxConcurrent the maxConcurrent to set
     */
    public void setMaxConcurrent(Integer maxConcurrent) {
        this.maxConcurrent = maxConcurrent;
    }

    /**
     * @return the invokeDate
     */
    public String getInvokeDate() {
        return invokeDate;
    }

    /**
     * @param invokeDate the invokeDate to set
     */
    public void setInvokeDate(String invokeDate) {
        this.invokeDate = invokeDate;
    }

    /**
     * @return the invokeHour
     */
    public String getInvokeHour() {
        return invokeHour;
    }

    /**
     * @param invokeHour the invokeHour to set
     */
    public void setInvokeHour(String invokeHour) {
        this.invokeHour = invokeHour;
    }

    /**
     * @return the invokeTime
     */
    public Long getInvokeTime() {
        return invokeTime;
    }

    /**
     * @param invokeTime the invokeTime to set
     */
    public void setInvokeTime(Long invokeTime) {
        this.invokeTime = invokeTime;
    }

    /**
     * @return the gmtCreate
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * @param gmtCreate the gmtCreate to set
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
    
    
}