package com.bootcamp.execrise2.bccryptocoingecko.infra;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RedisKey implements Serializable {
  private String id;
  private String currency;
  
}
