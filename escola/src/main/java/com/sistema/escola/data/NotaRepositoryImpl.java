package com.sistema.escola.data;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class NotaRepositoryImpl implements NotaRepository {

    // Simulando um repositório em memória
    private Map<String, List<Nota>> notasPorUsuario = new HashMap<>();

    @Override
    public void salvarNota(Nota nota, String usuarioId) {
        List<Nota> notasUsuario = notasPorUsuario.getOrDefault(usuarioId, new ArrayList<>());
        notasUsuario.add(nota);
        notasPorUsuario.put(usuarioId, notasUsuario);
    }

    @Override
    public void editarNota(Nota nota, String usuarioId) {
        List<Nota> notasUsuario = notasPorUsuario.get(usuarioId);
        if (notasUsuario != null) {
            // Implementação para editar a nota
            // Pode ser necessário procurar a nota específica e atualizar seus valores
        }
    }

    @Override
    public Nota consultarNota(String usuarioId, String disciplina, String tempo) {
        List<Nota> notasUsuario = notasPorUsuario.get(usuarioId);
        if (notasUsuario != null) {
            // Implementação para consultar a nota
            // Pode ser necessário procurar a nota específica com base na disciplina e tempo
        }
        return null; // Retornar null se a nota não for encontrada
    }

    @Override
    public List<Nota> consultarNotasMediaAbaixo(String usuarioId) {
        // Implementação para consultar notas abaixo da média
        // Pode ser necessário calcular a média e filtrar as notas
        return new ArrayList<>(); // Retorna uma lista vazia para este exemplo
    }

    @Override
    public List<Nota> consultarNotasMediaAcima(String usuarioId) {
        // Implementação para consultar notas acima da média
        // Pode ser necessário calcular a média e filtrar as notas
        return new ArrayList<>(); // Retorna uma lista vazia para este exemplo
    }
}
