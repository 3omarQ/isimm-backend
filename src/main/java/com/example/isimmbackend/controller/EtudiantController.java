package com.example.isimmbackend.controller;

import com.example.isimmbackend.model.Classe;
import com.example.isimmbackend.model.Etudiant;
import com.example.isimmbackend.model.Message;
import com.example.isimmbackend.service.ClasseService;
import com.example.isimmbackend.service.EtudiantService;
import com.example.isimmbackend.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
@CrossOrigin
public class EtudiantController {
    @Autowired
    EtudiantService etudiantService;
    @Autowired
    MessageService messageService;
    @Autowired
    ClasseService classeService;
    @GetMapping("/{id}")
    public ResponseEntity<Etudiant> getEtudiantById(@PathVariable Long id) {
        Optional<Etudiant> etudiant = etudiantService.findById(id);
        return etudiant.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
    @GetMapping("/{id}/messages")
    public List<Message> getMessagesByStudentId(@PathVariable Long id) {

        // Get messages by student id
        return messageService.findByEtudiantId(id);
    }

    @GetMapping("/{id}/classe")
    public Classe getClasseByStudentId(@PathVariable Long id){
        return classeService.findClasseByEtudiantId(id);
    }

    /*@GetMapping("/username/{username}")
    public ResponseEntity<Etudiant> getEtudiantByUsername(@PathVariable String username) {
        Etudiant etudiant = etudiantService.findByUsername(username);
        if (etudiant != null) {
            return ResponseEntity.ok(etudiant);
        } else {
            return ResponseEntity.notFound().build();
        }
    }*/

   /*@PostMapping("/authenticate")
    public ResponseEntity<String> authenticate(@RequestBody AuthenticationRequest request) {
        if (etudiantService.authenticate(request.getUsername(), request.getPassword())) {
            return ResponseEntity.ok("Authentication successful");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Authentication failed");
        }
    }*/
}