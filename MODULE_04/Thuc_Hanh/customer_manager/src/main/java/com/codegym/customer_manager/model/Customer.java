package com.codegym.customer_manager.model;

import javax.persistence.*;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
    private String firstName;
    private String lastName;
    @ManyToOne()
    private Province province;


    public Customer() {
    }
    public Customer(int id,String firstName,String lastName){
        this.id= id;
        this.firstName= firstName;
        this.lastName= lastName;
    }
    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
