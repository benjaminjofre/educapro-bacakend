package com.example.backendeduca.repository;

import com.example.backendeduca.model.Curso;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, String> {
    List<Curso> findAllByOrderByCodigoAsc();
}