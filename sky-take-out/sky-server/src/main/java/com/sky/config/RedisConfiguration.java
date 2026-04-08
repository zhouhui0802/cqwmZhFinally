package com.sky.config;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/8 14:09
 */
@Configuration
@Slf4j
public class RedisConfiguration {

    @Bean
    public RedisTemplate redisTemplate(RedisConnectionFactory redisConnectionFactory){
        log.info("开始创建redis模板对象...");
        RedisTemplate redisTemplate = new RedisTemplate();
        //设置redis的连接工厂对象
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        //设置redis key的序列化器
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        return redisTemplate;
    }

/*
    StringRedisSerializer：只能存字符串，存进去是明文，Redis 客户端能看懂。
    JdkSerializationRedisSerializer：能存任意对象，存进去是二进制乱码，Redis 客户端看不懂。

    RedisConnectionFactory 的意义：
    它是 RedisTemplate 的核心依赖
    它负责创建和管理 Redis 连接
    它读取 yml 配置并生效
    没有它，RedisTemplate 无法连接 Redis
    */
}
