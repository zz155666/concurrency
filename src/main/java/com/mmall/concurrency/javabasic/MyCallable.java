package com.mmall.concurrency.javabasic;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;


/**
 * @ProjectName: concurrency
 * @Package: com.mmall.concurrency.javabasic
 * @ClassName: MyCallable
 * @Description: java类作用描述
 * @Author: teerus
 * @CreateDate: 2019-03-03 20:37
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Slf4j
public class MyCallable implements Callable<String> {
    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public String call() throws Exception {
        String value="test";
        log.info("ready to work");
        Thread.currentThread().sleep(5000);
        log.info("task done");
        return value;
    }
}
