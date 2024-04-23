package com.example.isimmbackend.repository;

import com.example.isimmbackend.model.Classe;
import com.example.isimmbackend.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClasseRepository extends JpaRepository<Classe,Long> {
    @Query("SELECT c FROM Classe c JOIN c.etudiants e WHERE e = :etudiant")
    Classe findByEtudiantsContaining(Etudiant etudiant);

    Classe findClasseById(Long id);
}
