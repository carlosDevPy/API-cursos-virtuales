package com.cursosVirtuales.cursosVirtualesbackend.repositories;

import com.cursosVirtuales.cursosVirtualesbackend.entidades.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaRepository extends JpaRepository<Nota,Long> {
}
