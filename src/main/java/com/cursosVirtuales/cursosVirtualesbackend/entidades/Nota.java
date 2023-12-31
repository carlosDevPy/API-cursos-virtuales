package com.cursosVirtuales.cursosVirtualesbackend.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "NOTA")
@NoArgsConstructor
@AllArgsConstructor
public class Nota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    private  String nombre;
    private  String descripcion;
}
