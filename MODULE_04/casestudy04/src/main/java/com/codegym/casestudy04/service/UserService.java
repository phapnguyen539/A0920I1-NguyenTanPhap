package com.codegym.casestudy04.service;

import com.codegym.casestudy04.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(int id);
    void save(User user);
    void delete(int id);
}
