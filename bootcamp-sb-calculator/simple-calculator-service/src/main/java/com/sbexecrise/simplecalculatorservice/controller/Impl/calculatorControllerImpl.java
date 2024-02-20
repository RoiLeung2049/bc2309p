package com.sbexecrise.simplecalculatorservice.controller.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sbexecrise.simplecalculatorservice.controller.calculatorController;
import com.sbexecrise.simplecalculatorservice.dto.inputDTO;
import com.sbexecrise.simplecalculatorservice.dto.operation;
import com.sbexecrise.simplecalculatorservice.infra.ApiResponse;
import com.sbexecrise.simplecalculatorservice.service.CalculationService;
import com.sbexecrise.simplecalculatorservice.service.Impl.CalculationServiceImpl;

@RestController
@RequestMapping(value = "/")
public class calculatorControllerImpl implements calculatorController{

  @Autowired
  private CalculationService CS;

  @Override
  public ApiResponse<inputDTO> getResult(String x, String y, String op) { // output response ( enum)  issue have been solved  
 // public String getResult(String x, String y, operation op) {
    // TODO Auto-generated method stub
   // throw new UnsupportedOperationException("Unimplemented method 'getResult'"); 
   //inputDTO ouptut = 
  // System.out.println("the op is " + op) ; 
    return ApiResponse.<inputDTO>builder().x(x).y(y).operation(op).result(CS.compute(x, y, op)).build(); 
    

  }

  @Override
  public ApiResponse<inputDTO> postResult(inputDTO input) {
    // TODO Auto-generated method stub
    //throw new UnsupportedOperationException("Unimplemented method 'postResult'");

    return ApiResponse.<inputDTO>builder().x(input.getX()).y(input.getY()).operation(input.getOperation()).result(CS.create(input)).build(); 
    //return CS.create(input); 
  
  }

  @Override
  public ApiResponse<inputDTO> getResult2(String x, String y, String op) {
    // TODO Auto-generated method stub
    return ApiResponse.<inputDTO>builder().x(x).y(y).operation(op).result(CS.compute(x, y, op)).build(); 
    //throw new UnsupportedOperationException("Unimplemented method 'getResult2'");
  }

  
}
