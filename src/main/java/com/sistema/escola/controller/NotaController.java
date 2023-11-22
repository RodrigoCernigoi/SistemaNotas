package com.sistema.escola.controller;

import com.sistema.escola.data.Nota;
import com.sistema.escola.service.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/nota")
public class NotaController {

    @Autowired
    private NotaService notaService;

    @GetMapping("/form")
    public String notaForm() {
        return "nota-form";
    }

    @PostMapping("/salvar")
    public String salvarNota(@ModelAttribute Nota nota, @RequestParam Integer usuarioId) {
        notaService.salvarNota(nota, usuarioId);
        return "redirect:/nota/form";
    }

    @GetMapping("/consulta")
    public String consultarNotaForm() {
        return "nota-consulta-form";
    }
    @GetMapping("/consultarTodas")
    public String consultarTodasNotas(Model model) {
        List<Nota> notas = notaService.consultarTodasNotas();
        model.addAttribute("notas", notas);
        return "nota-consulta-result";
    }
    @GetMapping("/mediaAbaixo")
    public String consultarNotasMediaAbaixo(Model model) {
        List<Nota> notas = notaService.consultarNotasMediaAbaixo();
        model.addAttribute("notas", notas);
        return "nota-consulta-result";
    }

    @GetMapping("/mediaAcima")
    public String consultarNotasMediaAcima(Model model) {
        List<Nota> notas = notaService.consultarNotasMediaAcima();
        model.addAttribute("notas", notas);
        return "nota-consulta-result";
    }
}
