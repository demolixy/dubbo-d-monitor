package com.ants.monitor.bean.bizBean;


/**
 * Created by zxg on 16/7/4.
 * 14:18
 * no bug,以后改代码的哥们，祝你好运~！！
 * 方法排行榜的bo类
 */
public class MethodRankBO {
    //方法名
    public String methodName;
    //函数
    public String serviceName;
    //调用次数
    public Integer usedNum;
    /**
     * @return the methodName
     */
    public String getMethodName() {
        return methodName;
    }
    /**
     * @param methodName the methodName to set
     */
    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
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
     * @return the usedNum
     */
    public Integer getUsedNum() {
        return usedNum;
    }
    /**
     * @param usedNum the usedNum to set
     */
    public void setUsedNum(Integer usedNum) {
        this.usedNum = usedNum;
    }
    
    
}
