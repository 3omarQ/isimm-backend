package com.example.isimmbackend.service;

import com.example.isimmbackend.model.Etudiant;
import com.example.isimmbackend.repository.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class EtudiantServiceImpl implements EtudiantService{
    @Autowired
    private EtudiantRepository etudiantRepository;


    @Override
    public Optional<Etudiant> findById(Long id) {
        return etudiantRepository.findById(id);
    }

    @Override
    public Etudiant findByUsername(String username) {
        return etudiantRepository.findByUsername(username);
    }


}
