package com.codegym.blog_validate.repository;

import com.codegym.blog_validate.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BolgRepository extends JpaRepository<Blog, Integer> {

    Page<Blog> findAll(Pageable pageable);

    Page<Blog> findByNameContaining(String name, Pageable pageable);
}

