# [PocNoSQLCase1](../README.md) - Módulo 1
Endpoint que recebe dados, grava em cache, faz chamada ao módulo 2 e grava fila para o módulo 3, passando o ID do cache.

- Endpoint Rest que recebe os dados;
- Transforma o domínio;
- Grava dados em cache para requisição;
- Efetua chamada Rest ao módulo 2
- Efetua gravação na Queue para consumo pelo módulo 3
- Recebe retorno da aplicação:
    - Tratamento de retentativas para fallback da falha de recuperação do cache pelo serviço requisitado.

### Versões
Data | Descrição | Autor
---|---|---
29/jun/2020 | Efetuar requisição assincrona, utilizando fila | Rodrigo Fasioli
23/jun/2020 | Tratamento de fallback para chamada do serviço | Rodrigo Fasioli
22/jun/2020 | Versão inicial da POC | Rodrigo Fasioli

### Tecnologias
- Java 8
- Spring Web / Spring Data
- Redis / Jedis
- ActiveMQ / JMS

### Roadmap

## Setup
Para o projeto não é necessária nenhuma configuração, como dependencia é necessário um servidor Redis respondendo em sua porta padrão (6379).
