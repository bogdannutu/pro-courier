package com.procourier.model;

import java.time.Instant;
import java.util.List;

import static java.util.Collections.unmodifiableList;
import static java.util.Objects.requireNonNull;

public final class Order {
    private Long id;
    private Seller seller;
    private Buyer buyer;
    private Courier courier;
    private Instant submittedDate;
    private List<OrderLine> orderLines;

    public Order() {
    }

    public Order(Seller seller, Buyer buyer, Courier courier, List<OrderLine> orderLines) {
        this.seller = seller;
        this.buyer = buyer;
        this.courier = courier;
        this.orderLines = orderLines;
    }

    public Order(Seller seller, Buyer buyer,
                 Courier courier, Instant submittedDate, List<OrderLine> orderLines) {
        this.seller = requireNonNull(seller);
        this.buyer = requireNonNull(buyer);
        this.courier = requireNonNull(courier);
        this.submittedDate = requireNonNull(submittedDate);
        this.orderLines = unmodifiableList(orderLines);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    @Override
    public String toString() {
        return "Order{" +
                ", seller=" + seller +
                ", buyer=" + buyer +
                ", courier=" + courier +
                ", submittedDate=" + submittedDate +
                ", orderLines=" + orderLines +
                '}';
    }
}