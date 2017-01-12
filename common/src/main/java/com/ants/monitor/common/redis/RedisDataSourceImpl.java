package com.ants.monitor.common.redis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

import com.ants.monitor.common.tools.SpringContextsUtil;

/**
 * Created by zxg on 15/7/20.
 */
@Component
public class RedisDataSourceImpl implements RedisDataSource {

    private Log log = LogFactory.getLog(this.getClass());
    
    @Autowired
    private ShardedJedisPool shardedJedisPool;

    public ShardedJedis getRedisClient() {
        try {
            if(null == shardedJedisPool){
                shardedJedisPool = (ShardedJedisPool) SpringContextsUtil.getBean("shardedJedisPool");
            }
            ShardedJedis shardJedis = shardedJedisPool.getResource();
            return shardJedis;
        } catch (Exception e) {
             log.error("getRedisClent error", e);
        }
        return null;
    }

    @Override
    public void returnResource(ShardedJedis shardedJedis, boolean broken) {

        try {
            shardedJedis.close();
        } catch (BeansException e) {
            log.error("returnResource error", e);
        }
    }
}
