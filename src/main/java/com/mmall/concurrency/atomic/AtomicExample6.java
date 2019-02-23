package com.mmall.concurrency.atomic;

import com.mmall.concurrency.annoations.NotThreadSafe;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicStampedReference;

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
public class AtomicExample6 {

    private  static AtomicStampedReference<Integer> atomicStampedReference=new AtomicStampedReference<>(0,0);

    @Getter
    public volatile int count=100;

    public static void main(String[] args) {
        atomicStampedReference.compareAndSet(0,1,0,1);
        log.info("count:{}",atomicStampedReference.getReference());
        log.info("stamp:{}",atomicStampedReference.getStamp());
    }
}
