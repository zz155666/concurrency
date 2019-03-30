package com.design.pattern.design_pattern.creational.prototype;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Mail implements Cloneable{
    private String name;
    private String content;
    public Mail(){
        log.info("开始构建");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        log.info("克隆");
        return super.clone();
    }
}
