# [PocNoSQLCase1](../README.md) - Módulo 2
Endpoint que recebe dados e recupera o cache.

- Endpoint Rest que recebe os dados;
- Recupera dados do cache;
    - Tratamento de erro para recuperação do cache;
- Transforma o domínio e efetua o processamento;
- Retorna para aplicação.

## Versões
Data | Descrição | Autor
---|---|---
23/jun/2020 | Exceções customizadas | Rodrigo Fasioli
22/jun/2020 | Versão inicial da POC | Rodrigo Fasioli

## Tecnologias
- Java 8
- Spring Web / Spring Data
- Redis / Jedis

## Setup
Para o projeto não é necessária nenhuma configuração, como dependencia é necessário um servidor Redis respondendo em sua porta padrão (6379).
