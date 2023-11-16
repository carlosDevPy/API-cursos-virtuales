package com.cursosVirtuales.cursosVirtualesbackend.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "Estado_Actividad")
public class EstadoActividad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    private String nombre;
    private String descripcion;
}
