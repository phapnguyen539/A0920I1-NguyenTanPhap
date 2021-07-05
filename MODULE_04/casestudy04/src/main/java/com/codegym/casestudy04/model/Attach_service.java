package com.codegym.casestudy04.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Attach_service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int attach_service_id;
    private String attach_service_name;
    private double attach_service_cost;
    private int attach_service_unit;
    private String attach_service_status;
    @OneToMany(mappedBy = "attach_service")
    private List<Contract_detail> contract_details;


    public Attach_service() {
    }

    public List<Contract_detail> getContract_details() {
        return contract_details;
    }

    public void setContract_details(List<Contract_detail> contract_details) {
        this.contract_details = contract_details;
    }

    public int getAttach_service_id() {
        return attach_service_id;
    }

    public void setAttach_service_id(int attach_service_id) {
        this.attach_service_id = attach_service_id;
    }

    public String getAttach_service_name() {
        return attach_service_name;
    }

    public void setAttach_service_name(String attach_service_name) {
        this.attach_service_name = attach_service_name;
    }

    public double getAttach_service_cost() {
        return attach_service_cost;
    }

    public void setAttach_service_cost(double attach_service_cost) {
        this.attach_service_cost = attach_service_cost;
    }

    public int getAttach_service_unit() {
        return attach_service_unit;
    }

    public void setAttach_service_unit(int attach_service_unit) {
        this.attach_service_unit = attach_service_unit;
    }

    public String getAttach_service_status() {
        return attach_service_status;
    }

    public void setAttach_service_status(String attach_service_status) {
        this.attach_service_status = attach_service_status;
    }
}
