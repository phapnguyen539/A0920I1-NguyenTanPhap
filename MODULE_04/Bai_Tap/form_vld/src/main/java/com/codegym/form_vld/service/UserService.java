package com.codegym.form_vld.service;

import com.codegym.form_vld.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    Page<User> findAll(Pageable pageable);

    void saveUser(User user);

    void deleteUser(int id);

    User findByIdUser(int id);

    Page<User> findByLastNameUser(String name, Pageable pageable);
}
