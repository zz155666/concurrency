package com.design.pattern.design_pattern.creational.abstractfactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JavaArticle extends Article {
    @Override
    public void produce() {
        log.info("java手记");
    }
}
