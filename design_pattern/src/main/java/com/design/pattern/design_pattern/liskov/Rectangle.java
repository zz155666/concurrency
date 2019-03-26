package com.design.pattern.design_pattern.liskov;

public class Rectangle implements Quadrangle {

    private long length;

    private long width;


    @Override
    public long getWidth() {
        return width;
    }

    @Override
    public long getLenth() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
