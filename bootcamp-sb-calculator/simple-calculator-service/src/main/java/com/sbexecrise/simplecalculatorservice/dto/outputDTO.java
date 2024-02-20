package com.sbexecrise.simplecalculatorservice.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder    
public class outputDTO {

    String x ; 
    String y ;
    String operation ; 
    String result ; 
    
  
}
