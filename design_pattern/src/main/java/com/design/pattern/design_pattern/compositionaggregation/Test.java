package com.design.pattern.design_pattern.compositionaggregation;

public class Test {
    public static void main(String[] args) {
        ProductDao dao=new ProductDao();
        dao.setDbConnection(new MySQL());
        dao.addProduct();
    }
}
