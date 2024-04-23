package com.example.isimmbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.*;

import java.util.List;
@Entity
public class Classe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String scheduleLink;
    private String marksLink;

    @JsonIgnore
    @OneToMany(mappedBy = "classe", cascade = CascadeType.ALL)
    private List<Etudiant> etudiants;

    public Classe(Long id, String name, String scheduleLink, String marksLink, List<Etudiant> etudiants) {
        this.id = id;
        this.name = name;
        this.scheduleLink = scheduleLink;
        this.marksLink = marksLink;
        this.etudiants = etudiants;
    }

    public Classe() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScheduleLink() {
        return scheduleLink;
    }

    public void setScheduleLink(String scheduleLink) {
        this.scheduleLink = scheduleLink;
    }

    public String getMarksLink() {
        return marksLink;
    }

    public void setMarksLink(String marksLink) {
        this.marksLink = marksLink;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }
}
