# [PocNoSQLCase1](../README.md) - Módulo 5
Implementação de Listener para consumo de mensagens através da api de mensageria extendida.

- Listener JMS para recepção dos dados;
- utiliza a lib para montar mensagem de resposta, e buscar dados do cache quando necessário;
- Transforma o domínio;
- Service para processamento;

## Versões
Data | Descrição | Autor
---|---|---
14/jul/2020 | Pool de conexões para o redis | Rodrigo Fasioli
7/jul/2020 | Versão inicial da POC | Rodrigo Fasioli

## Tecnologias
- Java 8
- Spring Data
- Redis / Jedis
- JMS / ActiveMQ

## Roadmap

## Setup
Para o projeto não é necessária nenhuma configuração, como dependencia é necessário um servidor Redis respondendo em sua porta padrão (6379) e o activeMQ também em sua porta padrão ().
