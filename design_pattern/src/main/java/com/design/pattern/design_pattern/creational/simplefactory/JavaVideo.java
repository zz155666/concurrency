package com.design.pattern.design_pattern.creational.simplefactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JavaVideo extends Video {
    @Override
    public void produce() {
       log.info("java视频");
    }
}
