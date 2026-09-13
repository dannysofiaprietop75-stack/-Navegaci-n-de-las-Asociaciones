package com.mycompany.gestionestudiantes;

public class GestionEstudiantes {

    public static void main(String[] args) {
        // 1. Crear el Expediente
        Expediente exp = new Expediente("EXP-2026-101");

        // 2. Crear el Estudiante asignándole el expediente
        Estudiante est = new Estudiante("Ana Prieto", exp);

        // 3. Probar la navegación
        System.out.println("Estudiante: " + est.getNombre());
        System.out.println("Código de Expediente: " + est.getExpediente().getCodigo());
    }
}
