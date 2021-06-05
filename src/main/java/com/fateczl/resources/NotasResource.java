package com.fateczl.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fateczl.entities.Aluno;
import com.fateczl.entities.Avaliacao;
import com.fateczl.entities.Disciplina;
import com.fateczl.entities.Notas;
import com.fateczl.repositories.AlunoRepository;
import com.fateczl.repositories.AvaliacaoRepository;
import com.fateczl.repositories.DisciplinaRepository;
import com.fateczl.repositories.NotasRepository;

@RestController
@RequestMapping("/Nota")
public class NotasResource {

	@Autowired
	private NotasRepository repNo;
	@Autowired
	private DisciplinaRepository repDi;
	@Autowired
	private AlunoRepository repAlu;
	@Autowired
	private AvaliacaoRepository repAv;
	
	@PostMapping("/{disciplina}/{avaliacao}/{aluno}")
	public ResponseEntity<Notas> postNotas(@PathVariable String disciplina, @PathVariable Integer avaliacao ,@PathVariable String aluno, @RequestBody Notas nota ){
		
		Aluno a = repAlu.findById(aluno).get();
		Disciplina d = repDi.findById(disciplina).get();
		Avaliacao av = repAv.findById(avaliacao).get();
		
		nota.setDisciplina(d);
		nota.setAluno(a);
		nota.setAvaliacao(av);
		
		repNo.save(nota);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/"+ disciplina + "/" + avaliacao + "/{codigo}").buildAndExpand(nota.getCodigo())
				.toUri();
		
		return ResponseEntity.created(uri).body(nota);
	}

}
