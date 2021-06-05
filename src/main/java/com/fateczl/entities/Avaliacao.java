package com.fateczl.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "avaliacao")
public class Avaliacao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "codigo")
	private Integer codigo;
	@Column(name = "tipo")
	private String tipo;

	@JsonIgnore
	@OneToMany(mappedBy = "avaliacao")
	private List<Notas> notas = new ArrayList<Notas>();

	public Avaliacao() {
		super();
	}

	public Avaliacao(Integer codigo, String tipo) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
