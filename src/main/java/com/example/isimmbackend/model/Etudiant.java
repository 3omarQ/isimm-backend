package com.example.isimmbackend.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String name;
    private String img;
    private String dateNaissance;
    private String email;
    private String recompenses;
    private String clubs;
    private String certificats;
    private String github;

    @OneToMany(mappedBy = "etudiant", cascade = CascadeType.ALL)
    private List<Message> messages;

    @ManyToOne
    private Classe classe;

    public Etudiant(Long id, String username, String password, String name, String img, String dateNaissance, String email, String recompenses, String clubs, String certificats, String github, List<Message> messages, Classe classe) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.img = img;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.recompenses = recompenses;
        this.clubs = clubs;
        this.certificats = certificats;
        this.github = github;
        this.messages = messages;
        this.classe = classe;
    }

    public Etudiant() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRecompenses() {
        return recompenses;
    }

    public void setRecompenses(String recompenses) {
        this.recompenses = recompenses;
    }

    public String getClubs() {
        return clubs;
    }

    public void setClubs(String clubs) {
        this.clubs = clubs;
    }

    public String getCertificats() {
        return certificats;
    }

    public void setCertificats(String certificats) {
        this.certificats = certificats;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
}
