package com.sbexecrise.simplecalculatorservice.controller.Impl;

import org.springframework.http.MediaType;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sbexecrise.simplecalculatorservice.dto.inputDTO;
import com.sbexecrise.simplecalculatorservice.service.CalculationService;
import com.sbexecrise.simplecalculatorservice.service.Impl.CalculationServiceImpl;

public class testsheet {

  private inputDTO testinput ; 

  public inputDTO getInputDTO(){
    return this.testinput ; 
  }
  public static void main(String[] arg) throws JsonProcessingException{
    inputDTO testI = new inputDTO();
       
    //inputDTO input = new inputDTO(null, null, null)
    testI.setX("1.0");
    testI.setY("2");
    testI.setOperation("sub");
    String contentStr = new ObjectMapper().writeValueAsString(testI) ; 
    //  MockHttpServletRequestBuilder mt = MockMvcRequestBuilders.post("/").contentType(MediaType.APPLICATION_JSON).content(contentStr) ;
    System.out.println(contentStr) ;

    CalculationService CS  = new CalculationServiceImpl(); 
   

    System.out.println( CS.create(testI));
  }
  
}
