package com.example.isimmbackend.model;
import jakarta.persistence.*;
import java.util.List;
@Entity
public class Blog {

    public Blog(Long id, String img, String title, String description) {
        this.id = id;
        this.img = img;
        this.title = title;
        this.description = description;
    }

    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String img;
        private String title;
        private String description;

    public Blog() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
