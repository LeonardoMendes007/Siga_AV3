package com.fateczl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fateczl.entities.Notas;

@Repository
public interface NotasRepository extends JpaRepository<Notas, Long> {

}
