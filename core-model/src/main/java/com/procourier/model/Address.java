package com.procourier.model;

import static java.util.Objects.requireNonNull;

public class Address {
    private Long id;
    private String region;
    private String city;
    private String street;
    private String streetNumber;

    public Address() {
    }

    public Address(String region, String city, String street, String streetNumber) {
        this.region = requireNonNull(region);
        this.city = requireNonNull(city);
        this.street = requireNonNull(street);
        this.streetNumber = requireNonNull(streetNumber);
    }

    public Address(String region, String city, String street) {
        this(region, city, street, "");
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                '}';
    }
}