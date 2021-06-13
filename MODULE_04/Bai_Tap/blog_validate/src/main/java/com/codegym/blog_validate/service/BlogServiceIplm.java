package com.codegym.blog_validate.service;

import com.codegym.blog_validate.model.Blog;
import com.codegym.blog_validate.repository.BolgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceIplm implements BlogService {
    @Autowired
    BolgRepository bolgRepository;

    @Override
    public Page<Blog> findAllBlog(Pageable pageable) {
        return bolgRepository.findAll(pageable);
    }

    @Override
    public Blog findByIdBlog(int id) {
        return bolgRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Blog> findByNameBlog(String name, Pageable pageable) {
        return bolgRepository.findByNameContaining(name, pageable);
    }

    @Override
    public void saveBlog(Blog blog) {


        bolgRepository.save(blog);

    }

    @Override
    public void deleteBlog(int id) {
        bolgRepository.deleteById(id);
    }
}
