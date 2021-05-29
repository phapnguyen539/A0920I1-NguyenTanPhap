package com.codegym.customer_vld.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Province {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
@OneToMany(targetEntity = Customer.class)
private List<Customer> customers;

    public Province() {
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
