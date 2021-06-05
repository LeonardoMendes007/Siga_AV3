package com.fateczl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fateczl.entities.Avaliacao;

@Repository
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Integer> {

}
