package com.cursosVirtuales.cursosVirtualesbackend.controllers;

import com.cursosVirtuales.cursosVirtualesbackend.entidades.Nota;
import com.cursosVirtuales.cursosVirtualesbackend.services.NotaService;
import com.cursosVirtuales.cursosVirtualesbackend.services.NotaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/nota")
public class NotaController {
    private  final NotaService notaService;
    public NotaController(NotaService notaService){
        this.notaService = notaService;
    }


    @GetMapping
    public ResponseEntity<List<Nota>> getAll(){
        List<Nota> values = this.notaService.getAll();

        return ResponseEntity.ok(values);
    }

    @PostMapping
    public ResponseEntity<Nota> add(@RequestBody Nota nota ){
        Nota nuevaNota = this.notaService.add(nota);
        return  ResponseEntity.status(HttpStatus.CREATED).body(nuevaNota);
    }

    //delete

    //put

}
