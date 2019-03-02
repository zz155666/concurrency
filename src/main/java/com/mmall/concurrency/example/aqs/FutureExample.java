package com.mmall.concurrency.example.aqs;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Slf4j
public class FutureExample {

    static class MyCallable implements Callable<String>{

        @Override
        public String call() throws Exception {
            log.info("do");
            Thread.sleep(5000);
            return "Done";
        }
    }
    public static void main(String[] args) throws Exception {
        ExecutorService executorService= Executors.newCachedThreadPool();
        Future<String> future=executorService.submit(new MyCallable());
        log.info("do main");
        String result=future.get();
        log.info("done main{}",result);
        executorService.shutdown();
    }
}
