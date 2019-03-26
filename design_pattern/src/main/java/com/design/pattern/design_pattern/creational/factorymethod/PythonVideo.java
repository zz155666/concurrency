package com.design.pattern.design_pattern.creational.factorymethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PythonVideo extends Video {
    @Override
    public void produce() {
       log.info("python视频");
    }
}
