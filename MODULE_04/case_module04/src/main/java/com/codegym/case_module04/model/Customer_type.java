package com.codegym.case_module04.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer_type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customer_type_id;
    private String customer_type_name;

//    @OneToMany(mappedBy = "customer_type")
//    private List<Customer> customers;

    public Customer_type(){

    }

//    public List<Customer> getCustomers() {
//        return customers;
//    }
//
//    public void setCustomers(List<Customer> customers) {
//        this.customers = customers;
//    }

    public int getCustomer_type_id() {
        return customer_type_id;
    }

    public void setCustomer_type_id(int customer_type_id) {
        this.customer_type_id = customer_type_id;
    }

    public String getCustomer_type_name() {
        return customer_type_name;
    }

    public void setCustomer_type_name(String customer_type_name) {
        this.customer_type_name = customer_type_name;
    }
}
