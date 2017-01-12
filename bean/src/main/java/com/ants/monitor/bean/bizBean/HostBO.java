package com.ants.monitor.bean.bizBean;

import java.util.Set;

/**
 * Created by zxg on 15/11/17.
 */
public class HostBO {
    private String host;
    private String port;

    public HostBO(){}
    public HostBO(String host, String port) {
        this.host = host;
        this.port = port;
    }

    private String hostString;

    public String getHostString(){
        if(port == null){
            return host;
        }
        return host+":"+port;
    }


    //======host 页面展示所用====
    Set<String> providers;
    Set<String> consumers;

    //服务名--即dba定义的该ip地址的名称
    String hostName;
    //对应的另外一个ip
    String anotherIp;

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
     * @return the providers
     */
    public Set<String> getProviders() {
        return providers;
    }
    /**
     * @param providers the providers to set
     */
    public void setProviders(Set<String> providers) {
        this.providers = providers;
    }
    /**
     * @return the consumers
     */
    public Set<String> getConsumers() {
        return consumers;
    }
    /**
     * @param consumers the consumers to set
     */
    public void setConsumers(Set<String> consumers) {
        this.consumers = consumers;
    }
    /**
     * @return the hostName
     */
    public String getHostName() {
        return hostName;
    }
    /**
     * @param hostName the hostName to set
     */
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }
    /**
     * @return the anotherIp
     */
    public String getAnotherIp() {
        return anotherIp;
    }
    /**
     * @param anotherIp the anotherIp to set
     */
    public void setAnotherIp(String anotherIp) {
        this.anotherIp = anotherIp;
    }
    /**
     * @param hostString the hostString to set
     */
    public void setHostString(String hostString) {
        this.hostString = hostString;
    }
    
}
