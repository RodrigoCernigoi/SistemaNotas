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

    void salvarNota(Nota nota, String usuarioId);
    void editarNota(Nota nota, String usuarioId);
    Nota consultarNota(String usuarioId, String disciplina, String tempo);
    List<Nota> consultarNotasMediaAbaixo(String usuarioId);
    List<Nota> consultarNotasMediaAcima(String usuarioId);
}
