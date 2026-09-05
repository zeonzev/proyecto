# Proyecto Spring Boot — Estructura de Datos

Aplicación de ejemplo hecha con **Spring Boot** y **Thymeleaf** para el estudio de
**estructuras de datos estáticas y dinámicas**.

## Requisitos

- Java 17 o superior
- Maven (incluido con el wrapper `mvnw`)

## Cómo ejecutar

```bash
./mvnw spring-boot:run
```

En Windows:

```bash
mvnw.cmd spring-boot:run
```

La aplicación arranca en `http://localhost:8080`.

## Estructuras de datos

La ruta `/estructuras` presenta dos tipos de estructuras:

| Tipo | Estructura | Descripción |
| --- | --- | --- |
| **Estática** | Arreglo (`String[]`) | Tamaño fijo definido al crearla. Se accede por índice. |
| **Dinámica** | Lista enlazada | Crece y decrece en tiempo de ejecución. Cada nodo apunta al siguiente. |

La lista enlazada está implementada a mano en:

- `estructuras/Nodo.java` — nodo con valor y referencia al siguiente.
- `estructuras/ListaEnlazada.java` — operaciones `agregar`, `eliminar`, `aLista`, `getTamano`.

Desde la página `/estructuras` se pueden **agregar** y **eliminar** elementos de la lista
para ver cómo cambia su tamaño en tiempo de ejecución.

## Rutas disponibles

| Ruta | Descripción |
| --- | --- |
| `/` | Página de inicio |
| `/estructuras` | Demostración de estructura estática (arreglo) y dinámica (lista enlazada) |
| `/hola` | Endpoint REST que devuelve `Hola mundo` |
| `/saludo` | Saludo con Thymeleaf. Acepta el parámetro `?nombre=` (por defecto `Juan`) |

Ejemplo: `http://localhost:8080/saludo?nombre=Maria`

## Pruebas

```bash
./mvnw test
```

Incluye pruebas unitarias de la lista enlazada en `ListaEnlazadaTest`.
