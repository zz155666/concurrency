package com.mmall.concurrency.example.aqs;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ProjectName: concurrency
 * @Package: com.mmall.concurrency.example.aqs
 * @ClassName: CyclicBarrierExample1
 * @Description: java类作用描述
 * @Author: teerus
 * @CreateDate: 2019-02-28 21:39
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Slf4j
public class CyclicBarrierExample3 {

    private static CyclicBarrier barrier=new CyclicBarrier(5,()->{
        log.info("callback is runing");
    });

    public static void main(String[] args) throws Exception {
        ExecutorService exus= Executors.newCachedThreadPool();
        for(int i=0;i<10;i++){
            final int threadnum=i;
            Thread.sleep(1000);
            exus.execute(()->{
                try {
                    run(threadnum);
                }catch (Exception e){
                    log.error("exception",e);
                }
            });
        }
        exus.shutdown();
    }

    private static void run(int threadnum) throws Exception{
        Thread.sleep(1000);
        log.info("{} is read",threadnum);
        barrier.await();
        log.info("{} continue",threadnum);
    }

}


