package com.mmall.concurrency.sync;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ProjectName: concurrency
 * @Package: com.mmall.concurrency.sync
 * @ClassName: SynchronizedExample1
 * @Description: java类作用描述
 * @Author: teerus
 * @CreateDate: 2019-02-23 21:08
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

@Slf4j
public class SynchronizedExample1 {

    //修饰一个代码块
    public void test1(){
        synchronized (this){
            for(int i=0;i<10;i++){
                log.info("test1-{}",i);
            }
        }
    }

    //修饰一个方法
    public synchronized void test2(){
        for(int i=0;i<10;i++){
            log.info("test2-{}",i);
        }
    }

    public static void main(String[] args) {
        SynchronizedExample1 example1=new SynchronizedExample1();
        ExecutorService executorService= Executors.newCachedThreadPool();
        executorService.execute(()->{
            example1.test1();
        });
        executorService.execute(()->{
            example1.test1();
        });
    }
}
