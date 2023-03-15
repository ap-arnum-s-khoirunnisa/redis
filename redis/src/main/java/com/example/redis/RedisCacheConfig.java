package com.example.redis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.CacheResolver;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.cache.interceptor.SimpleCacheResolver;
import org.springframework.cache.interceptor.SimpleKeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.time.Duration;

@Configuration
//@EnableCaching
public class RedisCacheConfig{

//        @Value("${spring.redis.host}")
//        private String redisHost;
//
//        @Value("${spring.redis.port}")
//        private int redisPort;
//
//    @Bean
//    public RedisConnectionFactory redisConnectionFactory() {
//        RedisStandaloneConfiguration config = new RedisStandaloneConfiguration();
//        config.setHostName(redisHost);
//        config.setPort(redisPort);
//        return new LettuceConnectionFactory(config);
//    }
//
//    @Bean
//    public RedisCacheManager cacheManager(RedisConnectionFactory redisConnectionFactory) {
//        RedisCacheConfiguration cacheConfiguration = RedisCacheConfiguration.defaultCacheConfig()
//                .disableCachingNullValues()
//                .entryTtl(Duration.ofMinutes(10))
//                .serializeKeysWith(RedisSerializationContext.SerializationPair.fromSerializer(new StringRedisSerializer()))
//                .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(new GenericJackson2JsonRedisSerializer()));
//
//        return RedisCacheManager.builder(redisConnectionFactory)
//                .cacheDefaults(cacheConfiguration)
//                .transactionAware()
//                .build();
//    }



//    @Bean
//    public RedisCacheManager redisCacheManager(LettuceConnectionFactory lettuceConnectionFactory) {
//
//        /**
//         * If we want to use JSON Serialized with own object mapper then use the below config snippet
//         */
//        // RedisCacheConfiguration redisCacheConfiguration =
//        // RedisCacheConfiguration.defaultCacheConfig().disableCachingNullValues()
//        // .entryTtl(Duration.ofHours(redisDataTTL)).serializeValuesWith(RedisSerializationContext.SerializationPair
//        // .fromSerializer(new GenericJackson2JsonRedisSerializer(objectMapper)));
//
//        RedisCacheConfiguration redisCacheConfiguration = RedisCacheConfiguration.defaultCacheConfig().disableCachingNullValues()
//                .entryTtl(Duration.ofSeconds(60))
//                .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(new GenericJackson2JsonRedisSerializer()));
//
//        redisCacheConfiguration.usePrefix();
//
//        RedisCacheManager redisCacheManager = RedisCacheManager.RedisCacheManagerBuilder.fromConnectionFactory(lettuceConnectionFactory)
//                .cacheDefaults(redisCacheConfiguration).build();
//
//        redisCacheManager.setTransactionAware(true);
//        return redisCacheManager;
//    }

//    @Bean
//    public JedisConnectionFactory jedisConnectionFactory() {
//        RedisStandaloneConfiguration config = new RedisStandaloneConfiguration("localhost", 6379);
//        return new JedisConnectionFactory(config);
//    }
//
//
//    @Bean
//    public RedisCacheConfiguration redisCacheConfiguration() {
//        return RedisCacheConfiguration.defaultCacheConfig()
//                .entryTtl(Duration.ofSeconds(60)) // set the time-to-live for cache entries
//                .disableCachingNullValues() // disable caching of null values
//                .serializeValuesWith(RedisSerializationContext
//                        .SerializationPair.fromSerializer(new GenericJackson2JsonRedisSerializer()));
//        // set the serializer for cache values
//    }
//
//
//    @Bean
//    public RedisCacheManager redisCacheManager() {
//        RedisCacheManager.RedisCacheManagerBuilder builder = RedisCacheManager.builder(jedisConnectionFactory())
//                .cacheDefaults(redisCacheConfiguration());
//
//        return builder.build();
//    }


//        @Bean
//        public JedisConnectionFactory redisConnectionFactory() {
//            JedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
//            jedisConnectionFactory.setHostName(redisHost);
//            jedisConnectionFactory.setPort(redisPort);
//            jedisConnectionFactory.setUsePool(true);
//            return jedisConnectionFactory;
//        }
//
//
//
//        @Bean
//        public RedisTemplate<String, Object> redisTemplate() {
//            RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
//            redisTemplate.setConnectionFactory(redisConnectionFactory());
//            redisTemplate.setKeySerializer(new StringRedisSerializer());
//            redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
//            return redisTemplate;
//        }

//    @Override
//    @Bean
//    public CacheManager cacheManager() {
//        return RedisCacheManager.builder(redisConnectionFactory())
//                .cacheDefaults(RedisCacheConfiguration.defaultCacheConfig())
//                .build();
//    }
//
//        @Override
//        public CacheResolver cacheResolver() {
//            return new SimpleCacheResolver(cacheManager());
//        }
//
//        @Override
//        public KeyGenerator keyGenerator() {
//            return new SimpleKeyGenerator();
//        }
    }

