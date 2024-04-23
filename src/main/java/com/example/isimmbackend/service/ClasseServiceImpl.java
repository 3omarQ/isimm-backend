package com.example.isimmbackend.service;

import com.example.isimmbackend.model.Classe;
import com.example.isimmbackend.model.Etudiant;
import com.example.isimmbackend.repository.ClasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClasseServiceImpl implements ClasseService{
    @Autowired
    private ClasseRepository classeRepository;

    @Override
    public Classe findClasseByEtudiantId(Long id) {
        // Fetch the Etudiant by id
        Etudiant etudiant = new Etudiant();
        etudiant.setId(id);

        // Use the Etudiant to find the associated Classe
        return classeRepository.findByEtudiantsContaining(etudiant);
    }
}
