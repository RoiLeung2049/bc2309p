package com.bootcamp.execrise3.bcfinhub.bcstockfinhub.dto.response;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ProfileData implements Serializable {

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
