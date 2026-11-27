package com.example.backendeduca.repository;

import com.example.backendeduca.model.Inscripcion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscripcionRepository extends JpaRepository<Inscripcion, Long> {
    Optional<Inscripcion> findByRut(String rut);
    long countByPagadoTrue();
}