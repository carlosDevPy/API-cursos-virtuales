package com.cursosVirtuales.cursosVirtualesbackend.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "PARTICIPANTE")
public class Participante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    private  String nombre;
    private  String apellido;
    private  String legajo;
    private String dni;
    private String mail;
    private String formatoCorreo;
    //recordar que es un link a un diaspositivo donde estan almacenados las fotos
    private String foto;
    private String interes;

    //faltan las dos forean key - relaciones


}
