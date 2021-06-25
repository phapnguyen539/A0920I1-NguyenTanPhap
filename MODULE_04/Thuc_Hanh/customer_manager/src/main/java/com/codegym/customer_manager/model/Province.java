package com.codegym.customer_manager.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany(mappedBy = "province")
    private List<Customer> customers;

    public List<Customer> getCustomers(){
        return customers;
    }
    public void setCustomers(List<Customer> customers){
        this.customers=customers;
    }


    public Province() {
    }

    public Province(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
