package com.example.backendeduca.controller;

import com.example.backendeduca.dto.StatsResponse;
import com.example.backendeduca.service.StatsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/stats")
public class StatsController {
    private final StatsService service;

    public StatsController(StatsService service) {
        this.service = service;
    }

    @GetMapping
    public StatsResponse obtener() {
        return service.obtener();
    }
}