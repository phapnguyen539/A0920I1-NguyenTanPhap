package com.codegym.casestudy04.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Education_degree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int education_degree_id;
    private String education_degree_name;
    @OneToMany(mappedBy = "education_degree")
    private List<Employee> employeeList;

    public Education_degree() {
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public int getEducation_degree_id() {
        return education_degree_id;
    }

    public void setEducation_degree_id(int education_degree_id) {
        this.education_degree_id = education_degree_id;
    }

    public String getEducation_degree_name() {
        return education_degree_name;
    }

    public void setEducation_degree_name(String education_degree_name) {
        this.education_degree_name = education_degree_name;
    }
}
