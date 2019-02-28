package com.mmall.concurrency.example.aqs;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

@Slf4j
public class SemaphoreExample2 {

    final private static  int clientTotal=20;

    public static void main(String[] args)throws Exception {
        ExecutorService executorService= Executors.newCachedThreadPool();

        final Semaphore semaphore=new Semaphore(4);

        for (int i=0;i<clientTotal;i++){
            final int threadNum=i;
            executorService.execute(()->{
                try {
                    semaphore.acquire(3);
                    test(threadNum);
                    semaphore.release(3);
                }catch (Exception e){
                    log.error("exception",e);
                }
            });
        }
        log.info("finish");
        executorService.shutdown();
    }

    private static void test(int threadNum) throws Exception{
        log.info("{}",threadNum);
        Thread.sleep(1000);
    }
}
