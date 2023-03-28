package com.switchfully.Customer;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository {
    private List<Customer> customerList;
    public CustomerRepository() {
        this.customerList = new ArrayList<>();
    }
    public Customer addCustomer(Customer customer) {
        customerList.add(customer);
        return customer;
    }
}
