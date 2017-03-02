/**
 * 
 */
package com.ants.monitor.biz.dubboService.rpc;

import java.net.InetSocketAddress;

import com.alibaba.dubbo.common.Parameters;
import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.remoting.ChannelHandler;
import com.alibaba.dubbo.remoting.Client;
import com.alibaba.dubbo.remoting.RemotingException;

/**
 * @author lixiangyang
 *
 */
public class DubboClient implements Client {

    
    
    
    private URL url;
    
    public DubboClient(URL url) {
        this.url = url;
    }
    
    /* (non-Javadoc)
     * @see com.alibaba.dubbo.remoting.Endpoint#getUrl()
     */
    @Override
    public URL getUrl() {
        return url;
    }

    /* (non-Javadoc)
     * @see com.alibaba.dubbo.remoting.Endpoint#getChannelHandler()
     */
    @Override
    public ChannelHandler getChannelHandler() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.alibaba.dubbo.remoting.Endpoint#getLocalAddress()
     */
    @Override
    public InetSocketAddress getLocalAddress() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.alibaba.dubbo.remoting.Endpoint#send(java.lang.Object)
     */
    @Override
    public void send(Object message) throws RemotingException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see com.alibaba.dubbo.remoting.Endpoint#send(java.lang.Object, boolean)
     */
    @Override
    public void send(Object message, boolean sent) throws RemotingException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see com.alibaba.dubbo.remoting.Endpoint#close()
     */
    @Override
    public void close() {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see com.alibaba.dubbo.remoting.Endpoint#close(int)
     */
    @Override
    public void close(int timeout) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see com.alibaba.dubbo.remoting.Endpoint#isClosed()
     */
    @Override
    public boolean isClosed() {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see com.alibaba.dubbo.remoting.Channel#getRemoteAddress()
     */
    @Override
    public InetSocketAddress getRemoteAddress() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.alibaba.dubbo.remoting.Channel#isConnected()
     */
    @Override
    public boolean isConnected() {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see com.alibaba.dubbo.remoting.Channel#hasAttribute(java.lang.String)
     */
    @Override
    public boolean hasAttribute(String key) {
        // TODO Auto-generated method stub
        return false;
    }

    /* (non-Javadoc)
     * @see com.alibaba.dubbo.remoting.Channel#getAttribute(java.lang.String)
     */
    @Override
    public Object getAttribute(String key) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.alibaba.dubbo.remoting.Channel#setAttribute(java.lang.String, java.lang.Object)
     */
    @Override
    public void setAttribute(String key, Object value) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see com.alibaba.dubbo.remoting.Channel#removeAttribute(java.lang.String)
     */
    @Override
    public void removeAttribute(String key) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see com.alibaba.dubbo.common.Resetable#reset(com.alibaba.dubbo.common.URL)
     */
    @Override
    public void reset(URL url) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see com.alibaba.dubbo.remoting.Client#reconnect()
     */
    @Override
    public void reconnect() throws RemotingException {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see com.alibaba.dubbo.remoting.Client#reset(com.alibaba.dubbo.common.Parameters)
     */
    @Override
    public void reset(Parameters parameters) {
        // TODO Auto-generated method stub
        
    }

}
