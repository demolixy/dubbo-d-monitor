/**
 * 
 */
package com.ants.monitor.biz.param;

/**
 * @author lixiangyang
 *
 */
public interface IParamTranslate<S, D> {

    
    D translate(S src);
    
}
