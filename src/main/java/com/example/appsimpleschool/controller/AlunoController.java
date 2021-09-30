package com.example.appsimpleschool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.appsimpleschool.model.Aluno;
import com.example.appsimpleschool.service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	@Autowired
	private AlunoService alunoService;

	@GetMapping
	public List<Aluno> listarAlunos() {
		return alunoService.listarAlunos();
	}

	@GetMapping("/{id}")
	public Aluno listarAlunoPorId(@PathVariable("id") Long idAluno) {
		return alunoService.listarAlunoPorId(idAluno);
	}

	@PostMapping
	public Aluno inserirAluno(@RequestBody Aluno aluno) {
		return alunoService.inserirOuAtualizar(aluno);
	}

	@PutMapping
	public Aluno atualizarAluno(@RequestBody Aluno aluno) {

		return alunoService.inserirOuAtualizar(aluno);
	}

	@DeleteMapping("/{id}")
	public void remover(@PathVariable("id") Long id) {
		alunoService.remover(id);
	}
}
