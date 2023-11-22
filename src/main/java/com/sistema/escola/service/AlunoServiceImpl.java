package com.sistema.escola.service;

import com.sistema.escola.data.Aluno;
import com.sistema.escola.data.AlunoRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public void cadastrarAluno(Aluno aluno) {
        alunoRepository.save(aluno);
    }

    @Override
    public Aluno consultarAluno(Integer id) {
        Optional<Aluno> alunoOptional = alunoRepository.findById(id);
        return alunoOptional.orElse(null); // ou lançar uma exceção se necessário
    }
}
