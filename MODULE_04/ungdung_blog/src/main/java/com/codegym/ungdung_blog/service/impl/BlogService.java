package com.codegym.ungdung_blog.service.impl;

import com.codegym.ungdung_blog.model.Blog;

import java.util.List;

public interface BlogService {
List<Blog> findAllBlog();
Blog findBlogById (int id);
void saveBlog(Blog blog);
void deleteBlog(int id);
List<Blog> findBlogByName(String name);
}
