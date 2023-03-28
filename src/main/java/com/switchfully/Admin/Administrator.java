package com.switchfully.Admin;

import com.switchfully.Customer.Customer;

public class Administrator extends Customer {

    private final String password;

    public Administrator(String firstName, String lastName, String email, String password) {
        super(firstName, lastName, email, null, null);
        this.password = password;
    }
}
