package com.design.pattern.design_pattern.structural.adapter.objectadapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Adaptee {
    public void adapteeRequest(){
        log.info("被适配者的方法");
    }
}
