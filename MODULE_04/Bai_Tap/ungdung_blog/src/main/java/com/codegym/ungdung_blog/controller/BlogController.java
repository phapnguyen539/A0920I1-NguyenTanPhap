package com.codegym.ungdung_blog.controller;

import com.codegym.ungdung_blog.service.impl.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndViewDefiningException;

import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    BlogService blogService;

    @GetMapping("/")
    public ModelAndView getBlog(@RequestParam Optional<String> search) {
        if (!search.isPresent()) {
            return new ModelAndView("list", "blog", blogService.findAllBlog());
        } else {
            return new ModelAndView("list", "blog", blogService.findBlogByName(search.get()));
        }
    }

}



