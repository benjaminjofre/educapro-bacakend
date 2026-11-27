package com.example.backendeduca.config;

import com.example.backendeduca.model.Curso;
import com.example.backendeduca.repository.CursoRepository;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner cargarCursos(CursoRepository repo) {
        return args -> {
            if (repo.count() > 0) return;
            repo.saveAll(List.of(
                    new Curso("CRS001", "Fundamentos de Programación", "Tecnología", "40 horas", 25, 850, "Juan López", 250000,
                            "https://images.unsplash.com/photo-1516321318423-f06f85e504b3?w=500"),
                    new Curso("CRS002", "Diseño Gráfico Digital", "Diseño", "35 horas", 20, 600, "María González", 220000,
                            "https://images.unsplash.com/photo-1555066931-4365d14bab8c?w=500"),
                    new Curso("CRS003", "Marketing Digital", "Marketing", "30 horas", 25, 750, "Carlos Soto", 200000,
                            "https://images.unsplash.com/photo-1522071820081-009f0129c71c?w=500"),
                    new Curso("CRS004", "Electrónica Básica", "Oficios Técnicos", "45 horas", 15, 450, "Luis Pérez", 280000,
                            "https://images.unsplash.com/photo-1581092160607-ee22621dd758?w=500"),
                    new Curso("CRS005", "Gestión de Proyectos", "Administración", "35 horas", 20, 550, "Ana Rodríguez", 230000,
                            "https://images.unsplash.com/photo-1454165804606-c3d57bc86b40?w=500")
            ));
        };
    }
}