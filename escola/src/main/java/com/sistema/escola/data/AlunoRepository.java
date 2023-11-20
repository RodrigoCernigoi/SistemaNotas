/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sistema.escola.data;

/**
 *
 * @author Rodrigo
 */

public interface AlunoRepository {
    void cadastrarAluno(Aluno aluno);
    Aluno consultarAluno(String alunoId);
}
