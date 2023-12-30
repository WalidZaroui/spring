package com.example.projet2.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Entity
@Data
public class Auteur {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomAuteur;

    private String prenomAuteur;

    private int age;


    @OneToMany(mappedBy = "auteur")
    private List<Livre> livres;
}
