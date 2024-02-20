package com.sbexecrise.simplecalculatorservice.service;

import com.sbexecrise.simplecalculatorservice.dto.inputDTO;
import com.sbexecrise.simplecalculatorservice.dto.operation;

public interface CalculationService {
  
  String compute(String x , String y , String op) ;

  String create(inputDTO input) ; 
}
