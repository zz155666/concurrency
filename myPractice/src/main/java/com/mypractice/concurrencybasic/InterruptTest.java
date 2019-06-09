package com.mypractice.concurrencybasic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InterruptTest {

    static ThreadLocal<String> localVariable=new ThreadLocal<>();

    public static void main(String[] args) {

        Thread threadOne=new Thread(new Runnable() {
            @Override
            public void run() {
                for(;;){

                }
            }
        });

        threadOne.start();

        threadOne.interrupt();

        log.info("isInterrupted  "+threadOne.isInterrupted());

        log.info("isInterrupted  "+threadOne.interrupted());

        log.info("isInterrupted  "+Thread.interrupted());

        log.info("isInterrupted  "+threadOne.isInterrupted());

    }

}
