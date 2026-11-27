package com.example.backendeduca.controller;

import com.example.backendeduca.dto.ApiResponse;
import com.example.backendeduca.dto.InscripcionRequest;
import com.example.backendeduca.dto.PagoRequest;
import com.example.backendeduca.model.Inscripcion;
import com.example.backendeduca.service.InscripcionService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class InscripcionController {
    private final InscripcionService service;

    public InscripcionController(InscripcionService service) {
        this.service = service;
    }

    @PostMapping("/inscribir")
    @ResponseStatus(HttpStatus.CREATED)
    public ApiResponse<Inscripcion> inscribir(@Valid @RequestBody InscripcionRequest req) {
        return new ApiResponse<>("Inscripción registrada", service.inscribir(req));
    }

    @PostMapping("/pagar")
    public ApiResponse<Inscripcion> pagar(@Valid @RequestBody PagoRequest req) {
        return new ApiResponse<>("Pago completado con éxito", service.pagar(req.rut()));
    }
}