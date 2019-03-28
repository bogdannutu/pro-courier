package com.procourier.model;

import static java.util.Objects.requireNonNull;

import javax.persistence.*;

@Entity
@Table(name = "products")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long price;
    private String name;
    private String description;
    private Long weight;

    public Product() {
    }

    public Product(Long price, String name, String description, Long weight) {
        this.price = requireNonNull(price);
        this.name = requireNonNull(name);
        this.description = requireNonNull(description);
        this.weight = checkWeight(weight);
    }

    private static Long checkWeight(Long weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be non negative");
        }

        return requireNonNull(weight);
    }

    public Long getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Long getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", weight=" + weight +
                '}';
    }
}