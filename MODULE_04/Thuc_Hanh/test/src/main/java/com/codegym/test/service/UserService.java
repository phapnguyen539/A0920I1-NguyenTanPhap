package com.codegym.test.service;

import com.codegym.test.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService {
    Page<User> findAllUser(Pageable pageable);
    Page<User> findAllByNameUser(String name, Pageable pageable);
    void save(User user);
    void delete(int id);
    User findById(int id);
    List<User> findAll();

}
