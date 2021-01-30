# [PocNoSQLCase1](../README.md) - lib-extended-messaging
Biblioteca para envio de mensagens. A função desta biblioteca é enviar uma mensagem por um canal e quando necessário gravar um cache.

- Verifica se é necessaria a gravação da mensagem em cache;
- Grava a mensagem em cache (quando necessário);
- Envia a mensagem com o conteúdo ou o id para recuperação do conteúdo via cache;

### Versões
Data | Descrição | Autor
---|---|---
06/jul/2020 | Versão inicial da biblioteca | Rodrigo Fasioli

### Tecnologias
- Java 8

### Roadmap

## Uso
Para o uso da biblioteca, criar o objeto de comunicação a partir da classe `ExtendedMessaging`, injetando suas dependência:
- `IExtendendMessagingSender`: Injetar implementação para envio/recebimento da mensagem.
- `IExtendendMessagingCache`: Injetar implementação para leitura/gravação do cache.
- `IExtendendMessagingMapper`: Injetar implementação para os mappers de envio da mensagem e cache. 

## Setup
Por se tratar de uma biblioteca agnóstica, não é necessária configuração.
