package com.fateczl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fateczl.entities.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, String>{

}
