### E-commerce Application

Este é um projeto de e-commerce construído com Spring Boot, Spring Security, JWT e MongoDB.

## Configuração do Projeto

### `application.properties`

```properties
spring.application.name=E-commerce
spring.data.mongodb.uri=mongodb://localhost:27017/bd_user
server.port=8080
jwt.secret=YiGzXuHNU6bBR8GDghaf3zetrHLi1zA7VerVeMsEOFOzjeT1pCPQxE7cpx0WVcvBfUEx/AXIpYdIoX7JzcNkAg==
```

## Inicialização do Projeto

Para iniciar o projeto, execute a classe `E_CommerceApplication`.

## Endpoints da API

### Registrar Usuário

- **URL**: `/register`
- **Método**: `POST`
- **Corpo da Requisição**:
  ```json
  {
    "username": "user",
    "password": "password",
    "email": "user@example.com",
    "role": "user"
  }
  ```
- **Resposta**:
  ```json
  {
    "email": "user@example.com",
    "token": "jwt_token_here"
  }
  ```

### Autenticar Usuário

- **URL**: `/login`
- **Método**: `POST`
- **Corpo da Requisição**:
  ```json
  {
    "username": "user",
    "password": "password"
  }
  ```
- **Resposta**:
  - Sucesso:
    ```json
    {
      "token": "jwt_token_here"
    }
    ```
  - Falha:
    ```json
    {
      "error": "Invalid credentials"
    }
    ```

### Extrair Role do Token

- **URL**: `/role/{token}`
- **Método**: `GET`
- **Resposta**:
  ```json
  {
    "role": "user"
  }
  ```

### Deletar Usuário (Apenas Admin)

- **URL**: `/user/{id}`
- **Método**: `DELETE`
- **Resposta**:
  - Sucesso:
    ```json
    {
      "message": "Usuário deletado com sucesso"
    }
    ```
  - Falha:
    ```json
    {
      "error": "Usuário não foi encontrado"
    }
    ```
