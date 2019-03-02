package com.mmall.concurrency.example.threadpool;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @ProjectName: concurrency
 * @Package: com.mmall.concurrency.example.threadpool
 * @ClassName: ThreadPoolExample1
 * @Description: java类作用描述
 * @Author: teerus
 * @CreateDate: 2019-03-01 22:37
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Slf4j
public class ThreadPoolExample4 {

    public static void main(String[] args) {
        ScheduledExecutorService executorService= Executors.newScheduledThreadPool(5);

        for (int i=0;i<10;i++){
            final int index=i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    log.info("task:{}",index);
                }
            });
        }
        executorService.schedule(new Runnable() {
            @Override
            public void run() {
                log.info("task");
            }
        },5, TimeUnit.SECONDS);

        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                log.info("scheduleAtFixedRate  task");
            }
        },1,3,TimeUnit.SECONDS);
     //   executorService.shutdown();
    }





}
