package com.cursosVirtuales.cursosVirtualesbackend.entidades.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotaDto {
    private  long id;
    private  String nombre;
    private  String descripcion;
}
