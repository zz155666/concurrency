package com.design.pattern.design_pattern.mianshi;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class a {
    static {
        log.info("我开始创建了a");
    }

    {
        log.info("我开始执行了a");
    }

    public a(){
        log.info("我开始构造了a");
    }

   public void doab(){
        log.info("我开始doaba");
    }
}
