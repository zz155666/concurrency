package com.mmall.concurrency.example.aqs;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j
public class CountDownLatchExample1 {

    final private static  int clientTotal=100;

    public static void main(String[] args)throws Exception {
        ExecutorService executorService= Executors.newCachedThreadPool();

        final CountDownLatch countDownLatch=new CountDownLatch(clientTotal);

        for (int i=0;i<clientTotal;i++){
            final int threadNum=i;
            executorService.execute(()->{
                try {
                    test(threadNum);
                }catch (Exception e){
                    log.error("exception",e);
                }finally {
                    countDownLatch.countDown();
                }
            });
        }
        countDownLatch.await();
        log.info("finish");
        executorService.shutdown();
    }

    private static void test(int threadNum) throws Exception{
        Thread.sleep(100);
        log.info("{}",threadNum);
        Thread.sleep(100);
    }
}
