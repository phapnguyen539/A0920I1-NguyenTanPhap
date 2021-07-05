package com.codegym.casestudy04.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class User {
    @Id
    private String userName;
    private String user_password;
    @OneToMany(mappedBy = "user")
    private List<Employee> employees;
    @OneToMany(mappedBy = "user")
    private List<User_role> user_roles;

    public User() {
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<User_role> getUser_roles() {
        return user_roles;
    }

    public void setUser_roles(List<User_role> user_roles) {
        this.user_roles = user_roles;
    }



    public String getUser_name() {
        return userName;
    }

    public void setUser_name(String user_name) {
        this.userName = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }
}
