package com.mmall.concurrency.cache;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * @ProjectName: concurrency
 * @Package: com.mmall.concurrency.cache
 * @ClassName: GuavaCacheExample1
 * @Description: java类作用描述
 * @Author: teerus
 * @CreateDate: 2019-03-02 18:23
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

@Slf4j
public class GuavaCacheExample2 {

    public static void main(String[] args) {
        Cache<String,Integer> cache= CacheBuilder.newBuilder()
                .maximumSize(10)
                .expireAfterWrite(10, TimeUnit.SECONDS)
                .recordStats()
                .build();

        log.info("{}",cache.getIfPresent("key1"));
        cache.put("key1",1);
        log.info("{}",cache.getIfPresent("key1"));
        cache.invalidate("key1");
        log.info("{}",cache.getIfPresent("key1"));

        try{
            log.info("{}",cache.get("key2", new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    return -1;
                }
            }));
            cache.put("key2",2);
            log.info("{}",cache.get("key2", new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    return -1;
                }
            }));

            log.info("缓存数量：{}",cache.size());

            for(int i=3;i<13;i++){
                cache.put("key"+i,i);
            }
            log.info("缓存数量：{}",cache.size());

            log.info("{}",cache.getIfPresent("key2"));

            Thread.sleep(11000);

            log.info("{}",cache.get("key5", new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    return -1;
                }
            }));

            log.info("数：{},{}",cache.stats().hitCount(),cache.stats().missCount());

            log.info("率：{},{}",cache.stats().hitRate(),cache.stats().missRate());
        }catch (Exception e){
            log.error("exception",e);
        }

    }
}
