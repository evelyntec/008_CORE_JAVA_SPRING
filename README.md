# 🎬 Spring Boot · API de películas y directores

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.3.0-6DB33F?logo=springboot&logoColor=white) ![Java](https://img.shields.io/badge/Java-17-ED8B00?logo=openjdk&logoColor=white) ![Maven](https://img.shields.io/badge/Maven-C71A36?logo=apachemaven&logoColor=white)

API web construida con **Spring Boot** y `@RestController` que permite consultar un catálogo de películas animadas y filtrarlas por director.

> Ejercicio del **Bootcamp Full Stack Java (2026)**.

## ✨ Rutas disponibles

| Método | Ruta | Descripción |
|---|---|---|
| `GET` | `/peliculas` | Lista todas las películas |
| `GET` | `/peliculas/{nombre}` | Muestra el director de una película |
| `GET` | `/peliculas/director/{nombre}` | Lista las películas de un director |

## 🧠 Conceptos aplicados

- Controladores REST con `@RestController` y `@GetMapping`.
- Parámetros de ruta con `@PathVariable`.
- Datos en memoria con `HashMap` y manejo de resultados no encontrados.

## ▶️ Cómo ejecutarlo

Requisitos: JDK 17 y Maven 3.9 o superior.

```bash
git clone https://github.com/evelyntec/spring-mvc-peliculas-directores.git
cd spring-mvc-peliculas-directores
mvn spring-boot:run
```

Luego abre <http://localhost:8080/peliculas> en el navegador.

Ejemplo: <http://localhost:8080/peliculas/director/Don%20Hall>

---

## 👩‍💻 Autora

**Evelyn Álvarez Vásquez** · Técnica en Informática en formación (IPLACEX) · Profesora y Magíster en Didáctica de la Matemática

[![LinkedIn](https://img.shields.io/badge/LinkedIn-profesoraevelyn-0A66C2?logo=linkedin&logoColor=white)](https://www.linkedin.com/in/profesoraevelyn/)
[![GitHub](https://img.shields.io/badge/GitHub-evelyntec-181717?logo=github&logoColor=white)](https://github.com/evelyntec)
[![Web](https://img.shields.io/badge/Web-profesoraevelyn.com-00B8D9?logo=googlechrome&logoColor=white)](https://profesoraevelyn.com)
