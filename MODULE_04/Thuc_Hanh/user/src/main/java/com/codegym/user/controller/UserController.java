package com.codegym.user.controller;

import com.codegym.user.model.User;
import com.codegym.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getUser(){
        return  this.userRepository.findAll();
    }
}
