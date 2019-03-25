package com.mmall.concurrency.example.singletontest;

/**
 * @ProjectName: concurrency
 * @Package: com.mmall.concurrency.example.singletontest
 * @ClassName: LazySingleton
 * @Description: java类作用描述
 * @Author: teerus
 * @CreateDate: 2019-03-25 22:05
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class LazySingleton {

    private static LazySingleton lazySingleton=null;

    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if(lazySingleton==null){
            lazySingleton=new LazySingleton();
        }
        return lazySingleton;
    }
}
