package com.codegym.form_vld.service;

import com.codegym.form_vld.model.User;
import com.codegym.form_vld.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public Page<User> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);

    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public User findByIdUser(int id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public Page<User> findByLastNameUser(String name, Pageable pageable) {
        return userRepository.findByLastNameContaining(name, pageable);
    }
}
