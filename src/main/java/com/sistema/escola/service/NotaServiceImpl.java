package com.sistema.escola.service;
import com.sistema.escola.data.Nota;
import com.sistema.escola.data.NotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotaServiceImpl implements NotaService {

    @Autowired
    private NotaRepository notaRepository;
    
    @Override
    public List<Nota> consultarTodasNotas() {
        return notaRepository.findAll();
    }

    @Override
    public void salvarNota(Nota nota, Integer usuarioId) {
        notaRepository.save(nota);
    }

    @Override
    public void editarNota(Nota nota, Integer usuarioId) {
        // Implementação para editar a nota no repositório
        // Certifique-se de que a nota já existe no banco de dados (verifique se tem o mesmo ID, por exemplo)
        if (notaRepository.existsById(nota.getId())) {
            notaRepository.save(nota);
        } else {
            
            throw new RuntimeException("A nota com ID " + nota.getId() + " não existe.");
        }
    }

    @Override
    public Nota consultarNota(Integer usuarioId, String disciplina, String tempo) {
        return notaRepository.findByUsuarioIdAndDisciplinaAndTempo(usuarioId, disciplina, tempo);
    }

    @Override
    public List<Nota> consultarNotasMediaAbaixo() {
        double mediaLimite = 5.0;  
        return notaRepository.findByMediaLessThan(mediaLimite);
    }

    @Override
    public List<Nota> consultarNotasMediaAcima() {
        double mediaLimite = 7.0; 
        return notaRepository.findByMediaGreaterThan(mediaLimite);
    }
}
