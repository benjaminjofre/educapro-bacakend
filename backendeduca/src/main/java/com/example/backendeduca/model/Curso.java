package com.example.backendeduca.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cursos")
public class Curso {
    @Id
    private String codigo;
    private String nombre;
    private String area;
    private String duracion;
    private int cuposSeccion;
    private int totalAnual;
    private String profesor;
    private int precio;
    @Column(length = 500)
    private String img;

    public Curso() {}

    public Curso(String codigo, String nombre, String area, String duracion, int cuposSeccion,
                 int totalAnual, String profesor, int precio, String img) {
        this.codigo = codigo; this.nombre = nombre; this.area = area; this.duracion = duracion;
        this.cuposSeccion = cuposSeccion; this.totalAnual = totalAnual;
        this.profesor = profesor; this.precio = precio; this.img = img;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public String getArea() { return area; }
    public String getDuracion() { return duracion; }
    public int getCuposSeccion() { return cuposSeccion; }
    public int getTotalAnual() { return totalAnual; }
    public String getProfesor() { return profesor; }
    public int getPrecio() { return precio; }
    public String getImg() { return img; }
}