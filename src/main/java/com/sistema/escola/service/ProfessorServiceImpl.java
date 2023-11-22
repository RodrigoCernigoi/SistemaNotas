package com.sistema.escola.service;

import com.sistema.escola.data.Professor;
import com.sistema.escola.data.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfessorServiceImpl implements ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    @Override
    public void cadastrarProfessor(Professor professor) {
        professorRepository.save(professor);
    }

    @Override
    public Professor consultarProfessor(Integer professorId) {
        Optional<Professor> optionalProfessor = professorRepository.findById(professorId);
        return optionalProfessor.orElse(null);
    }
}
