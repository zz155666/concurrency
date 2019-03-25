package com.mmall.concurrency.javabasic;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @ProjectName: concurrency
 * @Package: com.mmall.concurrency.javabasic
 * @ClassName: FutureTaskDemo
 * @Description: java类作用描述
 * @Author: teerus
 * @CreateDate: 2019-03-03 20:42
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Slf4j
public class FutureTaskDemo{

    public static void main(String[] args)   throws Exception {
        FutureTask<String> futureTask=new FutureTask<String>(new MyCallable());
        new Thread(futureTask).start();
        log.info("{}",futureTask.get());
    }


}
