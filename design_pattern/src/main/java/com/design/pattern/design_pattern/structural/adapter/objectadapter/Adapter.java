package com.design.pattern.design_pattern.structural.adapter.objectadapter;

public class Adapter  implements Target{
    private Adaptee adaptee=new Adaptee();
    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
