package com.cursosVirtuales.cursosVirtualesbackend.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "CORDINADOR")
public class Cordinador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    private String nombre;

    private String contrasena;

    private  Usuario usuario;

}
