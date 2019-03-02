package com.mmall.concurrency.example.aqs;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

@Slf4j
public class FutureTaskExample {

    static class MyCallable implements Callable<String>{

        @Override
        public String call() throws Exception {
            log.info("do");
            Thread.sleep(5000);
            return "Done";
        }
    }
    public static void main(String[] args) throws Exception {
        FutureTask<String> futureTask=new FutureTask<String>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                log.info("do");
                Thread.sleep(5000);
                return "Done";
            }
        });

        new Thread(futureTask).start();

        Thread.sleep(1000);

        String result=futureTask.get();

        log.info("done main{}",result);
    }
}
