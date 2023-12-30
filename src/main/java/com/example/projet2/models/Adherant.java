package com.example.projet2.models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.List;

@Entity
@Data
public class Adherant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private String prenom;

    private String tel;

    private String codePostal;

    private int nbrEmpuntEnCour;

    private String adresse;

    @OneToMany(mappedBy = "adherant")
    private List<Emprunt> emprunts;

    @OneToMany(mappedBy = "adherent")
    private List<Reservation> reservations;





}
