package com.fateczl.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fateczl.entities.Falta;
import com.fateczl.entities.TurmaFalta;
import com.fateczl.entities.TurmaFaltaList;
import com.fateczl.repositories.AlunoRepository;
import com.fateczl.repositories.DisciplinaRepository;
import com.fateczl.repositories.FaltaRepository;
import com.fateczl.repositories.TurmaFaltaRepository;

@RestController
@RequestMapping("/faltas")
public class FaltaResource {

	@Autowired
	private FaltaRepository rep;
	@Autowired
	private DisciplinaRepository repDi;
	@Autowired
	private AlunoRepository repAlu;
	@Autowired
	private TurmaFaltaRepository repTur;
	
	@GetMapping("/{disciplina}/{ra}")
	public ResponseEntity<List<Falta>> getFaltasAluno(@PathVariable("disciplina") String codigo, @PathVariable("ra") String ra){
		
		List<Falta> faltas = rep.findAll().stream().filter(x -> {
		    
			System.out.println(x.getAluno().getRa() + " == " + ra);
		 	return x.getDisciplina().getCodigo().equals(codigo) && x.getAluno().getRa().equals(ra);
			
		}).collect(Collectors.toList());
	    
		return ResponseEntity.ok(faltas);
	}
	
	@GetMapping("/{disciplina}")
	public ResponseEntity<List<TurmaFaltaList>> getDisciplina(@PathVariable("disciplina") String codigo){
		
		List<TurmaFalta> faltas = repTur.udfTurmaFalta(codigo);
		
	    List<TurmaFaltaList> turmaFaltaLists = new ArrayList<TurmaFaltaList>();
		
		faltas.forEach(x -> {
			TurmaFaltaList t = new TurmaFaltaList(x.getRa_aluno(), x.getNome_aluno(), x.getTotal_faltas());
			t.getDatas().add(x.getData1());
			t.getDatas().add(x.getData2());
			t.getDatas().add(x.getData3());
			t.getDatas().add(x.getData4());
			t.getDatas().add(x.getData5());
			t.getDatas().add(x.getData6());
			t.getDatas().add(x.getData7());
			t.getDatas().add(x.getData8());
			t.getDatas().add(x.getData9());
			t.getDatas().add(x.getData10());
			t.getDatas().add(x.getData11());
			t.getDatas().add(x.getData12());
			t.getDatas().add(x.getData13());
			t.getDatas().add(x.getData14());
			t.getDatas().add(x.getData15());
			t.getDatas().add(x.getData16());
			t.getDatas().add(x.getData17());
			t.getDatas().add(x.getData18());
			t.getDatas().add(x.getData19());
			t.getDatas().add(x.getData20());
			
			turmaFaltaLists.add(t);
		});
		
		
		return ResponseEntity.ok(turmaFaltaLists);
	}
	
	
	@PutMapping("/{disciplina}/{ra}/{dataFalta}")
	public ResponseEntity insereFaltas(@PathVariable("disciplina") String disciplina,@PathVariable("ra") String aluno, @PathVariable("dataFalta") String data, @RequestBody Falta falta){
		
		rep.atualizarFalta(falta.getPresenca(), data, aluno, disciplina);
	    
		return ResponseEntity.noContent().build();
	}
}
