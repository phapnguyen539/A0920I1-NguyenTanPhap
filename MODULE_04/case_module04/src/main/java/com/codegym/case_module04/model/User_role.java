package com.codegym.case_module04.model;

import javax.persistence.*;

@Entity
public class User_role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_role_id;
    private String userName;

    @ManyToOne
    private User user;
    @ManyToOne
    private Role role;

    public User_role() {
    }

    public int getUser_role_id() {
        return user_role_id;
    }

    public void setUser_role_id(int user_role_id) {
        this.user_role_id = user_role_id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}

