package com.example.appsimpleschool.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.appsimpleschool.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
