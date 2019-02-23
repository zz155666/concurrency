package com.mmall.concurrency.atomic;

import com.mmall.concurrency.annoations.NotThreadSafe;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReference;

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
public class AtomicExample5 {

    private static AtomicIntegerFieldUpdater<AtomicExample5> updater=AtomicIntegerFieldUpdater.newUpdater(AtomicExample5.class,"count");

    @Getter
    public volatile int count=100;

    private static AtomicExample5 example5=new AtomicExample5();

    public static void main(String[] args) {
        if(updater.compareAndSet(example5,100,120)){
            log.info("update success:{}",example5.getCount());
        }
        if(updater.compareAndSet(example5,100,120)){
            log.info("update success:{}",example5.getCount());
        }else{
            log.info("update failed:{}",example5.getCount());
        }
    }
}
