package com.codegym.casestudy04.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employee_id;
    private String employeeName;
    private String employee_birthday;
    private String employee_id_card;
    private double employee_salary;
    private String employee_phone;
    private String employee_email;
    private String employee_address;
    @ManyToOne
    private Position position;
    @ManyToOne
    private Education_degree education_degree;
    @ManyToOne
    private Division division;
    @ManyToOne
    private User user;
    @OneToMany(mappedBy = "employee")
    private List<Contract> contracts;

    public Employee() {
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(List<Contract> contracts) {
        this.contracts = contracts;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Education_degree getEducation_degree() {
        return education_degree;
    }

    public void setEducation_degree(Education_degree education_degree) {
        this.education_degree = education_degree;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employeeName;
    }

    public void setEmployee_name(String employee_name) {
        this.employeeName = employee_name;
    }

    public String getEmployee_birthday() {
        return employee_birthday;
    }

    public void setEmployee_birthday(String employee_birthday) {
        this.employee_birthday = employee_birthday;
    }

    public String getEmployee_id_card() {
        return employee_id_card;
    }

    public void setEmployee_id_card(String employee_id_card) {
        this.employee_id_card = employee_id_card;
    }

    public double getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(double employee_salary) {
        this.employee_salary = employee_salary;
    }

    public String getEmployee_phone() {
        return employee_phone;
    }

    public void setEmployee_phone(String employee_phone) {
        this.employee_phone = employee_phone;
    }

    public String getEmployee_email() {
        return employee_email;
    }

    public void setEmployee_email(String employee_email) {
        this.employee_email = employee_email;
    }

    public String getEmployee_address() {
        return employee_address;
    }

    public void setEmployee_address(String employee_address) {
        this.employee_address = employee_address;
    }
}
