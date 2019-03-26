package com.design.pattern.design_pattern.compositionaggregation;

public class Oracle extends DBConnection {
    @Override
    public String getConnection() {
        return "oracle";
    }
}
