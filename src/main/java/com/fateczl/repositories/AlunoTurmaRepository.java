package com.fateczl.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fateczl.entities.AlunoTurma;

@Repository
public interface AlunoTurmaRepository extends JpaRepository<AlunoTurma, String>{

	public List<AlunoTurma> udfAlunoTurma(String codigoDisciplina);
}
