package com.mycompany.gestionestudiantes;

public class Estudiante {
    private String nombre;
    private Expediente expediente; // Navegación: Estudiante -> Expediente

    public Estudiante(String nombre, Expediente expediente) {
        this.nombre = nombre;
        this.expediente = expediente;
    }

    public String getNombre() {
        return nombre;
    }

    public Expediente getExpediente() {
        return expediente;
    }
}