# PocNoSQLCase1
Este projeto tem o objetivo de provar o case apresentado no workshop NoSQL. A solução se divide em módulos:

### Módulo 1
Endpoint que recebe dados, grava em cache, faz chamada ao módulo 2 e grava fila para o móudlo 3, passando o ID do cache.
[Mais Detalhes](poc-nosql-case1-mod1/README.md)

### Módulo 2
Endpoint que recebe dados, recupera o cache e retorna o resultado do processamento.
[Mais Detalhes](poc-nosql-case1-mod2/README.md)
#### Arquitetura básica
```
  +-----> Redis ------+
  |     http rest     v
mod1 --------------> mod2    
```

### Módulo 3
Data Consumer, recebe mensagem e recupera o cache.
[Mais Detalhes](poc-nosql-case1-mod3/README.md)

#### Arquitetura básica
```
   +---> Redis ----+
   |               v
 mod1             mod3
   |               ^
   +--> ActiveMQ --+
```

### Biblioteca para mensageria extendida
Biblioteca para encapsular os conceitos abordados nesta POC.
[Mais Detalhes](lib-extended-messaging/README.md)

### Módulo 4
Análogo ao Módulo 1, utilizando a biblioteca de mensageria extendida.
[Mais Detalhes](poc-nosql-case1-mod4/README.md)

### Módulo 5
Análogo ao Módulo 3, utilizando a biblioteca de mensageria extendida.
[Mais Detalhes](poc-nosql-case1-mod5/README.md)

#### Arquitetura básica
```
            +----> Redis ----+
            |                v
 mod4 ---> lib              lib ---> mod5
            |                ^
            +---> ActiveMQ --+
```

## Versões
Data | Descrição | Autor
---|---|---
14/jul/2020 | Pool de conexões para o redis (implementado nos módulos 4 e 5) | Rodrigo Fasioli
7/jul/2020 | Integração da lib com módulo receptor | Rodrigo Fasioli
6/jul/2020 | Integração da lib com módulo de envio | Rodrigo Fasioli 
3/jul/2020 | Implementação da biblioteca para abstração no envio de mensagens | Rodrigo Fasioli
23/jun/2020 | Tratamento de fallback, módulo consumer com cache | Rodrigo Fasioli
22/jun/2020 | Versão inicial da POC | Rodrigo Fasioli

## Roadmap
- Implementar consumo de lib através de interceptadores no listener da mensageria (Modulo 5).
- Melhorar tratamento de exceção na lib-extended-messaging
- Criar módulos de implementação da mensageria e cache para serem importados nos projetos

## Setup
### Redis com docker
Para executar o redis localmente com um docker, basta executar o comando:
```
docker run --name redis-test -d -p 6379:6379 redis
```
Para gerenciar o docker os comandos são:

 Ação | Comando
 ---|---
Iniciar container | docker start redis-test
Parar container | docker stop redis-test
Verificar status do container | docker status redis-test

### ActiveMQ com docker
Para executar o ActiveMQ localmente com um docker, basta executar o comando:
```
docker run --name activemq-test -d -p 61616:61616 -p 8161:8161 rmohr/activemq
```
Para gerenciar o docker os comandos são:

 Ação | Comando
 ---|---
Iniciar container | docker start activemq-test
Parar container | docker stop activemq-test
Verificar status do container | docker status activemq-test
