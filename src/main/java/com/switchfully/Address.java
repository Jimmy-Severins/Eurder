package com.switchfully;

public class Address {

    private final String street;
    private final String houseNumber;
    private final String postalCode;
    private final String city;
    private final String country;

    public Address(String street, String houseNumber, String postalCode, String city, String country) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }
    public String getStreet() {
        return street;
    }
    public String getHouseNumber() {
        return houseNumber;
    }
    public String getPostalCode() {
        return postalCode;
    }
    public String getCity() {
        return city;
    }
    public String getCountry() {
        return country;
    }
}
