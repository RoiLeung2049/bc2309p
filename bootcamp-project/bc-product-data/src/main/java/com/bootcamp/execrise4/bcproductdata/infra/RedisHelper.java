package com.bootcamp.execrise4.bcproductdata.infra;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import com.bootcamp.execrise4.bcproductdata.dto.DailyStockOutput;
import com.bootcamp.execrise4.bcproductdata.entity.dailyStockProductEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
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

      public List<DailyStockOutput>   get(String key) throws JsonProcessingException { 
    
    System.out.println("the key is " + key);
    String serialized = redisTemplate.opsForValue().get(key) ; 
    System.out.println("next " + serialized);
    
    System.out.println(" potential errrrror point ");
    return objectMapper.readValue(serialized, new TypeReference<List<DailyStockOutput>>(){});
  }


  public void set(String key, List<DailyStockOutput> value) throws JsonProcessingException {
  
    
    ObjectMapper objectMapper = this.objectMapper;  
    
  
    String serialized = objectMapper.writeValueAsString(value); 
    System.out.println("Set ERROR point " ) ;
    redisTemplate.opsForValue().set(key, serialized); 
  }
}
