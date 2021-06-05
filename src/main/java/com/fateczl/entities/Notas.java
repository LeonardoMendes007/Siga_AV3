package com.fateczl.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "notas")
public class Notas implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codigo")
	private Long codigo;

	@Column(name = "nota")
	private Double nota;

	@JoinColumn(name = "ra_aluno")
	@JsonIgnore
	@ManyToOne
	private Aluno aluno;

	@JoinColumn(name = "codigo_avaliacao")
	@ManyToOne
	private Avaliacao avaliacao;

	@JoinColumn(name = "codigo_disciplina")
	@ManyToOne
	private Disciplina disciplina;

	public Notas() {
		super();
	}

	public Notas(Long codigo, Aluno aluno, Disciplina disciplina, Avaliacao avaliacao, Double nota) {
		super();
		this.codigo = codigo;
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.avaliacao = avaliacao;
		this.nota = nota;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Avaliacao avaliacao) {
		this.avaliacao = avaliacao;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

}
