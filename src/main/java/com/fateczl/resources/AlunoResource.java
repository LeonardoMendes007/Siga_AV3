package com.fateczl.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fateczl.entities.Aluno;
import com.fateczl.repositories.AlunoRepository;

@RestController
@RequestMapping("/aluno")
public class AlunoResource {
	
	@Autowired
	private AlunoRepository rep;
	
	@GetMapping
	public ResponseEntity<List<Aluno>> getAlunos(){
		
		return ResponseEntity.ok(rep.findAll());
	}
	
	@GetMapping("/{disciplina}")
	public ResponseEntity<List<Aluno>> getAlunosTurma(@PathVariable String disciplina){
				
		return ResponseEntity.ok(rep.findAll().stream().filter(x -> x.getFaltas().contains(disciplina)).collect(Collectors.toList()));
	}

}
