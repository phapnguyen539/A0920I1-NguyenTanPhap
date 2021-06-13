package com.codegym.ungdung_blog.service.impl;

import com.codegym.ungdung_blog.model.Blog;
import com.codegym.ungdung_blog.ripository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class BlogServiceImpl implements BlogService {

    @Autowired
    BlogRepository blogRepository;


    @Override
    public List<Blog> findAllBlog() {
        return blogRepository.findAll();
    }

    @Override
    public Blog findBlogById(int id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public void saveBlog(Blog blog) {
        blogRepository.save(blog);

    }

    @Override
    public void deleteBlog(int id) {
        blogRepository.deleteById(id);

    }

    @Override
    public List<Blog> findBlogByName(String name) {
        return blogRepository.findByName(name);
    }
}
