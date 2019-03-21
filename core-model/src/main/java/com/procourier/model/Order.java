package com.procourier.model;

import java.time.Instant;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

public final class Order {
    private Long id;
    private Seller seller;
    private Buyer buyer;
    private Courier courier;
    private Instant submittedDate;
    private Map<Product, Integer> orderLines;

    public Order(Long id, Seller seller, Buyer buyer, Courier courier, Instant submittedDate,
                 Map<Product, Integer> orderLines) {
        this.id = Objects.requireNonNull(id);
        this.seller = Objects.requireNonNull(seller);
        this.buyer = Objects.requireNonNull(buyer);
        this.courier = Objects.requireNonNull(courier);
        this.submittedDate = Objects.requireNonNull(submittedDate);
        this.orderLines = Collections.unmodifiableMap(orderLines);
    }

    public Order(Long id, Seller seller, Buyer buyer, Courier courier, Map<Product, Integer> orderLines) {
        this(id, seller, buyer, courier, Instant.now(), orderLines);
    }

    public Long getId() {
        return id;
    }

    public Seller getSeller() {
        return seller;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public Courier getCourier() {
        return courier;
    }

    public Instant getSubmittedDate() {
        return submittedDate;
    }

    public Map<Product, Integer> getOrderLines() {
        return orderLines;
    }
}
