package com.codegym.casestudy04.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer_type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customer_type_id;
    private String customerTypeName;

    @OneToMany(mappedBy = "customer_type")
    private List<Customer> customers;

    public Customer_type(){

    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public int getCustomer_type_id() {
        return customer_type_id;
    }

    public void setCustomer_type_id(int customer_type_id) {
        this.customer_type_id = customer_type_id;
    }

    public String customerTypeName() {
        return customerTypeName;
    }

    public void setCustomerTypeName(String customer_type_name) {
        this.customerTypeName = customer_type_name;
    }
}
