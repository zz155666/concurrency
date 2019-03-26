package com.mmall.concurrency.example.rateLimiter;

import com.google.common.util.concurrent.RateLimiter;
import lombok.extern.slf4j.Slf4j;

/**
 * @ProjectName: concurrency
 * @Package: com.mmall.concurrency.example.rateLimiter
 * @ClassName: RateLimiterExample1
 * @Description: java类作用描述
 * @Author: teerus
 * @CreateDate: 2019-03-02 21:58
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

@Slf4j
public class RateLimiterExample1 {

    private static RateLimiter rateLimiter=RateLimiter.create(5);

    public static void main(String[] args) {
        for(int index=0;index<100;index++){
            if(rateLimiter.tryAcquire()){
                handle(index);
            }
        }
    }

    private static void handle(int i){
        log.info("{}",i);
    }
}
