package com.pluralsight.dealership.dao;

import javax.sql.DataSource;

public class JdbcVehicleDao implements VehicleDao{

    private final DataSource dataSource;

    public JdbcVehicleDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }







}
