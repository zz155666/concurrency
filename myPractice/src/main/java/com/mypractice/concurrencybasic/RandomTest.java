package com.mypractice.concurrencybasic;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.LockSupport;

@Slf4j
public class RandomTest {

    public static void main(String[] args) {
//        Random random=new Random();
//
//        for(int i=0;i<10;i++){
//            log.info(random.nextInt(5)+"");
//        }

        ThreadLocalRandom random=ThreadLocalRandom.current();

     //   CopyOnWriteArrayList

        for(int i=0;i<10;++i){
            log.info(random.nextInt(5)+"");
        }

      //  LongAdder

    }

}
