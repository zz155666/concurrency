package com.mmall.concurrency.example.concurrent;

import lombok.extern.slf4j.Slf4j;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.*;

@Slf4j
public class ConcurrentHashmapExample {

    private static Map<Integer,Integer> map=new ConcurrentHashMap<>();

    public static  int clientTotal=1000;
    //同时并发执行的线程数
    public static  int threadTotal=50;


    public static void main(String[] args) throws  Exception{
        ExecutorService executorService= Executors.newCachedThreadPool();
        final Semaphore semaphore=new Semaphore(threadTotal);
        final CountDownLatch countDownLatch=new CountDownLatch(clientTotal);
        for(int i=0;i<clientTotal;i++){
            final int count=i;
            executorService.execute(()->{
                try {
                    semaphore.acquire();
                    update(count);
                    semaphore.release();
                }catch (Exception e){
                    log.error("exception",e);
                }
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        executorService.shutdown();
        log.info("count:{}",map.size());
    }

    private static void update(int i){
        map.put(i,i);
    }

}
