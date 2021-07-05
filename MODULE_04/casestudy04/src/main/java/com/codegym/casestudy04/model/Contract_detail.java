package com.codegym.casestudy04.model;

import javax.persistence.*;

@Entity
public class Contract_detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contract_detail_id;
    private int quantity;
    @ManyToOne
    private Contract contract;
    @ManyToOne
    private Attach_service attach_service;


    public Contract_detail() {
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public Attach_service getAttach_service() {
        return attach_service;
    }

    public void setAttach_service(Attach_service attach_service) {
        this.attach_service = attach_service;
    }

    public int getContract_detail_id() {
        return contract_detail_id;
    }

    public void setContract_detail_id(int contract_detail_id) {
        this.contract_detail_id = contract_detail_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
