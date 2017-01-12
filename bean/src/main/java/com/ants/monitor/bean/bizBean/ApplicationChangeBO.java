package com.ants.monitor.bean.bizBean;

import java.io.Serializable;

/**
 * Created by zxg on 15/12/9.
 * 变更的app bo 类
 */
public class ApplicationChangeBO implements Serializable {

    private String host;

    private String port;

    private String appName;

    private String time;

    //类型
    private String category;

    // 所属团队
    private String  organization;

    private String hostString;

    /**执行的操作；insert／delete**/
    private String doType;

    public ApplicationChangeBO(){}
    public ApplicationChangeBO(String host,String port,String appName,String category,String organization){
        this.host = host;
        this.port = port;
        this.appName = appName;
        this.category = category;
        this.organization = organization;
    }

    public String getHostString(){
        if(port == null || port.equals("0")){
            return host;
        }
        return host+":"+port;
    }
    /**
     * @return the host
     */
    public String getHost() {
        return host;
    }
    /**
     * @param host the host to set
     */
    public void setHost(String host) {
        this.host = host;
    }
    /**
     * @return the port
     */
    public String getPort() {
        return port;
    }
    /**
     * @param port the port to set
     */
    public void setPort(String port) {
        this.port = port;
    }
    /**
     * @return the appName
     */
    public String getAppName() {
        return appName;
    }
    /**
     * @param appName the appName to set
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }
    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }
    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }
    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }
    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
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
     * @return the doType
     */
    public String getDoType() {
        return doType;
    }
    /**
     * @param doType the doType to set
     */
    public void setDoType(String doType) {
        this.doType = doType;
    }
    /**
     * @param hostString the hostString to set
     */
    public void setHostString(String hostString) {
        this.hostString = hostString;
    }

    
    
}
