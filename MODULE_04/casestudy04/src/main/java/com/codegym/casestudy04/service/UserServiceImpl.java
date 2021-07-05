package com.codegym.casestudy04.service;

import com.codegym.casestudy04.model.User;
import com.codegym.casestudy04.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void save(User user) {
        userRepository.save(user);

    }

    @Override
    public void delete(int id) {
        userRepository.deleteById(id);
    }
}
