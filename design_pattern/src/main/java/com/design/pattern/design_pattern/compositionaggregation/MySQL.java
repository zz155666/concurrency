package com.design.pattern.design_pattern.compositionaggregation;

public class MySQL extends DBConnection {
    @Override
    public String getConnection() {
        return "MySQL";
    }
}
