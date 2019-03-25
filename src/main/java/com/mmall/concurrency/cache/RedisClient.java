package com.mmall.concurrency.cache;

import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;

/**
 * @ProjectName: concurrency
 * @Package: com.mmall.concurrency.cache
 * @ClassName: RedisClient
 * @Description: java类作用描述
 * @Author: teerus
 * @CreateDate: 2019-03-02 18:53
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Component
public class RedisClient {

    @Resource(name="JedisPool")
    private JedisPool jedisPool;


    public void set(String key,String value) throws Exception{
        Jedis jedis=null;
        try {
            jedis=jedisPool.getResource();
            jedis.set(key,value);
        }finally {
            if(jedis!=null){
                jedis.close();
            }
        }
    }

    public String get(String key) throws Exception{
        Jedis jedis=null;
        try {
            jedis=jedisPool.getResource();
           return jedis.get(key);
        }finally {
            if(jedis!=null){
                jedis.close();
            }
        }
    }

}
