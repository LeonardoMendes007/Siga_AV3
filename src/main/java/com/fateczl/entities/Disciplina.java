package com.fateczl.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "disciplina")
public class Disciplina implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "codigo")
	private String codigo;
	@Column(name = "nome")
	private String nome;
	@Column(name = "sigla")
	private String sigla;
	@Column(name = "turno")
	private String turno;
	@Column(name = "num_aulas")
	private Integer num_aulas;
	
	@JsonIgnore
	@OneToMany
	@JoinColumn(name = "disciplina")
	private List<Falta> faltas = new ArrayList<Falta>();
	
	@JsonIgnore
	@OneToMany
	@JoinColumn(name = "disciplina")
	private List<Notas> notas = new ArrayList<Notas>();
	
	public Disciplina() {
		super();
	}

	public Disciplina(String codigo, String nome, String sigla, String turno, Integer num_aulas) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.sigla = sigla;
		this.turno = turno;
		this.num_aulas = num_aulas;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public Integer getNum_aulas() {
		return num_aulas;
	}

	public void setNum_aulas(Integer num_aulas) {
		this.num_aulas = num_aulas;
	}

	public List<Falta> getFaltas() {
		return faltas;
	}

	public void setFaltas(List<Falta> faltas) {
		this.faltas = faltas;
	}

	public List<Notas> getNotas() {
		return notas;
	}

	public void setNotas(List<Notas> notas) {
		this.notas = notas;
	}

	

	

}
