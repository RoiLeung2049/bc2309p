package com.bootcamp.execrise4.bcproductdata.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class CoinOutput {
  
  private String productId ; 
  private String name ;
  private double currentPrice ; 
  private double priceChangePct ; 
  private double marketCap ; 
  private String logo ;  

}
