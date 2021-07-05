package com.codegym.casestudy04.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Rent_type {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rent_type_id;
     private String rent_type_name;
     private double rent_type_cost;
     @OneToMany(mappedBy = "rent_type")
     private List<Service> services;

    public Rent_type() {
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public int getRent_type_id() {
        return rent_type_id;
    }

    public void setRent_type_id(int rent_type_id) {
        this.rent_type_id = rent_type_id;
    }

    public String getRent_type_name() {
        return rent_type_name;
    }

    public void setRent_type_name(String rent_type_name) {
        this.rent_type_name = rent_type_name;
    }

    public double getRent_type_cost() {
        return rent_type_cost;
    }

    public void setRent_type_cost(double rent_type_cost) {
        this.rent_type_cost = rent_type_cost;
    }
}
