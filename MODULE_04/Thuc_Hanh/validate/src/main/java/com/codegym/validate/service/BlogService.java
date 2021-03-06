package com.codegym.validate.service;

import com.codegym.validate.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BlogService {
    Page<Blog> findAllBlog(Pageable pageable);

    Blog findByIdBlog(int id);

    Page<Blog> findByNameBlog(String name, Pageable pageable);

    void saveBlog(Blog blog);

    void deleteBlog(int id);
}
