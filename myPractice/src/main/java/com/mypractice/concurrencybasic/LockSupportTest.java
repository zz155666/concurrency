package com.mypractice.concurrencybasic;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.locks.LockSupport;

@Slf4j
public class LockSupportTest {
    public static void main(String[] args) throws Exception {
        Thread thread =new Thread(new Runnable() {
            @Override
            public void run() {
                log.info("child thread begin park!");
                while (!Thread.currentThread().isInterrupted()){
                    log.info("child thread begin park!1");
                    LockSupport.park();
                    log.info("child thread begin park!2");
                }
                log.info("child thread begin unpark!");
            }
        });

        thread.start();

        Thread.sleep(3000);

        log.info("main thread begin unpark!");

        thread.interrupt();

    }
}
