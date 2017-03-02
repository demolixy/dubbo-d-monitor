/**
 * 
 */
package com.ants.monitor.biz.param;

/**
 * @author lixiangyang
 *
 */
public abstract class AbsParamCaller {

    
    protected Class<?> clz;
    
    public AbsParamCaller(Class<?> clz) {
        this.clz = clz;
    }
    
    abstract void call();
    
    protected void doCaller(AbsParamCaller caller){
        caller.call();
    }
    
}
