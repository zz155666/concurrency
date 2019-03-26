package com.mmall.concurrency.javabasic.refilect;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @ProjectName: concurrency
 * @Package: com.mmall.concurrency.javabasic.refilect
 * @ClassName: RefilectSample
 * @Description: java类作用描述
 * @Author: teerus
 * @CreateDate: 2019-03-03 13:44
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Slf4j
public class RefilectSample {
    public static void main(String[] args) throws Exception {
        Class rc=Class.forName("com.mmall.concurrency.javabasic.refilect.Rebot");
        Rebot r=(Rebot)rc.newInstance();
        log.info("Class Nmae is {}",rc.getName());
        Method getHello=rc.getDeclaredMethod("getHello",String.class);
        getHello.setAccessible(true);
        Object result=getHello.invoke(r,"Bob");
        log.info("getHello result is {}",result);
        Method sayHi=rc.getMethod("sayHi",String.class);
        sayHi.invoke(r,"welcome");
        Field name=rc.getDeclaredField("name");
        name.setAccessible(true);
        name.set(r,"alice");
        sayHi.invoke(r,"welcome");
    }
}
