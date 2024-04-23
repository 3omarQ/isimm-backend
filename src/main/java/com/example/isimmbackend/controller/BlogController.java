package com.example.isimmbackend.controller;

import com.example.isimmbackend.model.Blog;
import com.example.isimmbackend.model.Classe;
import com.example.isimmbackend.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
@CrossOrigin
public class BlogController {
    @Autowired
    BlogService blogService;
    @GetMapping("")
    public List<Blog> getAllBlogs() {

        // Get messages by student id
        return blogService.getAllBlogs();
    }
}
