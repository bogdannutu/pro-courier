package com.procourier.model;

import static java.util.Objects.requireNonNull;

public final class Buyer {
    private Long id;
    private String name;
    private Address address;

    public Buyer() {
    }

    public Buyer(String name, Address address) {
        this.name = requireNonNull(name);
        this.address = requireNonNull(address);
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}