package com.codegym.blogdata.controller;

import com.codegym.blogdata.model.Blog;
import com.codegym.blogdata.service.BlogService;
import com.codegym.blogdata.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class BlogController {
    @Autowired
    BlogService blogService;
    @Autowired
    LanguageService languageService;

    @GetMapping("/")
    public ModelAndView showBlog(@RequestParam Optional<String> search, @PageableDefault Pageable pageable, Model model) {
        if (!search.isPresent()) {
            return new ModelAndView("list", "blogs", blogService.findAllBlog(pageable));
        } else {
            model.addAttribute("search", search.get());
            return new ModelAndView("list", "blogs", blogService.findByNameBlog(search.get(), pageable));

        }
    }

    @GetMapping("/create")
    public ModelAndView showCreate(Model modle) {
        modle.addAttribute("language", languageService.findAllLanguage());
        return new ModelAndView("create", "blogs", new Blog());
    }

    @PostMapping("/create")
    public String saveBlog(Blog blog) {
        blogService.saveBlog(blog);
        return "redirect:/";
    }
}