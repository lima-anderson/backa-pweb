package com.example.appsimpleschool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.appsimpleschool.model.Professor;
import com.example.appsimpleschool.repositorios.ProfessorRepository;

@Service
public class ProfessorService {

	@Autowired
	private ProfessorRepository professorRepository;

	public List<Professor> listarProfessores() {

		return this.professorRepository.findAll();
	}

	public Professor listarProfessorPorId(Long idProfessor) {
		return this.professorRepository.findById(idProfessor).orElse(null);
	}

	public Professor inserirOuAtualizar(Professor professor) {
		return this.professorRepository.save(professor);
	}

//    @Transactional
//    public Professor inserirOuAtualizar(Professor professor) {
//        Professor professorInserido = this.professorRepository.save(professor);
//        if (professor.getIdade() < 18) {
//            throw new RuntimeException("Menor de idade não permitido");
//        }
//        return professorInserido;
//    }

//    public Professor inserirProfessor(Professor professor){
	// Professor p = new Professor();

	// return this.professorRepository.save(professor);
//  }
	public void remover(Long id) {
		this.professorRepository.deleteById(id);
	}
}
