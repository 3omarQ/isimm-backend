package com.example.isimmbackend.repository;

import com.example.isimmbackend.model.Etudiant;
import com.example.isimmbackend.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    @Query(value = "SELECT * FROM etudiant WHERE username = :username", nativeQuery = true)
    Etudiant findByUsername(String username);
}
