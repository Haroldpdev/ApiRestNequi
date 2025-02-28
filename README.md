# ApiRestNequi

# API REST - Franquicias

Esta es una API REST desarrollada en **Spring Boot** que permite gestionar **franquicias**, **sucursales** y **productos**. 

- **Franquicia**: Contiene un listado de sucursales.
- **Sucursal**: Contiene un listado de productos.
- **Producto**: Tiene un nombre y un stock disponible.

## 🚀 Tecnologías Utilizadas
- **Java 17**
- **Spring Boot 3**
- **Maven**
- **MySQL** (Base de datos relacional)
- **JPA/Hibernate** (ORM para la persistencia de datos)
- **Lombok** (Reducción de código repetitivo)

---
 Configuración y Despliegue en Entorno Local

1: Clonar el repositorio**

2: Configurar la base de datos**
Se debe contar con **MySQL** instalado y configurar la base de datos. Crea una base de datos llamada `FinalApiRest` con:


3: Configurar el archivo `application.properties`**
Edita `src/main/resources/application.properties` y coloca tus credenciales de MySQL, Ejemplo:
```properties
spring.application.name=FinalApiRestPrueba
spring.datasource.url=jdbc:mysql://localhost:3306/FinalApiRest?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# Configuración de Hibernate

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

La API se ejecutará en `http://localhost:8080`

---

Endpoints Disponibles


Crear una franquicia
Agregar una sucursal a una franquicia
Agregar Producto a una sucursal
Obtener el producto con más stock 
Modificar stock de un producto
Actualizar nombre Franquicia
Eliminar Producto



