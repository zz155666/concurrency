package com.mmall.concurrency.example.singleton;

/**
 * 饿汉模式
 * 单例的类装载使用的时候进行创建
 */
public class SingletonExamle6 {

    private SingletonExamle6(){

    }



    private static SingletonExamle6 instance=null;


    static {
        instance=new SingletonExamle6();
    }

    public static SingletonExamle6 getInstance(){
        return instance;
    }

}
