package br.com.rfasioli.pocnosqlcase1mod1.clients;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Module2Client {
    private static Logger logger = LoggerFactory.getLogger(Module2Client.class);

    private final RestTemplate restTemplate;

    public Module2Client(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String contractModule2(String field) {
        logger.info(String.format("contractModule2({%s})", field));
        return restTemplate.postForObject("http://localhost:8081/item", field, String.class);
    }
}
