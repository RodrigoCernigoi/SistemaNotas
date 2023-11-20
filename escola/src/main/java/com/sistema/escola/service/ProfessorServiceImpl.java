/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.escola.service;

import com.sistema.escola.data.Professor;
import com.sistema.escola.data.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorServiceImpl implements ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    @Override
    public void cadastrarProfessor(Professor professor) {
        professorRepository.cadastrarProfessor(professor);
    }

    @Override
    public Professor consultarProfessor(String professorId) {
        return professorRepository.consultarProfessor(professorId);
    }
}
