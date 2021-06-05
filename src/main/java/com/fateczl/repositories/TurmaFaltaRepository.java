package com.fateczl.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fateczl.entities.TurmaFalta;

@Repository
public interface TurmaFaltaRepository extends JpaRepository<TurmaFalta, String> {

	public List<TurmaFalta> udfTurmaFalta(String disciplina);
}
