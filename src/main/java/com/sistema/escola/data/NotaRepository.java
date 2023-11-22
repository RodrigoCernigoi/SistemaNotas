package com.sistema.escola.data;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface NotaRepository extends JpaRepository<Nota, Integer> {
    
    // Método para consultar uma nota
    Nota findByUsuarioIdAndDisciplinaAndTempo(Integer usuarioId, String disciplina, String tempo);

    // Método para consultar notas com média abaixo
    List<Nota> findByMediaLessThan( double media);

    // Método para consultar notas com média acima
    List<Nota> findByMediaGreaterThan( double media);
}
