package com.procourier.model;

import java.util.Objects;

public class Product {
    private Long price;
    private String name;
    private String description;
    private Long weight;

    public Product(Long price, String name, String description, Long weight) {
        this.price = Objects.requireNonNull(price);
        this.name = Objects.requireNonNull(name);
        this.description = Objects.requireNonNull(description);
        this.weight = Objects.requireNonNull(weight);
    }

    public static void main(String[] args) {
        final Product product = new Product(12L, null , "aaa", 3L);
    }
}
