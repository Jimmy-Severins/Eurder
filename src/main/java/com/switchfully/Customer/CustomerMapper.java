package com.switchfully.Customer;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerMapper {

    public Customer mapToCustomer(CreateCustomerDTO createCustomerDTO) {
        Customer customer = new Customer(createCustomerDTO.getFirstName(), createCustomerDTO.getLastName(), createCustomerDTO.getEmailAddress(), createCustomerDTO.getAddress(), createCustomerDTO.getPhoneNumber());
        customer.setId(createCustomerDTO.getId());
        return customer;
    }

    public CreateCustomerDTO mapToCreateCustomerDTO(Customer customer) {
        CreateCustomerDTO createCustomerDTO = new CreateCustomerDTO(customer.getFirstName(), customer.getLastName(), customer.getEmailAddress(), customer.getAddress(), customer.getPhoneNumber());
        createCustomerDTO.setId(customer.getId());
        return createCustomerDTO;
    }

    public List<CustomerDTO> mapToCustomerDTOList(List<Customer> customerList) {
        return customerList.stream()
                .map(this::mapToCustomerDTO)
                .toList();
    }
    public CustomerDTO mapToCustomerDTO(Customer customer) {
        return new CustomerDTO(customer.getFirstName(), customer.getLastName(), customer.getEmailAddress(), customer.getAddress(), customer.getPhoneNumber(), customer.getId());
    }
}
