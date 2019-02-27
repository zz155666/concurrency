package com.mmall.concurrency.example.syncContainer;

import lombok.extern.slf4j.Slf4j;

import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

@Slf4j
public class VectorExample2 {

    private static Vector<Integer> list=new Vector<>();


    public static void main(String[] args) throws  Exception{
        for(int i=0;i<10;i++){
            list.add(i);
        }
        Thread thread1=new Thread(){
            public void run(){
                for(int i=0;i<10;i++){
                    list.remove(i);
                }
            }
        };
        Thread thread2=new Thread(){
            public void run(){
                for(int i=0;i<10;i++){
                    list.get(i);
                }
            }
        };
        thread1.start();
        thread2.start();
    }

    private static void update(int i){
        list.add(i);
    }

}
