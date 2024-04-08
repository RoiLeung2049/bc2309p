package com.bootcamp.execrise4.bcproductdata.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProfileData {
  

  private String country ; 
  private String currency ; 
  private String estimateCurrency;
  private String exchange ; 
  private String finnhubIndustry ; 
  private String ipo ; 
  private String logo ; 
  private double marketCapitalization ;
  private String name ; 
  private String phone ; 
  private double shareOutstanding ; 
  private String ticker ; 
  private String weburl ;  
  
}
