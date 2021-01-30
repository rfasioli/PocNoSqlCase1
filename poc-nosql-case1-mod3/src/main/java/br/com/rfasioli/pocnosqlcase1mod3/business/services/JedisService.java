package br.com.rfasioli.pocnosqlcase1mod3.business.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;
import redis.clients.jedis.Response;

import java.util.UUID;

@Component
public class JedisService {
    private static final Integer default_expire = 5;

    private final Jedis jedis;

    public JedisService(Jedis jedis) {
        this.jedis = jedis;
    }

    public String save(String value) throws JsonProcessingException {
        return save(value, default_expire);
    }

    public String save(String value, Integer expire) throws JsonProcessingException {
        Pipeline p = jedis.pipelined();
        String field = UUID.randomUUID().toString();
        Response<Long> response = p.sadd(field, value);
        p.expire(field, expire);
        p.sync();
        return field;
    }

    public String get(String field) {
        Pipeline p = jedis.pipelined();
        Response<String> response = p.spop(field);
        p.sync();
        return response.get();
    }
}
