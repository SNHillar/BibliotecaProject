# 📚 Sistema de Gestión de Biblioteca en Java

Este proyecto implementa un sistema de gestión de biblioteca orientado a objetos utilizando conceptos fundamentales de la programación en Java como la **abstracción, encapsulamiento, herencia, interfaces, colecciones, patrones de diseño y UML**.

## 🚀 Objetivos Generales

- Modelar una biblioteca con libros físicos y digitales.
- Aplicar principios SOLID y buenas prácticas de diseño.
- Implementar una lógica de negocio completa con una interfaz de usuario interactiva.
- Documentar y estructurar el sistema de manera profesional.

---

## 🧩 Estructura del Proyecto

El desarrollo se organiza en **7 Checkpoints**, cada uno enfocado en un concepto clave de programación orientada a objetos.

---

### ✅ Checkpoint 1: Clases Básicas (Abstracción y Encapsulamiento)

- Clase `Libro` con atributos privados: título, autor, año, ISBN y estado.
- Métodos getters y setters con validaciones (año entre 1900 y actual, ISBN válido).
- Clase `Biblioteca` que contiene un `ArrayList<Libro>`.

🔍 **Objetivo:** Sentar las bases del sistema con una estructura clara y segura.

---

### ✅ Checkpoint 2: Métodos Funcionales y Operaciones Básicas

- Métodos implementados en `Biblioteca`:
  - `agregarLibro(Libro libro)`
  - `listarLibros()`
  - `prestarLibro(String isbn)`
  - `devolverLibro(String isbn)`

🔍 **Objetivo:** Hacer que el sistema sea funcional y permita gestionar libros.

---

### ✅ Checkpoint 3: Herencia y Polimorfismo

- Clase `LibroDigital` que extiende `Libro`.
- Atributo adicional: `tamañoArchivo` (MB).
- Sobrescritura de `toString()` para mostrar detalles del libro digital.
- Biblioteca distingue entre libros físicos y digitales al listarlos.

🔍 **Objetivo:** Extender el sistema usando herencia y modificar comportamientos.

---

### ✅ Checkpoint 4: Interfaces y Flexibilidad

- Interfaz `Prestable` con métodos:
  - `prestar()`
  - `devolver()`
- Clases `Libro` y `LibroDigital` implementan esta interfaz.
- Método `gestionarPrestamo(Prestable prestable)` en `Biblioteca`.

🔍 **Objetivo:** Aplicar interfaces para mejorar la reutilización y flexibilidad del código.

---

### ✅ Checkpoint 5: Collections y Generics

- Uso de `HashMap<String, Libro>` para gestionar préstamos por ISBN.
- Método para consultar disponibilidad de libros en base al ISBN.

🔍 **Objetivo:** Optimizar operaciones usando colecciones avanzadas y generics.

---

### ✅ Checkpoint 6: Diseño y UX

- Diagrama UML del sistema (clases, relaciones, interfaces).
- Interfaz CLI o GUI simple con funcionalidades:
  - Ver libros disponibles.
  - Prestar y devolver libros.
  - Consultar información de un libro por ISBN.

🔍 **Objetivo:** Mejorar la experiencia del usuario y documentar el diseño.

---

### ✅ Checkpoint 7: Optimización y Patrones de Diseño

- Implementación del patrón **Factory Method** para instanciar libros.
- Uso de `HashSet` para evitar duplicados.
- Optimización de búsquedas y rendimiento general.

🔍 **Objetivo:** Aplicar patrones de diseño y optimizar el código para producción.

---

## 📌 Checklist de Progreso

- [x] Abstracción y Encapsulamiento
- [x] Operaciones Básicas y Lógica de Negocio
- [x] Herencia y Polimorfismo
- [ ] Interfaces y Flexibilidad
- [ ] Collections y Generics
- [ ] Documentación y Diseño (UML)
- [ ] Patrones de Diseño y Optimización

---
