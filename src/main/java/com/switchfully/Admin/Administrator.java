package com.switchfully.Admin;

public class Administrator {

    private final String firstName;
    private final String lastName;
    private final String emailAddress;
    private final String phoneNumber;
    private final String password;

    public Administrator(String firstName, String lastName, String emailAddress, String phoneNumber, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

}
