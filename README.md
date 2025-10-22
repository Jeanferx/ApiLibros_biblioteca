**README – ApiLibros_biblioteca**

markdown
# ApiLibros_biblioteca

Microservicio desarrollado en **Spring Boot** para la gestión de los **libros** de la biblioteca.  
Forma parte del sistema modular junto con los microservicios de usuarios y sucursales.

---

## Tecnologías

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- MySQL
- Swagger (documentación de API)

---

## Funcionalidades

- Registrar nuevos libros  
- Listar libros por categoría o autor  
- Buscar libro por ID o título  
- Actualizar información (cantidad, autor, año, etc.)  
- Eliminar o marcar como no disponible  

---

## Endpoints

| Método | Endpoint | Descripción |
|--------|-----------|-------------|
| GET | `/api/libros` | Lista todos los libros |
| GET | `/api/libros/{id}` | Busca libro por ID |
| POST | `/api/libros` | Agrega nuevo libro |
| PUT | `/api/libros/{id}` | Actualiza libro existente |
| DELETE | `/api/libros/{id}` | Elimina libro |

---

## Ejecución local

```bash
git clone https://github.com/Jeanferx/ApiLibros_biblioteca.git
