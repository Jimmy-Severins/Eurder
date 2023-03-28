package com.switchfully.Customer;

import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public Customer mapToCustomer(CreateCustomerDTO createCustomerDTO) {
        return new Customer(createCustomerDTO.getFirstName(), createCustomerDTO.getLastName(), createCustomerDTO.getEmailAddress(), createCustomerDTO.getAddress(), createCustomerDTO.getPhoneNumber());
    }

    public CreateCustomerDTO mapToCreateCustomerDTO(Customer customer) {
        return new CreateCustomerDTO(customer.getFirstName(), customer.getLastName(), customer.getEmailAddress(), customer.getAddress(), customer.getPhoneNumber());
    }
}
