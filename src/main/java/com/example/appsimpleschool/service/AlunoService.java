package com.example.appsimpleschool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.appsimpleschool.model.Aluno;
import com.example.appsimpleschool.repositorios.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository alunoRepository;

	public List<Aluno> listarAlunos() {

		return this.alunoRepository.findAll();
	}

	public Aluno listarAlunoPorId(Long idAluno) {
		return this.alunoRepository.findById(idAluno).orElse(null);
	}

	public Aluno inserirOuAtualizar(Aluno aluno) {
		return this.alunoRepository.save(aluno);
	}

	public void remover(Long id) {
		this.alunoRepository.deleteById(id);
	}
}
