package com.codegym.form_vld.repository;

import com.codegym.form_vld.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    Page<User> findByLastNameContaining(String name,Pageable pageable);
}
