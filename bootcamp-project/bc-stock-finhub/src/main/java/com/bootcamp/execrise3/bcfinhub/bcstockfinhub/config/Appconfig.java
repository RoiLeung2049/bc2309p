package com.bootcamp.execrise3.bcfinhub.bcstockfinhub.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.web.client.RestTemplate;
import com.bootcamp.execrise3.bcfinhub.bcstockfinhub.infra.RedisHelper;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class Appconfig {

  @Bean
  RestTemplate restTemplate() {
    return new RestTemplate();
  }

 @Bean
  RedisHelper redisHelper(RedisConnectionFactory factory,
      ObjectMapper objectMapper) {
    return new RedisHelper(factory, objectMapper);
  }
  
}
