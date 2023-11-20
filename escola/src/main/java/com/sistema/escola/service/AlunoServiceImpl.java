/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.escola.service;

import com.sistema.escola.data.Aluno;
import com.sistema.escola.data.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public void cadastrarAluno(Aluno aluno) {
        alunoRepository.cadastrarAluno(aluno);
    }

    @Override
    public Aluno consultarAluno(String alunoId) {
        return alunoRepository.consultarAluno(alunoId);
    }
}
