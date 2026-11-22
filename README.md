# U3-ejercicio11
# 📒 Gestión de Calificaciones en una Libreta Digital

Ejercicio de **Programación Orientada a Objetos en Java** que modela la libreta de calificaciones de un alumno aplicando el principio de **encapsulamiento**. La lista de notas es privada y todo cambio pasa por un filtro que valida el rango permitido; el promedio se calcula internamente sin exponer la estructura de datos.

## 🎯 Objetivo

Administrar las notas de un alumno de forma privada, exponiendo únicamente métodos seguros para agregar calificaciones y consultar su estado académico.

## ✨ Características

- Atributos privados: nombre del estudiante y lista de notas (`List<Double>`).
- `agregarNota(double nota)`: valida que la nota esté entre 0.0 y 10.0 antes de almacenarla, rechazando también valores no numéricos (`NaN`).
- `obtenerPromedio()`: calcula internamente el promedio de las notas ocultas.
- `obtenerEstadoAcademico()`: indica si el alumno está aprobado, desaprobado o sin notas.
- `getNotas()` devuelve una **copia** de la lista, por lo que no se pueden alterar las notas reales desde afuera.
- Manejo del caso sin notas cargadas (promedio 0.0) para evitar división por cero.

## 📚 Conceptos aplicados

Encapsulamiento · Modificadores de acceso · Colecciones (`ArrayList`) · Validación de datos · Copia defensiva · Constructores · Métodos privados y públicos

![U3 ejercicio11](U3%20ejercicio11.png)

