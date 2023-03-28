package com.switchfully.Customer;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public CustomerService(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    public Customer createCustomer(CreateCustomerDTO createCustomerDTO) {
        Customer customer = customerMapper.mapToCustomer(createCustomerDTO);
        return customerRepository.addCustomer(customer);
    }
}
