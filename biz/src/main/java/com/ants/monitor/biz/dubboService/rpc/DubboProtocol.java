/**
 * 
 */
package com.ants.monitor.biz.dubboService.rpc;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.rpc.Exporter;
import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.Protocol;
import com.alibaba.dubbo.rpc.RpcException;

/**
 * @author lixiangyang
 *
 */
public class DubboProtocol implements Protocol {

    /* (non-Javadoc)
     * @see com.alibaba.dubbo.rpc.Protocol#getDefaultPort()
     */
    @Override
    public int getDefaultPort() {
        // TODO Auto-generated method stub
        return 0;
    }

    /* (non-Javadoc)
     * @see com.alibaba.dubbo.rpc.Protocol#export(com.alibaba.dubbo.rpc.Invoker)
     */
    @Override
    public <T> Exporter<T> export(Invoker<T> invoker) throws RpcException {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.alibaba.dubbo.rpc.Protocol#refer(java.lang.Class, com.alibaba.dubbo.common.URL)
     */
    @Override
    public <T> Invoker<T> refer(Class<T> type, URL url) throws RpcException {
        return null;
    }

    /* (non-Javadoc)
     * @see com.alibaba.dubbo.rpc.Protocol#destroy()
     */
    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        
    }

}
