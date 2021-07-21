package com.codegym.test.service;

import com.codegym.test.model.User;
import com.codegym.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public Page<User> findAllUser(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public Page<User> findAllByNameUser(String name, Pageable pageable) {
        return userRepository.findAllByNameContaining(name,pageable);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);

    }

    @Override
    public void delete(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public User findById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
