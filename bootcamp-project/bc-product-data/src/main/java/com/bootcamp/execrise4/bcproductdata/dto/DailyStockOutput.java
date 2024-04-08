package com.bootcamp.execrise4.bcproductdata.dto;

import org.springframework.data.redis.core.RedisHash;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter 
@Builder
@ToString
@RedisHash(timeToLive = 86400)
public class DailyStockOutput {

  
  private String productId ;
  private String tradeDate ; 
  private double dayHigh ;
  private double dayLow ; 
  private double dayOpen ; 
  private double dayClose ; 

}
