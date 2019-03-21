package com.procourier.model;

import java.util.Objects;

public final class Courier {
    private Long id;
    private String companyName;
    private Address headquarters;
    private Long pricePerDistance;
    private Long pricePerWeight;

    public Courier(Long id, String companyName, Address headquarters, Long pricePerDistance, Long pricePerWeight) {
        this.id = Objects.requireNonNull(id);
        this.companyName = Objects.requireNonNull(companyName);
        this.headquarters = Objects.requireNonNull(headquarters);
        this.pricePerDistance = Objects.requireNonNull(pricePerDistance);
        this.pricePerWeight = Objects.requireNonNull(pricePerWeight);
    }

    public Long getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Address getHeadquarters() {
        return headquarters;
    }

    public Long getPricePerDistance() {
        return pricePerDistance;
    }

    public Long getPricePerWeight() {
        return pricePerWeight;
    }


}
