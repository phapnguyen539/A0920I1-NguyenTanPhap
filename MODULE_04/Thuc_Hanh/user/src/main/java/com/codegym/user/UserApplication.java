package com.codegym.user;

import com.codegym.user.model.User;
import com.codegym.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class UserApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        this.userRepository.save(new User(1,"Phap","Nguyen","nguyentanphap@gmail.com"));
        this.userRepository.save(new User(2,"Tan","Nguyen","tan@gmail.com"));
        this.userRepository.save(new User(3,"Viet","Nguyen","viet@gmail.com"));
        this.userRepository.save(new User(4,"Dat","Nguyen","dat@gmail.com"));
    }
}
