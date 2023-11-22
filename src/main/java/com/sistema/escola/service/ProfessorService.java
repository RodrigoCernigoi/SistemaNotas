/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sistema.escola.service;
import com.sistema.escola.data.Professor;
/**
 *
 * @author Rodrigo
 */
public interface ProfessorService {
    void cadastrarProfessor(Professor professor);
    Professor consultarProfessor(Integer professorId);

}
