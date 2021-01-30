# [PocNoSQLCase1](../README.md) - Módulo 3
Data Consumer, recebe mensagem e recupera o cache.

- JMS Consumer que recebe os dados;
- Recupera dados do cache;
    - Tratamento de erro para recuperação do cache;
- Transforma o domínio e efetua o processamento;
- Envia mensagem para replies to.

## Versões
Data | Descrição | Autor
---|---|---
23/jun/2020 | Versão inicial da POC | Rodrigo Fasioli

## Tecnologias
- Java 8
- Spring Data
- Redis / Jedis
- JMS / ActiveMQ
