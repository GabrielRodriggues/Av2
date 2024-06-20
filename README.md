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
-----
![Uploading DIAGRMA.png…]()

![login](https://github.com/GabrielRodriggues/Av2/assets/112523344/022510fd-eb49-4799-b6b4-3c0953db21b1)

    
![registro](https://github.com/GabrielRodriggues/Av2/assets/112523344/d2c9441b-39d6-4d1a-b0ed-5a034ffbc394)

![tokin](https://github.com/GabrielRodriggues/Av2/assets/112523344/85b5a2d7-c0e4-490d-9c41-62f1248e3a1f)
