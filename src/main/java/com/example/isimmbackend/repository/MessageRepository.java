package com.example.isimmbackend.repository;

import com.example.isimmbackend.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message,Long> {
    @Query("SELECT m FROM Message m WHERE m.etudiant.id = :studentId")
    List<Message> findByEtudiantId(@Param("studentId") Long studentId);


}
