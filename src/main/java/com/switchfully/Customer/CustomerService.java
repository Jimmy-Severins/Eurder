package com.switchfully.Customer;

import com.switchfully.Exceptions.UserNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
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

    public Customer getCustomerById(UUID id) {
        return customerRepository.getCustomerById(id).orElseThrow(UserNotFoundException::new);
    }

    public CustomerDTO getCustomerDTOById(UUID id) {
        return Optional.ofNullable(customerMapper.mapToCustomerDTO(getCustomerById(id)))
                .orElseThrow(UserNotFoundException::new)
                ;
    }

}
