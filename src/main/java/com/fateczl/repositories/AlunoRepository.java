package com.fateczl.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fateczl.entities.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, String>{

	@Query(value = "select Distinct a.* from aluno a, faltas f, disciplina d " + 
			"Where a.ra = f.ra_aluno AND " + 
			"f.codigo_disciplina = ?1 ",
			nativeQuery = true)
	List<Aluno> findAllByDisciplina(String disciplina);

}
