User Management API — CRUD com Spring Boot & PostgreSQL

Este projeto é uma API REST desenvolvida com Spring Boot, focada no cadastro e gerenciamento de usuários.
Inclui operações completas de CRUD (Create, Read, Update, Delete), integração com PostgreSQL, validação de dados, e arquitetura limpa para servir como base de estudos ou aplicações reais.

🚀 Tecnologias Utilizadas

Java 17+

Spring Boot

Spring Data JPA

Hibernate

PostgreSQL

Lombok

Validation API

Maven

📂 Funcionalidades

Criar usuários

Listar todos os usuários

Buscar usuário por ID

Atualizar dados

Excluir usuário

Validação automática dos campos (@NotBlank, @Email, etc.)

🔧 Como executar o projeto
1️⃣ Clonar o repositório
git clone https://github.com/SEU-USUARIO/seu-repositorio.git
cd seu-repositorio

2️⃣ Ajustar o application.properties
spring.datasource.url=jdbc:postgresql://localhost:5432/seubanco
spring.datasource.username=postgres
spring.datasource.password=suasenha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

3️⃣ Executar o projeto
mvn spring-boot:run

📌 Rotas principais
Método	Rota	Descrição
POST	/users	Criar usuário
GET	/users	Listar usuários
GET	/users/{id}	Buscar por ID
PUT	/users/{id}	Atualizar usuário
DELETE	/users/{id}	Remover usuário
🗂️ Modelo de JSON para criação
{
  "name": "Maria Souza",
  "email": "maria@gmail.com"
}

🎯 Objetivo

Este projeto foi criado com foco em aprendizado, boas práticas, e no uso de Spring Boot + PostgreSQL para desenvolvimento de APIs de forma moderna e escalável.

📄 Licença

Este projeto é livre para estudo e modificação.
