package com.cursosVirtuales.cursosVirtualesbackend.services;

import com.cursosVirtuales.cursosVirtualesbackend.entidades.Nota;
import com.cursosVirtuales.cursosVirtualesbackend.entidades.dto.NotaDto;
import com.cursosVirtuales.cursosVirtualesbackend.repositories.NotaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotaServiceImpl implements  NotaService{

    // repasar patron de diseno - inyeccion de dependencias
    private final NotaRepository notaRepository;
    public NotaServiceImpl(NotaRepository notaRepository){
        this.notaRepository = notaRepository;
    }

    @Override
    public Nota add(Nota entity) {
        Nota nota = this.notaRepository.save(entity);
        return  nota;
    }

    @Override
    public void update(Nota entity) {
        this.notaRepository.save(entity);
    }

    @Override
    public Nota delete(Long aLong) {
        Nota nota = this.getById(aLong);
        if (nota != null)
            this.notaRepository.delete(nota);
        return nota;
    }

    @Override
    public NotaDto getById(Long aLong) {
        //return  this.notaRepository.findById(aLong).orElse(null);

    }

    @Override
    public List<NotaDto> getAll() {

         List<Nota> notas  =  this.notaRepository.findAll();
        return notas
                .stream()
                .map( n -> new NotaDto(
                        n.getId(),
                        n.getNombre(),
                        n.getDescripcion()
                ))
                .toList();
    }
}
