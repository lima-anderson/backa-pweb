package com.example.appsimpleschool.repositorios;

import com.example.appsimpleschool.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
    public List<Professor> findByIdadeAndCpf(Integer idade, String cpf);

    @Query("SELECT p From Professor p where p.idade>0")
    public List<Professor> getProfessores();
}
