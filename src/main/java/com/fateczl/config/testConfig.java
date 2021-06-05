package com.fateczl.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.fateczl.entities.Aluno;
import com.fateczl.entities.Avaliacao;
import com.fateczl.entities.Disciplina;
import com.fateczl.entities.Falta;
import com.fateczl.entities.Notas;
import com.fateczl.repositories.AlunoRepository;
import com.fateczl.repositories.AvaliacaoRepository;
import com.fateczl.repositories.DisciplinaRepository;
import com.fateczl.repositories.FaltaRepository;
import com.fateczl.repositories.NotasRepository;

@Configuration
public class testConfig implements CommandLineRunner{

	@Autowired
	private AlunoRepository repAluno;
	
	@Autowired
	private DisciplinaRepository repDisciplina;
	
	@Autowired
	private FaltaRepository repFalta;
	
	@Autowired
	private AvaliacaoRepository repAvaliacao;
	
	@Autowired
	private NotasRepository repNotas;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		
		
	}

}
