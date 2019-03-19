package com.design.pattern.design_pattern.depend;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        log.info("zxy在学习java");
    }
}
