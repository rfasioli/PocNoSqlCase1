package br.com.rfasioli.pocnosqlcase1mod3.business.services;

import br.com.rfasioli.pocnosqlcase1mod3.business.domains.Item;
import br.com.rfasioli.pocnosqlcase1mod3.exceptions.CacheNotFoundException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import static java.util.Objects.isNull;

@Service
public class ItemService {

    private static Logger logger = LoggerFactory.getLogger(ItemService.class);

    private final JedisService jedisService;
    private final ObjectMapper objectMapper;

    public ItemService(JedisService jedisService,
                       ObjectMapper objectMapper) {
        this.jedisService = jedisService;
        this.objectMapper = objectMapper;
    }

    public Item process(String field) throws JsonProcessingException {
        logger.info(String.format("process(%s)", field));
        String value = jedisService.get(field);
        if (isNull(value)) {
            throw new CacheNotFoundException(String.format("Não foi encontrado cache para o ID [%s]", field));
        }
        Item item = objectMapper.readValue(value, Item.class);
        return item;
    }
}
