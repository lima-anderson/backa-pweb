package com.example.appsimpleschool.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Aluno extends Pessoa {

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Disciplina> disciplinas;

	public Aluno() {

	}

	public Aluno(List<Disciplina> disciplinas) {
		super();
		this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

}
