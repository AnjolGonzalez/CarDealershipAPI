package com.pluralsight.dealership.dao;

import com.pluralsight.dealership.models.SalesContract;
import java.util.List;

public interface SalesContractDao {
    List<SalesContract> getAll();
    SalesContract getByID (int id);
    SalesContract insertSalesContract(SalesContract salesContract);
    void deleteSalesContract(int id);
}
