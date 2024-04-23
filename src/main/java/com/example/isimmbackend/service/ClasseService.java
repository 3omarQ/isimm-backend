package com.example.isimmbackend.service;

import com.example.isimmbackend.model.Classe;
import com.example.isimmbackend.model.Message;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ClasseService {
    Classe findClasseByEtudiantId(Long id);
}
