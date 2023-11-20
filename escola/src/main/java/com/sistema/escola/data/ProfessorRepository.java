/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sistema.escola.data;


public interface ProfessorRepository {
    void cadastrarProfessor(Professor professor);
    Professor consultarProfessor(String professorId);
}
