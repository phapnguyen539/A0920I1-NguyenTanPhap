package com.codegym.test.repository;

import com.codegym.test.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
    Page<User> findAllByNameContaining(String name, Pageable pageable);
    Page<User> findAll(Pageable pageable);
}
