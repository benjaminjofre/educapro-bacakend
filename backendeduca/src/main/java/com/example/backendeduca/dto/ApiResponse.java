package com.example.backendeduca.dto;

public record ApiResponse<T>(String message, T data) {}