/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sistema.escola.service;
import com.sistema.escola.data.Nota;
import com.sistema.escola.data.NotaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotaServiceImpl implements NotaService {

    @Autowired
    private NotaRepository notaRepository;

    @Override
    public void salvarNota(Nota nota, String usuarioId) {
        // Implementação para salvar a nota no repositório
        notaRepository.salvarNota(nota, usuarioId);
    }

    @Override
    public void editarNota(Nota nota, String usuarioId) {
        // Implementação para editar a nota no repositório
        notaRepository.editarNota(nota, usuarioId);
    }

    @Override
    public Nota consultarNota(String usuarioId, String disciplina, String tempo) {
        // Implementação para consultar a nota no repositório
        return notaRepository.consultarNota(usuarioId, disciplina, tempo);
    }

    @Override
    public List<Nota> consultarNotasMediaAbaixo(String usuarioId) {
        // Implementação para consultar notas abaixo da média no repositório
        return notaRepository.consultarNotasMediaAbaixo(usuarioId);
    }

    @Override
    public List<Nota> consultarNotasMediaAcima(String usuarioId) {
        // Implementação para consultar notas acima da média no repositório
        return notaRepository.consultarNotasMediaAcima(usuarioId);
    }
}
