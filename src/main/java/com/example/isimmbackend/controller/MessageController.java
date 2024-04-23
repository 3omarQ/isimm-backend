package com.example.isimmbackend.controller;

import com.example.isimmbackend.model.Etudiant;
import com.example.isimmbackend.model.Message;
import com.example.isimmbackend.repository.EtudiantRepository;
import com.example.isimmbackend.service.EtudiantService;
import com.example.isimmbackend.service.MessageService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/messages")
@CrossOrigin
public class MessageController {
    @Autowired
    private MessageService messageService;

    @Autowired
    EtudiantRepository etudiantRepository;

    @GetMapping("/messages")
    public ResponseEntity<List<Message>> getAllMessages() {
        List<Message> messages = messageService.getAllMessages();
        return ResponseEntity.ok(messages);
    }

    @GetMapping("/messages/{id}")
    public ResponseEntity<Message> getMessageById(@PathVariable Long id) {
        Message message = messageService.getMessageById(id);
        return ResponseEntity.ok(message);
    }

}
