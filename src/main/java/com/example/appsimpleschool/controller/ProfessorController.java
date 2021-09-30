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

import com.example.appsimpleschool.model.Professor;
import com.example.appsimpleschool.service.ProfessorService;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

	@Autowired
	private ProfessorService professorService;

	@GetMapping
	public List<Professor> listarProfessores() {
		return this.professorService.listarProfessores();
	}

	@GetMapping("/{id}")
	public Professor listarProfessorPorId(@PathVariable("id") Long idProfessor) {
		return this.professorService.listarProfessorPorId(idProfessor);
	}

	@PostMapping
	public Professor inserirProfessor(@RequestBody Professor professor) {
		return this.professorService.inserirOuAtualizar(professor);
	}

	@PutMapping
	public Professor atualizarProfessor(@RequestBody Professor professor) {

		return this.professorService.inserirOuAtualizar(professor);
	}

	@DeleteMapping("/{id}")
	public void remover(@PathVariable("id") Long id) {
		this.professorService.remover(id);
	}

}
