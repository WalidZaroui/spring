package com.example.projet2.models;



import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Livre {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long isbn;

    private String titre;

    private Long nbrExemplaire;

    private String etatLivre;
    @ManyToOne
    @JoinColumn(name = "id_auteur")
    private Auteur auteur;

    @ManyToOne
    @JoinColumn(name = "id_reservation")
    private Reservation reservation;

    @ManyToOne
    @JoinColumn(name = "emprunt_id")
    private Emprunt emprunt;


}
