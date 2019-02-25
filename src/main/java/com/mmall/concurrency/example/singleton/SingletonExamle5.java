package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annoations.NotThreadSafe;

/**
 * 双重同步锁单例模式
 * 单例的使用在第一次使用的时候进行创建
 */
@NotThreadSafe
public class SingletonExamle5 {

    private SingletonExamle5(){

    }

    private volatile static SingletonExamle5 instance=null;


    public static SingletonExamle5 getInstance(){
        if(instance==null){//双重检测
            synchronized (SingletonExamle5.class){
                if(instance==null){
                    instance=new SingletonExamle5();
                }
            }

        }
        return instance;
    }

}
