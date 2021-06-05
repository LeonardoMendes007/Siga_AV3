package com.fateczl.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "aluno")
public class Aluno implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ra")
	private String ra;
	@Column(name = "nome")
	private String nome;
	
	@OneToMany(mappedBy = "aluno")
	private List<Falta> faltas = new ArrayList<Falta>();
	
	@OneToMany(mappedBy = "aluno")
	private List<Notas> notas = new ArrayList<Notas>();
	
	public Aluno() {
		super();
	}
	public Aluno(String ra, String nome) {
		super();
		this.ra = ra;
		this.nome = nome;
	}
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
