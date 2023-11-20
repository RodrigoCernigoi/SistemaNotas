package com.sistema.escola.data;


import java.util.List;


public interface NotaRepository {

    void salvarNota(Nota nota, String usuarioId);

    void editarNota(Nota nota, String usuarioId);

    Nota consultarNota(String usuarioId, String disciplina, String tempo);

    List<Nota> consultarNotasMediaAbaixo(String usuarioId);

    List<Nota> consultarNotasMediaAcima(String usuarioId);
}
