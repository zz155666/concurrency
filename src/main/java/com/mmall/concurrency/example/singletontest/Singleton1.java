package com.mmall.concurrency.example.singletontest;

/**
 * @ProjectName: concurrency
 * @Package: com.mmall.concurrency.example.singletontest
 * @ClassName: Singleton1
 * @Description: java类作用描述
 * @Author: teerus
 * @CreateDate: 2019-03-25 21:50
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Singleton1 {
    private final static Singleton1 Instance=new Singleton1();

    private Singleton1(){}

    public static Singleton1 getInstance(){
        return Instance;
    }

}
