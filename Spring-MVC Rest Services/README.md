# Projeto Spring REST - Gerenciamento de Beers

## Recursos Principais
- Operações CRUD (Create, Read, Update, Delete) para gerenciamento de beers
- Dados mockados para facilitar o desenvolvimento e teste
- Configuração de cabeçalhos (headers) para manipulação de dados
- Utilização do Spring Framework para construção da aplicação RESTful

## Descrição do Projeto
Este projeto é uma aplicação REST que gerencia informações sobre diferentes tipos de beers. Os dados são mockados para facilitar o desenvolvimento e teste, permitindo a realização de operações CRUD para manipulação das informações.

## Como Executar o Projeto
1. Clone o repositório para a sua máquina local.
2. Execute a aplicação Spring Boot.
3. Utilize ferramentas como Postman ou cURL para interagir com os endpoints REST.

## Configuração de Headers
Para manipular dados na aplicação, é necessário configurar os seguintes cabeçalhos nas requisições:
- **Content-Type:** application/json
- **Accept:** application/json

## Exemplos de Endpoints
A seguir, alguns exemplos de endpoints disponíveis na aplicação:

- **GET /beers:** Retorna a lista de todas as beers.
- **GET /beers/{id}:** Retorna os detalhes de uma beer específica.
- **POST /beers:** Adiciona uma nova beer. O corpo da requisição deve conter os detalhes da beer.
- **PUT /beers/{id}:** Atualiza os detalhes de uma beer existente. O corpo da requisição deve conter os novos detalhes.
- **DELETE /beers/{id}:** Remove uma beer com base no ID fornecido.

## Notas Importantes
Os dados são mockados para facilitar o desenvolvimento e teste. Certifique-se de configurar corretamente os cabeçalhos nas requisições para garantir o correto processamento dos dados pela aplicação.
