package com.design.pattern.design_pattern.openclose;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {
    public static void main(String[] args) {
        ICourse javaCource=new JavaDisCountCourse(96,"test",348d);
        log.info("课程id:{},课程名称:{},课程价格:{},课程原价:{}",
                javaCource.getId(),javaCource.getName(),
                javaCource.getPrice(),
                ((JavaDisCountCourse) javaCource).getOriginPrice());
    }
}
