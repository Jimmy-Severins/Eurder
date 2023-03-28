package com.switchfully.Customer;

import com.switchfully.SecurityService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;
    private final SecurityService securityService;

    public CustomerController(CustomerService customerService, SecurityService securityService) {
        this.customerService = customerService;
        this.securityService = securityService;
    }

    @PostMapping(value="/create", consumes = "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Customer createCustomer(@RequestBody CreateCustomerDTO createCustomerDTO) {
        securityService.validateCustomer(createCustomerDTO);
        return customerService.createCustomer(createCustomerDTO);
    }
}
