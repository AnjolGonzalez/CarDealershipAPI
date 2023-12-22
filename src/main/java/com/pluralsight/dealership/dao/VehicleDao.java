package com.pluralsight.dealership.dao;

import com.pluralsight.dealership.models.Vehicle;

import java.util.List;

public interface VehicleDao {
    List<Vehicle> getAll();
    Vehicle getByID(int id);
    Vehicle insertVehicle(Vehicle vehicle);
    void deleteVehicle(int id);
}
