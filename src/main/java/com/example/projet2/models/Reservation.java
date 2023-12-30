package com.example.projet2.models;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Reservation {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dateReservation;

    @ManyToOne
    @JoinColumn(name = "adherent_id")
    private Adherant adherent;

    @OneToMany(mappedBy = "reservation")
    private List<Livre> livres;
}

