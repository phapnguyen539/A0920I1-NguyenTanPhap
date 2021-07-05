package com.codegym.case_module04.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;

@Entity
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contract_id;
    private String contract_start_date;
    private String contract_end_date;
    private double deposit;
    private double contract_total_money;
    @ManyToOne
    private Employee employee;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Service service;
    @OneToMany(mappedBy = "contract")
    private List<Contract_detail> contract_details;

    public Contract() {
    }

    public List<Contract_detail> getContract_details() {
        return contract_details;
    }

    public void setContract_details(List<Contract_detail> contract_details) {
        this.contract_details = contract_details;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public int getContract_id() {
        return contract_id;
    }

    public void setContract_id(int contract_id) {
        this.contract_id = contract_id;
    }

    public String getContract_start_date() {
        return contract_start_date;
    }

    public void setContract_start_date(String contract_start_date) {
        this.contract_start_date = contract_start_date;
    }

    public String getContract_end_date() {
        return contract_end_date;
    }

    public void setContract_end_date(String contract_end_date) {
        this.contract_end_date = contract_end_date;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getContract_total_money() {
        return contract_total_money;
    }

    public void setContract_total_money(double contract_total_money) {
        this.contract_total_money = contract_total_money;
    }
}
