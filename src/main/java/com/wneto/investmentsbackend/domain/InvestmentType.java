package com.wneto.investmentsbackend.domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "INVESTMENT_TYPE")
public class InvestmentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private double rate;

    public InvestmentType() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvestmentType that = (InvestmentType) o;
        return Double.compare(that.rate, rate) == 0 && Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, rate);
    }

    public InvestmentType(Long id, String name, double rate) {
        this.id = id;
        this.name = name;
        this.rate = rate;
    }
}
