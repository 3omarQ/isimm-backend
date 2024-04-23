package com.example.isimmbackend.service;

import com.example.isimmbackend.model.Blog;
import com.example.isimmbackend.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class BlogServiceImpl implements BlogService{
    @Autowired
    BlogRepository blogRepository;
    public List<Blog> getAllBlogs(){
        return blogRepository.findAll();
    }
}
