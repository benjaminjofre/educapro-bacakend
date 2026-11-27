package com.example.backendeduca.controller;

import com.example.backendeduca.model.Curso;
import com.example.backendeduca.service.CursoService;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {
    private final CursoService service;

    public CursoController(CursoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Curso> listar() {
        return service.listar();
    }
}