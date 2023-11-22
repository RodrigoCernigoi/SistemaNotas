package com.sistema.escola.controller;

import com.sistema.escola.data.Aluno;
import com.sistema.escola.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping("/form")
    public String alunoForm() {
        return "aluno-form";
    }

    @PostMapping("/cadastrar")
    public String cadastrarAluno(@ModelAttribute Aluno aluno) {
        alunoService.cadastrarAluno(aluno);
        return "redirect:/aluno/form";
    }

    @GetMapping("/consulta")
    public String consultarAlunoForm() {
        return "aluno-consulta-form";
    }

    @GetMapping("/consultar")
    public String consultarAluno(@RequestParam Integer alunoId, Model model) {
        Aluno aluno = alunoService.consultarAluno(alunoId);
        model.addAttribute("alunos", aluno);
        return "aluno-consulta-result";
    }
}
