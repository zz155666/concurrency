package com.mmall.publish;

import lombok.extern.slf4j.Slf4j;

/**
 * @ProjectName: concurrency
 * @Package: com.mmall.publish
 * @ClassName: Escape
 * @Description: java类作用描述
 * @Author: teerus
 * @CreateDate: 2019-02-24 23:50
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

@Slf4j
public class Escape {

    private int thisCanBeEscape=0;

    public Escape(){
        new InnerClass();
    }

    private class InnerClass{
        public InnerClass(){
            log.info("{}",Escape.this.thisCanBeEscape);
        }
    }

    public static void main(String[] args) {
        new Escape();
    }
}
