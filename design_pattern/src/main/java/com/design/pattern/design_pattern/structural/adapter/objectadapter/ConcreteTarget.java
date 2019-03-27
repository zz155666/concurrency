package com.design.pattern.design_pattern.structural.adapter.objectadapter;

import com.design.pattern.design_pattern.structural.adapter.classadapter.Target;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        log.info("ConcreteTarget目标方法");
    }
}
