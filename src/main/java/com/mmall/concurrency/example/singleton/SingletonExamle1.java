package com.mmall.concurrency.example.singleton;

/**
 * 懒汉模式
 * 单例的使用在第一次使用的时候进行创建
 */
public class SingletonExamle1 {

    private SingletonExamle1(){

    }

    private static SingletonExamle1 instance=null;


    public static SingletonExamle1 getInstance(){
        if(instance==null){
            instance=new SingletonExamle1();
        }
        return instance;
    }

}
