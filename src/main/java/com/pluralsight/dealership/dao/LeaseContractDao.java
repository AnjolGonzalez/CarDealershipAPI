package com.pluralsight.dealership.dao;

import com.pluralsight.dealership.models.LeaseContract;

import java.util.List;

public interface LeaseContractDao {
    List<LeaseContract> getAll();
    LeaseContract getByID(int id);
    LeaseContract insertLeaseContract(LeaseContract leaseContract);
    void deleteLeaseContract(int id);

}
