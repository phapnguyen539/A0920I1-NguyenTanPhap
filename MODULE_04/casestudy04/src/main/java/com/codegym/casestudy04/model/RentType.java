package com.codegym.casestudy04.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class RentType {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rentTypeId;
     private String rentTypeName;
     private double rentTypeCost;
     @OneToMany(mappedBy = "rentType")
     private List<Service> services;

    public RentType() {
    }

    public int getRentTypeId() {
        return rentTypeId;
    }

    public void setRentTypeId(int rentTypeId) {
        this.rentTypeId = rentTypeId;
    }

    public String getRentTypeName() {
        return rentTypeName;
    }

    public void setRentTypeName(String rentTypeName) {
        this.rentTypeName = rentTypeName;
    }

    public double getRentTypeCost() {
        return rentTypeCost;
    }

    public void setRentTypeCost(double rentTypeCost) {
        this.rentTypeCost = rentTypeCost;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }
}
