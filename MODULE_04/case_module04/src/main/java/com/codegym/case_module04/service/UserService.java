package com.codegym.case_module04.service;

import com.codegym.case_module04.model.User;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(int id);
    void save(User user);
    void delete(int id);
}
