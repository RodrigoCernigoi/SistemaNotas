/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.escola.service;

import com.sistema.escola.data.Nota;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Rodrigo
 */
@Service
public interface NotaService {

    void salvarNota(Nota nota, Integer usuarioId);
    void editarNota(Nota nota, Integer usuarioId);
    Nota consultarNota(Integer usuarioId, String disciplina, String tempo);
    List<Nota> consultarNotasMediaAbaixo();
    List<Nota> consultarNotasMediaAcima();

    List<Nota> consultarTodasNotas();
}
