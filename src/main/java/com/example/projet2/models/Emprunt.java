package com.example.projet2.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Emprunt {

    private Date dateRetour;
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_adherant")
    private Adherant adherant;


    @OneToMany(mappedBy = "emprunt")
    private List<Livre> livres;

}
