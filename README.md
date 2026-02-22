Advanced Employee Management REST API :

  -- A production-style Employee Management REST API built using Spring Boot and MySQL, following clean layered architecture and RESTful design principles.

Features :

  -- Full CRUD operations

  -- DTO pattern for API-layer separation

  -- Request validation using Jakarta Validation

  -- Global exception handling

  -- Structured JSON error responses

  -- Pagination and sorting support

  -- Proper HTTP status code usage

Tech Stack :

  -- Java

  -- Spring Boot

  -- Spring Data JPA (Hibernate)

  -- MySQL

  -- Maven

  -- Postman

Architecture :

The project follows a layered architecture:

  -- Controller → Service → Repository → Database

  -- Controller handles HTTP requests and responses

  -- Service contains business logic

  -- Repository manages database operations

  -- DTOs decouple request/response models from entities

API Endpoints :

  -- POST /api/employees – Create employee

  -- GET /api/employees – Get all employees (pagination supported)

  -- GET /api/employees/{id} – Get employee by ID

  -- PUT /api/employees/{id} – Update employee

  -- DELETE /api/employees/{id} – Delete employee

Sample Pagination Request :

  -- GET /api/employees?page=0&size=5&sort=firstName,asc

Author :

   Maran R
   Backend Developer – Java & Spring Boot
