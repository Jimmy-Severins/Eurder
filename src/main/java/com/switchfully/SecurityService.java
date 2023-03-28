package com.switchfully;

import com.switchfully.Admin.Administrator;
import com.switchfully.Customer.CreateCustomerDTO;
import com.switchfully.Customer.CustomerRepository;
import com.switchfully.Exceptions.InvalidAmountException;
import com.switchfully.Exceptions.InvalidPriceException;
import com.switchfully.Exceptions.MandatoryFieldException;
import com.switchfully.Exceptions.UnauthorizedException;
import com.switchfully.Item.CreateItemDTO;
import org.springframework.stereotype.Service;

@Service
public class SecurityService {

    private final CustomerRepository customerRepository;

    public SecurityService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void validateCustomer(CreateCustomerDTO createCustomerDTO) {
        if (createCustomerDTO.getFirstName().isEmpty() || createCustomerDTO.getLastName().isEmpty() || createCustomerDTO.getEmailAddress().isEmpty() || createCustomerDTO.getPhoneNumber().isEmpty()) {
            throw new MandatoryFieldException("Customer information is incomplete");
        }
    }
    
    public void validateItem(CreateItemDTO createItemDTO) {
        if (createItemDTO.getName().isEmpty() || createItemDTO.getDescription().isEmpty()) {
            throw new MandatoryFieldException("Item information is incomplete");
        }
        if (createItemDTO.getPrice() <= -0.1) {
            throw new InvalidPriceException("Price can not be lower than zero");
        }
        if(createItemDTO.getStockAmount() < 0) {
            throw new InvalidAmountException("Amount must be greater than or equal to 0");
        }
    }
}


