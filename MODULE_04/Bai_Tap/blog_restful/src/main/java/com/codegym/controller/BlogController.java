package com.codegym.controller;

import com.codegym.model.Blog;
import com.codegym.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlogController {
    @Autowired
    BlogService blogService;

    @GetMapping("/")
    public ResponseEntity<List<Blog>> viewBlog(){
        List<Blog> blogs= blogService.findAll();
        if (blogs.isEmpty()){
            return new ResponseEntity<List<Blog>>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Blog>>(blogs, HttpStatus.OK);
    }
    @PostMapping("/")
    public ResponseEntity<Blog> createBlog(@RequestBody Blog blog){
        blogService.save(blog);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @PutMapping("blog/{id}")
    public ResponseEntity<Blog> updateBlog(@PathVariable("id") int id,@RequestBody Blog blog){
        Blog blog1= blogService.findById(id);
        if (blog1==null){
            return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
        }
        blog1.setId(blog.getId());
        blog1.setName(blog.getName());
        blog1.setContent(blog.getContent());
        blog1.setCategory(blog.getCategory());
        blogService.save(blog1);
        return new ResponseEntity<Blog>(blog1,HttpStatus.OK);
    }
    @DeleteMapping("blog/{id}")
    public ResponseEntity<Blog> deleteBlog(@PathVariable int id,@RequestBody Blog blog){
        Blog blog2= blogService.findById(id);
        if (blog2==null){
            return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
        }
        blogService.delete(id);
        return new ResponseEntity<Blog>(blog2,HttpStatus.NO_CONTENT);
    }

}
