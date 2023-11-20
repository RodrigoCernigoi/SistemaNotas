package com.sistema.escola.data;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class ProfessorRepositoryImpl implements ProfessorRepository {

    private Map<String, Professor> professores = new HashMap<>();

    @Override
    public void cadastrarProfessor(Professor professor) {
        professores.put(professor.getId(), professor);
    }

    @Override
    public Professor consultarProfessor(String professorId) {
        return professores.get(professorId);
    }
}
