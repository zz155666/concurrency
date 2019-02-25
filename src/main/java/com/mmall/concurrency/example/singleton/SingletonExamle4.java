package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annoations.NotThreadSafe;

/**
 * 双重同步锁单例模式
 * 单例的使用在第一次使用的时候进行创建
 */
@NotThreadSafe
public class SingletonExamle4 {

    private SingletonExamle4(){

    }

    private static SingletonExamle4 instance=null;


    public static SingletonExamle4 getInstance(){
        if(instance==null){//双重检测
            synchronized (SingletonExamle4.class){
                if(instance==null){
                    instance=new SingletonExamle4();
                }
            }

        }
        return instance;
    }

}
