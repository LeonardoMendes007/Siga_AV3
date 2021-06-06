package com.fateczl.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fateczl.entities.Falta;

@Repository
public interface FaltaRepository extends JpaRepository<Falta, Long>{

	@Modifying
	@Transactional
	@Query(value = "Update faltas SET presenca = ?1 from aluno, disciplina Where faltas.codigo_disciplina = disciplina.codigo AND " + 
			"faltas.ra_aluno = aluno.ra AND " + 
			"faltas.data = ?2 AND " + 
			"aluno.ra = ?3 AND " + 
			"disciplina.codigo = ?4 ",
			nativeQuery = true)
	int atualizarFalta(int presenca, String data,String aluno, String disciplina);
}
