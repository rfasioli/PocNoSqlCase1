package br.com.rfasioli.pocnosqlcase1mod5.events.messaging;

import br.com.rfasioli.extendedmessaging.interfaces.IExtendedMessagingCache;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.Pipeline;
import redis.clients.jedis.Response;

import java.util.UUID;

@Component
public class RedisMessageCacheImpl implements IExtendedMessagingCache<String, String> {
    private static final Integer default_expire = 60;

    private final JedisPool jedisPool;

    public RedisMessageCacheImpl(JedisPool jedisPool) {
        this.jedisPool = jedisPool;
    }

    @Override
    public String save(String content) {
        return save(content, default_expire);
    }

    @Override
    public String get(String id) {
        Jedis jedis = jedisPool.getResource();
        Pipeline p = jedis.pipelined();
        Response<String> response = p.spop(id);
        p.sync();
        return response.get();
    }

    private String save(String value, Integer expire) {
        Jedis jedis = jedisPool.getResource();
        Pipeline p = jedis.pipelined();
        String field = UUID.randomUUID().toString();
        Response<Long> response = p.sadd(field, value);
        p.expire(field, expire);
        p.sync();
        return field;
    }

}
