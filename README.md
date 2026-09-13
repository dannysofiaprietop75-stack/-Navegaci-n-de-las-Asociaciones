# Proyecto: Gestión de Estudiantes y Expedientes

Este proyecto demuestra la implementación de una **asociación unidireccional de 1 a 1** entre clases en Java, modelando la relación entre un `Estudiante` y su `Expediente`.

---

## 📐 Diagrama de Clases UML

```mermaids
classDiagram
    direction LR
    class Estudiante {
        -String nombre
        -Expediente expediente
        +Estudiante(String nombre, Expediente expediente)
        +getNombre() String
        +getExpediente() Expediente
    }

    class Expediente {
        -String codigo
        +Expediente(String codigo)
        +getCodigo() String
    }

    Estudiante "1" --> "1" Expediente : tiene / navega