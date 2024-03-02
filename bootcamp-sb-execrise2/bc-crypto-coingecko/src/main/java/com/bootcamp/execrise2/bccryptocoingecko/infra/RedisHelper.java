package com.bootcamp.execrise2.bccryptocoingecko.infra;

import java.util.Objects;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import com.bootcamp.execrise2.bccryptocoingecko.model.PriceData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RedisHelper {

  private RedisTemplate<String , String > redisTemplate ; 

  private ObjectMapper objectMapper ;

  public RedisHelper(RedisConnectionFactory factory, ObjectMapper objectMapper,
  RedisTemplate<String, String> redisTemplate){
        Objects.requireNonNull(factory);
    Objects.requireNonNull(objectMapper);
    Objects.requireNonNull(redisTemplate);
    this.redisTemplate = redisTemplate;
    this.objectMapper = objectMapper;
  }

 public RedisHelper(RedisConnectionFactory factory,
      ObjectMapper objectMapper) {
    Objects.requireNonNull(factory);
    Objects.requireNonNull(objectMapper);
    RedisTemplate<String, String> redisTemplate = new RedisTemplate<>();
    redisTemplate.setConnectionFactory(factory);
    redisTemplate.setKeySerializer(RedisSerializer.string());
    redisTemplate.setValueSerializer(RedisSerializer.json());
    redisTemplate.afterPropertiesSet();
    this.redisTemplate = redisTemplate;
    this.objectMapper = objectMapper;
  }

    public PriceData  get(String key) throws JsonProcessingException { // it is worked 
    //PriceData serialized = redisTemplate.opsForValue().get(key); // <String, String>
    System.out.println("the key is " + key);
    String serialized = redisTemplate.opsForValue().get(key) ; 
    System.out.println("next " + serialized);
    return objectMapper.readValue(serialized, PriceData.class);
  }


  public void set(String key, Object value) throws JsonProcessingException {
    ObjectMapper objectMapper = this.objectMapper;
    String serialized = objectMapper.writeValueAsString(value);
    redisTemplate.opsForValue().set(key, serialized); // <String, String>
  }
  
}
