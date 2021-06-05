package com.fateczl.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;

@Entity
@NamedNativeQuery(
		name = "AlunoTurma.udfAlunoTurma",
		query = "SELECT ra_aluno, nota1, nota2, nota3, media_final, situação FROM fn_calcNotas(?1)",
		resultClass = AlunoTurma.class)
public class AlunoTurma implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ra_aluno")
	private String ra;
//	@Column(name = "nome_aluno")
//	private String nome_aluno;
	@Column(name = "nota1")
	private Double nota1;
	@Column(name = "nota2")
	private Double nota2;
	@Column(name = "nota3")
	private Double nota3;
	@Column(name = "media_final")
	private Double media_final;
	@Column(name = "situação")
	private String situacao;
	public AlunoTurma() {
		super();
	}
	public AlunoTurma(String ra, Double nota1, Double nota2, Double nota3, Double media_final, String situacao) {
		super();
		this.ra = ra;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.media_final = media_final;
		this.situacao = situacao;
	}
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public Double getNota1() {
		return nota1;
	}
	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}
	public Double getNota2() {
		return nota2;
	}
	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	public Double getNota3() {
		return nota3;
	}
	public void setNota3(Double nota3) {
		this.nota3 = nota3;
	}
	public Double getMedia_final() {
		return media_final;
	}
	public void setMedia_final(Double media_final) {
		this.media_final = media_final;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	

	
}
