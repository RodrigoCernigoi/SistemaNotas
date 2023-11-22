/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sistema.escola.service;
import com.sistema.escola.data.Aluno;
/**
 *
 * @author Rodrigo
 */
public interface AlunoService {
    void cadastrarAluno(Aluno aluno);
    Aluno consultarAluno(Integer alunoId);

}
