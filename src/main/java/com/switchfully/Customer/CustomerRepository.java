package com.switchfully.Customer;

import com.switchfully.Address;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class CustomerRepository {
    public List<Customer> customerList;
    public CustomerRepository() {
        this.customerList = new ArrayList<>();
    }
    public Customer addCustomer(Customer customer) {
        customerList.add(customer);
        return customer;
    }
    public List<Customer> getAllCustomers() {
        return customerList;
    }

    public Optional<Customer> getCustomerById(UUID id) {
        return customerList.stream()
                .filter(customer -> customer.getId().equals(id))
                .findFirst();
    }
}
