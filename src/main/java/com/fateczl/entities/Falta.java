package com.fateczl.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "faltas")
public class Falta implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private Long codigo;
	@Column(name = "data")
	private String data;
	@Column(name = "presenca")
	private Integer presenca;
	
	@JoinColumn(name = "ra_aluno")
	@JsonIgnore
	@ManyToOne
	private Aluno aluno;
	
	@JoinColumn(name = "codigo_disciplina")
	@ManyToOne
	private Disciplina disciplina;

	public Falta() {
		super();
	}

	public Falta(Long codigo, String data, Integer presenca, Aluno aluno, Disciplina disciplina) {
		super();
		this.codigo = codigo;
		this.data = data;
		this.presenca = presenca;
		this.aluno = aluno;
		this.disciplina = disciplina;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Integer getPresenca() {
		return presenca;
	}

	public void setPresenca(Integer presenca) {
		this.presenca = presenca;
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

	
	
	
	

	
}
