package com.bootcamp.execrise2.bccryptocoingecko.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.web.client.RestTemplate;
import com.bootcamp.execrise2.bccryptocoingecko.infra.RedisHelper;
import com.bootcamp.execrise2.bccryptocoingecko.mapper.CoinMapper;
//import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectMapper;


@Configuration
public class Appconfig {

  @Bean
  RestTemplate restTemplate() {
    return new RestTemplate();
  }


  @Bean
  CoinMapper cointMapper() {
    return new CoinMapper();
  }


 @Bean
  RedisHelper redisHelper(RedisConnectionFactory factory,
      ObjectMapper objectMapper) {
    return new RedisHelper(factory, objectMapper);
  }

  
}
