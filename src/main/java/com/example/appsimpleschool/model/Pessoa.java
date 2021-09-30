package com.example.appsimpleschool.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
abstract class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	private String nome;
	private String cpf;
	private Integer idade;
	private String dataAdm;
	private String sexo;

	public Pessoa() {

	}

	public Pessoa(String nome, String cpf, Integer idade, String dataAdm, String sexo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.dataAdm = dataAdm;
		this.sexo = sexo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getDataAdm() {
		return dataAdm;
	}

	public void setDataAdm(String dataAdm) {
		this.dataAdm = dataAdm;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
