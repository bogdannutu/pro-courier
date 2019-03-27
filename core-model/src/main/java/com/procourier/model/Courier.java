package com.procourier.model;

import static java.util.Objects.requireNonNull;

public final class Courier {
    private Long id;
    private String companyName;
    private Address headquarters;
    private Long pricePerDistance;
    private Long pricePerWeight;

    public Courier() {
    }

    public Courier(String companyName, Address headquarters, Long pricePerDistance, Long pricePerWeight) {
        this.companyName = requireNonNull(companyName);
        this.headquarters = requireNonNull(headquarters);
        this.pricePerDistance = requireNonNull(pricePerDistance);
        this.pricePerWeight = requireNonNull(pricePerWeight);
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

    @Override
    public String toString() {
        return "Courier{" +
                "companyName='" + companyName + '\'' +
                ", headquarters=" + headquarters +
                ", pricePerDistance=" + pricePerDistance +
                ", pricePerWeight=" + pricePerWeight +
                '}';
    }
}