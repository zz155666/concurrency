package com.mmall.concurrency.atomic;

import com.mmall.concurrency.annoations.NotThreadSafe;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.LongAdder;

/**
 * @ProjectName: concurrency
 * @Package: com.mmall.concurrency
 * @ClassName: ConcurrencyTest
 * @Description: java类作用描述
 * @Author: teerus
 * @CreateDate: 2019-02-23 15:20
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

@Slf4j
@NotThreadSafe
public class AtomicExample4 {

    private static AtomicReference<Integer> count=new AtomicReference<>(0);

    public static void main(String[] args) {
        count.compareAndSet(0,2);
        log.info("count:{}",count.get());
    }
}
