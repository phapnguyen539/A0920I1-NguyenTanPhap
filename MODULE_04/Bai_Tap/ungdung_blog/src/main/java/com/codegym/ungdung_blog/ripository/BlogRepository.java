package com.codegym.ungdung_blog.ripository;

import com.codegym.ungdung_blog.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
    List<Blog> findByName(String name);
}
