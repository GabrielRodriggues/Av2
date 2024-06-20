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
    ```![Capturar](https://github.com/GabrielRodriggues/Av2/assets/112523344/a72d7d5f-614a-498a-9bff-6ae0de43b659)
    ![login](https://github.com/GabrielRodriggues/Av2/assets/112523344/cf42608a-eff2-4aa6-93a5-dbc63ee47173)
![tokin](https://github.com/GabrielRodriggues/Av2/assets/112523344/85b5a2d7-c0e4-490d-9c41-62f1248e3a1f)
