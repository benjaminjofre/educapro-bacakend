package com.example.backendeduca.service;

import com.example.backendeduca.model.Curso;
import com.example.backendeduca.repository.CursoRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CursoService {
    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<Curso> listar() {
        return cursoRepository.findAllByOrderByCodigoAsc();
    }
}