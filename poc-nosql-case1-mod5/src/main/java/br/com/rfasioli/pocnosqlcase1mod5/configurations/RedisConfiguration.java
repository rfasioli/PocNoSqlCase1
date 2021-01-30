package br.com.rfasioli.pocnosqlcase1mod5.configurations;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
@ConfigurationProperties(prefix = "spring.redis")
public class RedisConfiguration {
    private String host;
    private Integer port;

    public void setHost(String host) {
        this.host = host;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Bean
    public JedisPool jedisPool() {
        return new JedisPool(new JedisPoolConfig(), host, port, 10000);
    }

    @Bean
    JedisConnectionFactory jedisConnectionFactory() {
        RedisStandaloneConfiguration redisStandaloneConfiguration =
                new RedisStandaloneConfiguration(this.host, this.port);
        return new JedisConnectionFactory(redisStandaloneConfiguration);
    }

    @Bean
    public RedisTemplate<String, Object> redisTemplate() {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        template.setConnectionFactory(jedisConnectionFactory());
        return template;
    }



//    List<String> clusterNodes = Arrays.asList("node1-redis-dev.com:6379", "node2-redis-dev.com:6379");
//
//    @Bean
//    RedisConnectionFactory connectionFactory() {
//        return new JedisConnectionFactory(new RedisClusterConfiguration(clusterNodes));
//    }
//
//    @Bean
//    RedisTemplate<String, String> redisTemplate(RedisConnectionFactory factory) {
//
//        // just used StringRedisTemplate for simplicity here.
//        return new StringRedisTemplate(factory);
//    }
}
