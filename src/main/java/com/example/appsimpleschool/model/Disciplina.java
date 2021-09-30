package com.example.appsimpleschool.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Disciplina {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;

	@OneToOne(cascade = CascadeType.ALL)
	private Professor professor;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Aluno> alunos;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Notas> notas;

	public Disciplina() {

	}

	public Disciplina(String nome) {
		super();
		this.nome = nome;
	}

	public Disciplina(String nome, Professor professor) {
		super();
		this.nome = nome;
		this.professor = professor;
	}

	public Disciplina(String nome, List<Notas> notas) {
		super();
		this.nome = nome;
		this.notas = notas;
	}

	public Disciplina(String nome, Professor professor, List<Aluno> alunos, List<Notas> notas) {
		super();
		this.nome = nome;
		this.professor = professor;
		this.alunos = alunos;
		this.notas = notas;
	}

	public Disciplina(String nome, Professor professor, List<Aluno> alunos) {
		this.nome = nome;
		this.professor = professor;
		this.alunos = alunos;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

}
