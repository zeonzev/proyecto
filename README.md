# Proyecto Spring Boot

Aplicación de ejemplo hecha con **Spring Boot** y **Thymeleaf**.

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

## Rutas disponibles

| Ruta | Descripción |
| --- | --- |
| `/` | Página de inicio estática |
| `/hola` | Endpoint REST que devuelve `Hola mundo` |
| `/saludo` | Saludo con Thymeleaf. Acepta el parámetro `?nombre=` (por defecto `Juan`) |

Ejemplo: `http://localhost:8080/saludo?nombre=Maria`
