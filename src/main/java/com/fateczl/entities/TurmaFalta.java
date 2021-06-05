package com.fateczl.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;

@Entity
@NamedNativeQuery(
		name = "TurmaFalta.udfTurmaFalta",
		query = "select * from fn_faltas(?1)",
		resultClass = TurmaFalta.class)
public class TurmaFalta implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	@Id
	private String ra_aluno;
	private String nome_aluno;
	private String Data1;
	private String Data2;
	private String Data3;
	private String Data4;
	private String Data5;
	private String Data6;
	private String Data7;
	private String Data8;
	private String Data9;
	private String Data10;
	private String Data11;
	private String Data12;
	private String Data13;
	private String Data14;
	private String Data15;
	private String Data16;
	private String Data17;
	private String Data18;
	private String Data19;
	private String Data20;
	private Integer total_faltas;
	
	public TurmaFalta() {
		super();
	}

	public TurmaFalta(String ra_aluno, String nome_aluno, String Data1, String Data2, String Data3, String Data4,
			String Data5, String Data6, String Data7, String Data8, String Data9, String Data10, String Data11,
			String Data12, String Data13, String Data14, String Data15, String Data16, String Data17, String Data18,
			String Data19, String Data20, Integer total_faltas) {
		super();
		this.ra_aluno = ra_aluno;
		this.nome_aluno = nome_aluno;
		this.Data1 = Data1;
		this.Data2 = Data2;
		this.Data3 = Data3;
		this.Data4 = Data4;
		this.Data5 = Data5;
		this.Data6 = Data6;
		this.Data7 = Data7;
		this.Data8 = Data8;
		this.Data9 = Data9;
		this.Data10 = Data10;
		this.Data11 = Data11;
		this.Data12 = Data12;
		this.Data13 = Data13;
		this.Data14 = Data14;
		this.Data15 = Data15;
		this.Data16 = Data16;
		this.Data17 = Data17;
		this.Data18 = Data18;
		this.Data19 = Data19;
		this.Data20 = Data20;
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

	public String getData1() {
		return Data1;
	}

	public void setData1(String Data1) {
		this.Data1 = Data1;
	}

	public String getData2() {
		return Data2;
	}

	public void setData2(String Data2) {
		this.Data2 = Data2;
	}

	public String getData3() {
		return Data3;
	}

	public void setData3(String Data3) {
		this.Data3 = Data3;
	}

	public String getData4() {
		return Data4;
	}

	public void setData4(String Data4) {
		this.Data4 = Data4;
	}

	public String getData5() {
		return Data5;
	}

	public void setData5(String Data5) {
		this.Data5 = Data5;
	}

	public String getData6() {
		return Data6;
	}

	public void setData6(String Data6) {
		this.Data6 = Data6;
	}

	public String getData7() {
		return Data7;
	}

	public void setData7(String Data7) {
		this.Data7 = Data7;
	}

	public String getData8() {
		return Data8;
	}

	public void setData8(String Data8) {
		this.Data8 = Data8;
	}

	public String getData9() {
		return Data9;
	}

	public void setData9(String Data9) {
		this.Data9 = Data9;
	}

	public String getData10() {
		return Data10;
	}

	public void setData10(String Data10) {
		this.Data10 = Data10;
	}

	public String getData11() {
		return Data11;
	}

	public void setData11(String Data11) {
		this.Data11 = Data11;
	}

	public String getData12() {
		return Data12;
	}

	public void setData12(String Data12) {
		this.Data12 = Data12;
	}

	public String getData13() {
		return Data13;
	}

	public void setData13(String Data13) {
		this.Data13 = Data13;
	}

	public String getData14() {
		return Data14;
	}

	public void setData14(String Data14) {
		this.Data14 = Data14;
	}

	public String getData15() {
		return Data15;
	}

	public void setData15(String Data15) {
		this.Data15 = Data15;
	}

	public String getData16() {
		return Data16;
	}

	public void setData16(String Data16) {
		this.Data16 = Data16;
	}

	public String getData17() {
		return Data17;
	}

	public void setData17(String Data17) {
		this.Data17 = Data17;
	}

	public String getData18() {
		return Data18;
	}

	public void setData18(String Data18) {
		this.Data18 = Data18;
	}

	public String getData19() {
		return Data19;
	}

	public void setData19(String Data19) {
		this.Data19 = Data19;
	}

	public String getData20() {
		return Data20;
	}

	public void setData20(String Data20) {
		this.Data20 = Data20;
	}

	public Integer getTotal_faltas() {
		return total_faltas;
	}

	public void setTotal_faltas(Integer total_faltas) {
		this.total_faltas = total_faltas;
	}
	
	
	
}
