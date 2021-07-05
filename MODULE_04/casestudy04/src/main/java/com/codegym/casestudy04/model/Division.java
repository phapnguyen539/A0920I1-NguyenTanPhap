package com.codegym.casestudy04.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int division_id;
    private String division_name;
    @OneToMany(mappedBy = "division")
    private List<Employee> employees;

    public Division(){
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public int getDivision_id() {
        return division_id;
    }

    public void setDivision_id(int division_id) {
        this.division_id = division_id;
    }

    public String getDivision_name() {
        return division_name;
    }

    public void setDivision_name(String division_name) {
        this.division_name = division_name;
    }
}
