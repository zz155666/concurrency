package com.mmall.concurrency.javabasic.refilect;

import lombok.extern.slf4j.Slf4j;

/**
 * @ProjectName: concurrency
 * @Package: com.mmall.concurrency.javabasic
 * @ClassName: Rebot
 * @Description: java类作用描述
 * @Author: teerus
 * @CreateDate: 2019-03-03 13:38
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Slf4j
public class Rebot {
    private String name;

    public void sayHi(String con){
        log.info("{} say {}",con,name);
    }

    private String getHello(String con){
        return "Hello+"+con;
    }

}
