package com.mypractice.concurrencybasic;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.LockSupport;

@Slf4j
public class LockSupportTest {
    public static void main(String[] args) throws Exception {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                log.info("child thread begin park!");
                LockSupport.park();
                log.info("child thread unpark!");
            }
        });
        thread.start();
        Thread.sleep(1000);
        log.info("main thread begin unpark!");
        LockSupport.unpark(thread);
    }
}
