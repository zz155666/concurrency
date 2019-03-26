package com.design.pattern.design_pattern.compositionaggregation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProductDao  {

    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct(){
        String conn=dbConnection.getConnection();
        log.info("使用"+conn);
    }
}
