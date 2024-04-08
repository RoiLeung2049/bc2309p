package com.bootcamp.execrise4.bcproductdata.dto;

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
