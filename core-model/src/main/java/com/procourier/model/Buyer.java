package com.procourier.model;

import javax.persistence.*;

import static java.util.Objects.requireNonNull;

@Entity
@Table(name = "buyers")

public class Buyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
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