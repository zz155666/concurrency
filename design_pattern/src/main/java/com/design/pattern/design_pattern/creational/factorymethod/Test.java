package com.design.pattern.design_pattern.creational.factorymethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory=new JavaVideoFactory();
        Video video=videoFactory.getVideo();

        video.produce();
    }
}
