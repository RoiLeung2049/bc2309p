package com.sbexecrise.simplecalculatorservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class inputDTO {
  private String x;
  private String y; 
  private String operation ;


  public void setX(String x){
    this.x = x ; 
  }
}
