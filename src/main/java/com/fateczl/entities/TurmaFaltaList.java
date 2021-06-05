package com.fateczl.entities;

import java.util.ArrayList;
import java.util.List;

public class TurmaFaltaList {

	private String ra_aluno;
	private String nome_aluno;
	private List<String> Datas = new ArrayList<>();
	private Integer total_faltas;
	
	public TurmaFaltaList(String ra_aluno, String nome_aluno, Integer total_faltas) {
		super();
		this.ra_aluno = ra_aluno;
		this.nome_aluno = nome_aluno;
		this.total_faltas = total_faltas;
	}

	public String getRa_aluno() {
		return ra_aluno;
	}

	public void setRa_aluno(String ra_aluno) {
		this.ra_aluno = ra_aluno;
	}

	public String getNome_aluno() {
		return nome_aluno;
	}

	public void setNome_aluno(String nome_aluno) {
		this.nome_aluno = nome_aluno;
	}

	public List<String> getDatas() {
		return Datas;
	}

	public void setDatas(List<String> datas) {
		Datas = datas;
	}

	public Integer getTotal_faltas() {
		return total_faltas;
	}

	public void setTotal_faltas(Integer total_faltas) {
		this.total_faltas = total_faltas;
	}
	
	
	
}
