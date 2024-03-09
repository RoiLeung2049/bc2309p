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
public class QuoteData  implements Serializable{ // th edata structure for data from API 


  private double c ;
  private double d ;
  private double dp ; 
  private double l ; 
  private double o ; 
  private double pc ; 
  private double t ; 
   
  
}
