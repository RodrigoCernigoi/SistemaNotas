package com.sistema.escola.data;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class AlunoRepositoryImpl implements AlunoRepository {

    private Map<String, Aluno> alunos = new HashMap<>();

    @Override
    public void cadastrarAluno(Aluno aluno) {
        alunos.put(aluno.getId(), aluno);
    }

    @Override
    public Aluno consultarAluno(String alunoId) {
        return alunos.get(alunoId);
    }
}
