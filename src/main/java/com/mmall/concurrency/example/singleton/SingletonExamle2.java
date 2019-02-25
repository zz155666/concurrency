package com.mmall.concurrency.example.singleton;

import org.hibernate.validator.internal.util.stereotypes.ThreadSafe;

/**
 * 饿汉模式
 * 单例的类装载使用的时候进行创建
 */
public class SingletonExamle2 {

    private SingletonExamle2(){

    }

    private static SingletonExamle2 instance=new SingletonExamle2();


    public static SingletonExamle2 getInstance(){
        return instance;
    }

}
