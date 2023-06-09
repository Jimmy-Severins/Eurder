package com.switchfully.Customer;

import com.switchfully.Address;

import java.util.UUID;

public class CreateCustomerDTO {

    private String firstName;
    private String lastName;
    private String emailAddress;
    private Address address;
    private String phoneNumber;

    private UUID id;


    public CreateCustomerDTO(String firstName, String lastName, String emailAddress, Address address, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.address = address;
        this.phoneNumber = phoneNumber;
        id = UUID.randomUUID();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public Address getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
}
