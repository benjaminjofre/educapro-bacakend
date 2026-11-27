package com.example.backendeduca.dto;

import jakarta.validation.constraints.*;

public record InscripcionRequest(
        @NotBlank String nombre,
        @NotBlank String rut,
        @NotBlank @Email String email,
        @NotBlank String telefono,
        @NotBlank String curso
) {}