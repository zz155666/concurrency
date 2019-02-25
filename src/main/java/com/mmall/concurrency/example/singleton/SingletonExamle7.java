package com.mmall.concurrency.example.singleton;

/**
 * 枚举模式
 * 线程安全 推荐的做法
 */
public class SingletonExamle7 {

    private SingletonExamle7(){

    }

    public static SingletonExamle7 getInstance(){
        return Sinleton.INSTANCE.getInstance();
    }


    private enum Sinleton{
        INSTANCE;

        private SingletonExamle7 singleton;

        Sinleton(){
            singleton=new SingletonExamle7();
        }

        public SingletonExamle7 getInstance(){
            return singleton;
        }
    }

}
