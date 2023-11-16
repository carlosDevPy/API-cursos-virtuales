package com.cursosVirtuales.cursosVirtualesbackend.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "TUTOR")
public class Tutor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    private  String nombre;
    private  String apellido;
}
