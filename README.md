# 🚀 Desafio Sensedia - Automação API (Java + RestAssured)

Framework de automação de testes de API desenvolvido com **Java**,
**RestAssured** e **TestNG**.

------------------------------------------------------------------------

# 📌 Objetivo

Automatizar testes da API validando:

-   Criação de recursos
-   Atualização o card para coluna Doing e Done
-   Exclusão
-   Validação de status code
-   Validação de contrato (Schema Validation)

------------------------------------------------------------------------

# 🧠 Arquitetura do Projeto

    src
     ├── main
     │   ├── base
     │   ├── client
     │   ├── config
     │   ├── service
     │   ├── utils
     │
     ├── test
     │   ├── test
         └── resources

------------------------------------------------------------------------

## Sucesso do Teste

Aqui está um vídeo que demonstra o sucesso do teste:

![Vídeo de Teste](https://www.youtube.com/watch?v=eLuOTP6At8E)


# 🧱 Camadas do Framework

## Base Layer

Configuração global: - Base URI - Timeouts - Headers - Logs

## Client Layer

Responsável por chamadas HTTP

## Service Layer

Regras de negócio

## Utils Layer

Helpers e utilitários

## Test Layer

Cenários de testes

------------------------------------------------------------------------

# 🧰 Tecnologias Utilizadas

-   Java 17+
-   RestAssured
-   TestNG
-   Maven
-   JavaFaker
-   JSON Schema Validator


------------------------------------------------------------------------

# ▶️ Executando os Testes

Executar todos os testes:

``` bash
mvn clean test
```

------------------------------------------------------------------------

# 🔄 Cenários

-   Criar recurso
-   Atualizar recurso
-   Deletar recurso
-   Cenários negativos
-   Validação de contrato

------------------------------------------------------------------------

# 🏗️ Build

``` bash
mvn clean install
```
