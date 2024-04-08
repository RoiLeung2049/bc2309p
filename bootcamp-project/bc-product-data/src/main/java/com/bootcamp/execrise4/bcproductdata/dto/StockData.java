package com.bootcamp.execrise4.bcproductdata.dto;

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
public class StockData {
  
  private String code;
  private double c ;
  private double d ;
  private double dp ;
  private double h ;  
  private double l ; 
  private double o ; 
  private double pc ; 
  private double t ; 
   
}
