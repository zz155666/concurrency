package com.design.pattern.design_pattern.mianshi;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class b extends  a {
    static {
        log.info("我开始创建了b");
    }

    {
        log.info("我开始执行了b");
    }

    public b(){
        log.info("我开始构造了b");
    }

    @Override
    public void doab() {
        super.doab();
        log.info("我开始doabb");
    }

    public static void main(String[] args) {
        b b=new b();
        b.doab();
    }
}
