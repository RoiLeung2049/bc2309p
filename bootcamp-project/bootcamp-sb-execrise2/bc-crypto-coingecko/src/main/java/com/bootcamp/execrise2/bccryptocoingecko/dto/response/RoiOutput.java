package com.bootcamp.execrise2.bccryptocoingecko.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoiOutput {
  private double times ; 
  private String currency ; 
  private double percentage ; 
}
