package com.example.backendeduca.service;

import com.example.backendeduca.dto.InscripcionRequest;
import com.example.backendeduca.model.Inscripcion;
import com.example.backendeduca.repository.InscripcionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class InscripcionService {
    private final InscripcionRepository repository;

    public InscripcionService(InscripcionRepository repository) {
        this.repository = repository;
    }

    public Inscripcion inscribir(InscripcionRequest req) {
        Inscripcion ins = repository.findByRut(req.rut()).orElseGet(Inscripcion::new);

        if (ins.isPagado()) {
            throw new ResponseStatusException(HttpStatus.CONFLICT,
                    "Este RUT ya tiene una matrícula pagada");
        }

        ins.setNombre(req.nombre());
        ins.setRut(req.rut());
        ins.setEmail(req.email());
        ins.setTelefono(req.telefono());
        ins.setCurso(req.curso());
        ins.setPagado(false);
        return repository.save(ins);
    }

    public Inscripcion pagar(String rut) {
        Inscripcion ins = repository.findByRut(rut)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Estudiante no encontrado"));

        if (!ins.isPagado()) {
            ins.setPagado(true);
            repository.save(ins);
        }
        return ins;
    }
}