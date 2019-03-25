package com.mmall.concurrency.cache;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;

/**
 * @ProjectName: concurrency
 * @Package: com.mmall.concurrency.cache
 * @ClassName: RedisConfig
 * @Description: java类作用描述
 * @Author: teerus
 * @CreateDate: 2019-03-02 18:46
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Configuration
public class RedisConfig {
    @Bean
    public JedisPool jedisPool(@Value("${jedis.host}") String host,@Value("${jedis.port}") int port){
        return new JedisPool(host,port);
    }
}
