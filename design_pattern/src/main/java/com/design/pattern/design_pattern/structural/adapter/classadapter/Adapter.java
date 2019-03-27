package com.design.pattern.design_pattern.structural.adapter.classadapter;

public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}
