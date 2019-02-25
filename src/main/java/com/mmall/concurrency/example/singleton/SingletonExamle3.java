package com.mmall.concurrency.example.singleton;

import com.mmall.concurrency.annoations.NotRecommend;
import com.mmall.concurrency.annoations.ThreadSafe;

/**
 * 懒汉模式
 * 单例的使用在第一次使用的时候进行创建
 */
@ThreadSafe
@NotRecommend
public class SingletonExamle3 {

    private SingletonExamle3(){

    }

    private static SingletonExamle3 instance=null;


    public static synchronized SingletonExamle3 getInstance(){
        if(instance==null){
            instance=new SingletonExamle3();
        }
        return instance;
    }

}
