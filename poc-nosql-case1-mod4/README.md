# [PocNoSQLCase1](../README.md) - Módulo 4
Endpoint que recebe dados, grava em cache, grava fila utilizando lib para o módulo 4.

- Endpoint Rest que recebe os dados;
- Transforma o domínio;
- Chama lib para envio da mensagem;

### Versões
Data | Descrição | Autor
---|---|---
14/jul/2020 | Pool de conexões para o redis | Rodrigo Fasioli
06/jul/2020 | Versão inicial da POC | Rodrigo Fasioli

### Tecnologias
- Java 8
- Spring Web / Spring Data
- Redis / Jedis
- ActiveMQ / JMS

### Roadmap

## Setup
Para o projeto não é necessária nenhuma configuração, como dependencia é necessário um servidor Redis respondendo em sua porta padrão (6379) e o activeMQ também em sua porta padrão ().
