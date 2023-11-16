package com.cursosVirtuales.cursosVirtualesbackend.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "USUARIO")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // recordar cambiar a id todas las id. en este caso id por usuario_id
    private  long id;

    private String nombre;
    private String contrasena;


}
