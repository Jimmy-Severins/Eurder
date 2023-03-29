package com.switchfully.Customer;

import com.switchfully.Address;
import com.switchfully.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Customer {

    private final String firstName;
    private final String lastName;
    private final String emailAddress;
    private final Address address;
    private final String phoneNumber;
    private UUID id;

    private List<Order> orderHistory;

    public Customer(String firstName, String lastName, String emailAddress, Address address, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.id = UUID.randomUUID();
        this.orderHistory = new ArrayList<>();
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
    public void addOrder(Order order){
        orderHistory.add(order);
    }
}
