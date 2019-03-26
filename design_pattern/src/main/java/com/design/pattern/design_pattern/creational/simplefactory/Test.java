package com.design.pattern.design_pattern.creational.simplefactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory=new VideoFactory();
        try {
            Video video = videoFactory.getVideo(JavaVideo.class);
            video.produce();
        }catch (Exception e){
            log.error("发生错误",e);
        }


//        VideoFactory videoFactory=new VideoFactory();
//        try {
//            Video video = videoFactory.getVideo("java");
//            video.produce();
//        }catch (Exception e){
//            log.error("发生错误",e);
//        }
    }
}
