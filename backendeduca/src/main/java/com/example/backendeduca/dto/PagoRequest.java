package com.example.backendeduca.dto;

import jakarta.validation.constraints.NotBlank;

public record PagoRequest(@NotBlank String rut) {}