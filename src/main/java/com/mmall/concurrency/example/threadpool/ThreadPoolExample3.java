package com.mmall.concurrency.example.threadpool;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
public class ThreadPoolExample3 {

    public static void main(String[] args) {
        ExecutorService executorService= Executors.newSingleThreadExecutor();

        for (int i=0;i<10;i++){
            final int index=i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    log.info("task:{}",index);
                }
            });
        }
        executorService.shutdown();
    }





}
