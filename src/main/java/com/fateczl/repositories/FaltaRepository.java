package com.fateczl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fateczl.entities.Falta;

@Repository
public interface FaltaRepository extends JpaRepository<Falta, Long>{

}
