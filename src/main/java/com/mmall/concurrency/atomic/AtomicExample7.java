package com.mmall.concurrency.atomic;

import com.mmall.concurrency.annoations.NotThreadSafe;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @ProjectName: concurrency
 * @Package: com.mmall.concurrency
 * @ClassName: ConcurrencyTest
 * @Description: java类作用描述
 * @Author: teerus
 * @CreateDate: 2019-02-23 15:20
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

@Slf4j
@NotThreadSafe
public class AtomicExample7 {

    //请求总数
    public static  int clientTotal=5000;
    //同时并发执行的线程数
    public static  int threadTotal=50;

    private static AtomicBoolean ishappened=new AtomicBoolean(false);

    public static void main(String[] args) throws  Exception {

        ExecutorService executorService= Executors.newCachedThreadPool();
        final Semaphore semaphore=new Semaphore(threadTotal);
        final CountDownLatch countDownLatch=new CountDownLatch(clientTotal);
        for(int i=0;i<clientTotal;i++){
            executorService.execute(()->{
                try {
                    semaphore.acquire();
                    test();
                    semaphore.release();
                }catch (Exception e){
                    log.error("exception",e);
                }
                countDownLatch.countDown();
            });
        }
        countDownLatch.await();
        executorService.shutdown();
        log.info("ishappened:{}",ishappened.get());

    }

    private static void test(){
        if(ishappened.compareAndSet(false,true)){
            log.info("execute");
        }
    }
}
