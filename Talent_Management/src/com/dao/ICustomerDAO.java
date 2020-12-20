package com.dao;
import com.po.Customer;

public interface ICustomerDAO {
    void save(Customer transientInstance);
}
