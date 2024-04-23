package com.example.isimmbackend.controller;

import com.example.isimmbackend.model.Classe;
import com.example.isimmbackend.model.Message;
import com.example.isimmbackend.repository.ClasseRepository;
import com.example.isimmbackend.service.ClasseService;
import com.example.isimmbackend.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classe")
@CrossOrigin
public class ClasseController {
    @Autowired
    ClasseService classeService;

    @Autowired
    ClasseRepository classeRepository;
    @GetMapping("/{id}")
    public Classe getClasseById(@PathVariable Long id) {

        // Get messages by student id
        return classeRepository.findClasseById(id);
    }
}
