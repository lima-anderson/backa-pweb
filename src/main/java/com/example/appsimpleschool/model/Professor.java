package com.example.appsimpleschool.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Professor extends Pessoa {

	@OneToOne(cascade = CascadeType.ALL)
	private Disciplina disciplina;

	public Professor() {

	}

	public Professor(Disciplina disciplina) {
		super();
		this.disciplina = disciplina;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

}
