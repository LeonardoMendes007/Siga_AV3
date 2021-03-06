package com.fateczl.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fateczl.entities.Disciplina;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, String> {

}
