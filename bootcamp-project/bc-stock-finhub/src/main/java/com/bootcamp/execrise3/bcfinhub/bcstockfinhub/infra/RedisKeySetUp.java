package com.bootcamp.execrise3.bcfinhub.bcstockfinhub.infra;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RedisKeySetUp {


  private String key ; 

  public  String quoteKeySetUp(String symbol) {

      this.key = symbol ; 

      return "stock:finnhub:quote:".concat(key);
    

  }


  public String profileKeySetUp(String symbol) {

    this.key = symbol ; 

    return "stock:finnhub:profile2:".concat(key);
  

}
  
}
