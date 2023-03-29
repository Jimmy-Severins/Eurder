package com.switchfully.Customer;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CustomerService {

    public final CustomerRepository customerRepository;
    public final CustomerMapper customerMapper;

    public CustomerService(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    public Customer createCustomer(CreateCustomerDTO createCustomerDTO) {
        Customer customer = customerMapper.mapToCustomer(createCustomerDTO);
        return customerRepository.addCustomer(customer);
    }

    public List<CustomerDTO> getAllCustomers() {
        return customerMapper.mapToCustomerDTOList(customerRepository.getAllCustomers());
    }

    public CustomerDTO getCustomerById(UUID id){
        return customerRepository.getCustomerById(id)
                .map(customerMapper::mapToCustomerDTO)
                .orElse(null);
    }
}
