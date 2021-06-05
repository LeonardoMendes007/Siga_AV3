package com.fateczl.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fateczl.entities.AlunoTurma;
import com.fateczl.repositories.AlunoTurmaRepository;

@RestController
@RequestMapping("/alunonota")
public class AlunoTurmaResource {

	@Autowired
	private AlunoTurmaRepository rep;
	
	@GetMapping("/{disciplina}")
	public ResponseEntity<List<AlunoTurma>> get(@PathVariable("disciplina") String disciplina){
		
		return ResponseEntity.ok(rep.udfAlunoTurma(disciplina));
	}
}
