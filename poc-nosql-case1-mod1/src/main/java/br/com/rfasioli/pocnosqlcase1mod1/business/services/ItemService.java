package br.com.rfasioli.pocnosqlcase1mod1.business.services;

import br.com.rfasioli.pocnosqlcase1mod1.business.domains.Item;
import br.com.rfasioli.pocnosqlcase1mod1.clients.Module2Client;
import br.com.rfasioli.pocnosqlcase1mod1.exceptions.ServiceErrorAppException;
import br.com.rfasioli.pocnosqlcase1mod1.events.publishers.MessagePublisher;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;

@Service
public class ItemService {
    private static final Integer MAX_RETRIES = 3;
    private static final Integer DEFAULT_EXPIRE = 5;

    private static Logger logger = LoggerFactory.getLogger(ItemService.class);

    private final JedisService jedisService;
    private final ObjectMapper objectMapper;
    private final Module2Client module2Client;
    private final MessagePublisher messagePublisher;

    public ItemService(JedisService jedisService,
                       ObjectMapper objectMapper,
                       Module2Client module2Client,
                       MessagePublisher messagePublisher) {
        this.jedisService = jedisService;
        this.objectMapper = objectMapper;
        this.module2Client = module2Client;
        this.messagePublisher = messagePublisher;
    }

    public String process(Item item) throws JsonProcessingException {
        logger.info(String.format("process({%s})", item.toString()));
        return process(item, MAX_RETRIES, DEFAULT_EXPIRE);
    }

    private String process(Item item, Integer retries, Integer expire) throws JsonProcessingException {
        try {
            String field = jedisService.save(objectMapper.writeValueAsString(item), expire);
            messagePublisher.publish(field);
            return module2Client.contractModule2(field);
        } catch (RestClientException ex) {
            if (ex.getMessage().contains("CACHE_NOT_FOUND") && retries > 0) {
                return process(item, --retries, expire*2);
            }
            throw new ServiceErrorAppException("Erro efetuando chamada ao serviço MODULO_2", ex);
        }
    }

}
