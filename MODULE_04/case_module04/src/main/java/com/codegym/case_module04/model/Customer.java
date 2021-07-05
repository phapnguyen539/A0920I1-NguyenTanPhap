package com.codegym.case_module04.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customer_id;
    private String customerName;
    private int customer_birthday;
    private String customer_gender;
    private String customer_id_card;
    private String customer_phone;
    private String customer_email;
    private String customer_address;

//   @ManyToOne
//    private Customer_type customer_type;
//   @OneToMany(mappedBy = "customer")
//   private List<Contract> contracts;


    public Customer() {
    }

//    public List<Contract> getContracts() {
//        return contracts;
//    }
//
//    public void setContracts(List<Contract> contracts) {
//        this.contracts = contracts;
//    }
//
//    public Customer_type getCustomer_type() {
//        return customer_type;
//    }
//
//    public void setCustomer_type(Customer_type customer_type) {
//        this.customer_type = customer_type;
//    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customerName;
    }

    public void setCustomer_name(String customer_name) {
        this.customerName = customer_name;
    }

    public int getCustomer_birthday() {
        return customer_birthday;
    }

    public void setCustomer_birthday(int customer_birthday) {
        this.customer_birthday = customer_birthday;
    }

    public String getCustomer_gender() {
        return customer_gender;
    }

    public void setCustomer_gender(String customer_gender) {
        this.customer_gender = customer_gender;
    }

    public String getCustomer_id_card() {
        return customer_id_card;
    }

    public void setCustomer_id_card(String customer_id_card) {
        this.customer_id_card = customer_id_card;
    }

    public String getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }
}
