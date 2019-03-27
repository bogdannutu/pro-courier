package com.procourier.model;

import static java.util.Objects.requireNonNull;

public final class Seller {
    private Long id;
    private String name;
    private String description;
    private Address address;

    public Seller() {
    }

    public Seller(String name, String description, Address address) {
        this.name = requireNonNull(name);
        this.description = requireNonNull(description);
        this.address = requireNonNull(address);
    }

    public Seller(String name, Address address) {
        this(name, "", address);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", address=" + address +
                '}';
    }
}