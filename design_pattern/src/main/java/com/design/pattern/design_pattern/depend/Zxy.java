package com.design.pattern.design_pattern.depend;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Zxy {
    public void studyJavaCourse(){
        log.info("zxy在学习java");
    }
    public void studyFECourse(){
        log.info("zxy在学习前端");
    }

    public void study(ICourse iCourse){
        iCourse.studyCourse();
    }
}

