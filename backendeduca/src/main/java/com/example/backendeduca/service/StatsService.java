package com.example.backendeduca.service;

import com.example.backendeduca.dto.StatsResponse;
import com.example.backendeduca.repository.InscripcionRepository;
import org.springframework.stereotype.Service;

@Service
public class StatsService {
    private static final int BASE_MATRICULAS = 3200;
    private final InscripcionRepository repository;

    public StatsService(InscripcionRepository repository) {
        this.repository = repository;
    }

    public StatsResponse obtener() {
        int total = BASE_MATRICULAS + (int) repository.countByPagadoTrue();
        return new StatsResponse(total, "92%", "24h");
    }
}