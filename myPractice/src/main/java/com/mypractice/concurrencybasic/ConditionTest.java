package com.mypractice.concurrencybasic;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 多个条件变量测试
 */
@Slf4j
public class ConditionTest {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock=new ReentrantLock();
        Condition condition=lock.newCondition();

        Condition condition12=lock.newCondition();

        Thread r1=new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();

                try{
                    log.info("begin to wait");
                    condition.await();
                    log.info("end wait");
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        });

        r1.start();

        Thread.sleep(3000);

        Thread r2=new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();

                try {
                    log.info("begin signal");
                    condition.signal();
                    condition12.await();
                    log.info("end signal");
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        });

        r2.start();

        Thread.sleep(3000);

        Thread r3=new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();

                try {
                    log.info("begin 2 signal");
                    condition12.signal();
                    log.info("end 2 signal");
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        });

        r3.start();

    }
}
