package com.example.isimmbackend.service;

import com.example.isimmbackend.model.Etudiant;

import java.util.Optional;

public interface EtudiantService {
    Optional<Etudiant> findById(Long id);

    Etudiant findByUsername(String username);
}
