package com.design.pattern.design_pattern.creational.factorymethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class VideoFactory {

    public abstract Video getVideo();

//    public Video getVideo(Class c){
//        Video video=null;
//        try {
//            video= (Video) Class.forName(c.getName()).newInstance();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return video;
//    }

//    public Video getVideo(String type) throws Exception {
//        if("java".equalsIgnoreCase(type)){
//            return new JavaVideo();
//        }else if("python".equalsIgnoreCase(type)){
//            return new PythonVideo();
//        }else{
//            throw new Exception("type不合法");
//        }
//    }
}
