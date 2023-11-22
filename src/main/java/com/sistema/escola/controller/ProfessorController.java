package com.sistema.escola.controller;

import com.sistema.escola.data.Professor;
import com.sistema.escola.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/professor")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @GetMapping("/form")
    public String professorForm() {
        return "professor-form";
    }

    @PostMapping("/cadastrar")
    public String cadastrarProfessor(@ModelAttribute Professor professor) {
        professorService.cadastrarProfessor(professor);
        return "redirect:/professor/form";
    }

    @GetMapping("/consulta")
    public String consultarProfessorForm() {
        return "professor-consulta-form";
    }

    @GetMapping("/consultar")
    public String consultarProfessor(@RequestParam Integer professorId, Model model) {
        Professor professor = professorService.consultarProfessor(professorId);
        model.addAttribute("professores", professor);
        return "professor-consulta-result";
    }
}
