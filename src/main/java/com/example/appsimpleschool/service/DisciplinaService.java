package com.example.appsimpleschool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.appsimpleschool.model.Disciplina;
import com.example.appsimpleschool.repositorios.DisciplinaRepository;

@Service
public class DisciplinaService {

	@Autowired
	private DisciplinaRepository disciplinaRepository;

	public List<Disciplina> listarDisciplinaes() {

		return this.disciplinaRepository.findAll();
	}

	public Disciplina listarDisciplinaPorId(Long idDisciplina) {
		return this.disciplinaRepository.findById(idDisciplina).orElse(null);
	}

	public Disciplina inserirOuAtualizar(Disciplina professor) {
		return this.disciplinaRepository.save(professor);
	}

	public void remover(Long id) {
		this.disciplinaRepository.deleteById(id);
	}
}
