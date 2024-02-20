package com.sbexecrise.simplecalculatorservice.service.Impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.springframework.stereotype.Service;
import com.sbexecrise.simplecalculatorservice.dto.inputDTO;
import com.sbexecrise.simplecalculatorservice.dto.operation;
import com.sbexecrise.simplecalculatorservice.service.CalculationService;


@Service
public class CalculationServiceImpl  implements CalculationService{

  @Override
  public String compute(String x, String y, String op) {
    // TODO Auto-generated method stub
  //  throw new UnsupportedOperationException("Unimplemented method 'compute'");


    BigDecimal valX = BigDecimal.valueOf(Double.parseDouble(x));
    BigDecimal valY = BigDecimal.valueOf(Double.parseDouble(y));

    
    BigDecimal result = BigDecimal.valueOf(0);
    String output = "";
    operation d = operation.valueOf(op);
    switch (d) {
      case add:
         result = valX.add(valY);
       
        break;
    
      case mul:

         result = valX.multiply(valY);    
        break;

      case sub:
         result = valX.subtract(valY);    
        break;

      case div: // 5 d.p issue has been solved   
         result = valX.divide(valY,5,RoundingMode.HALF_EVEN);    

        break;

      default:
      output = " Invalid Input" ; 
        break;

      
    }

    output = result.toString();
    return output ; 
  }

  @Override
  public String create(inputDTO input) { //Post method and enum to String issue has been solved. 
    // TODO Auto-generated method stub
    //throw new UnsupportedOperationException("Unimplemented method 'create'");

   
        
      BigDecimal valX = BigDecimal.valueOf(Double.parseDouble(input.getX()));
      BigDecimal valY = BigDecimal.valueOf(Double.parseDouble(input.getY()));
  
  
      //double x = BigDecimal.valueOf(Double.parseDouble(input.getX())) ;
  
      BigDecimal result = BigDecimal.valueOf(0);
      String output = "";
      //operation d = new operation(input.getOperation()) ;
    
      operation d = operation.valueOf(input.getOperation());
      System.out.println( d.getClass());
      switch (d) { 
        case add:
           result = valX.add(valY);
         
          break;
      
        case mul:
  
           result = valX.multiply(valY);    
          break;
  
        case sub:
           result = valX.subtract(valY);    
          break;
  
        case div: // 5 d.p issue has been solved   
           result = valX.divide(valY,5,RoundingMode.HALF_EVEN);    
  
          break;
  
        default:
        output = " Invalid Input" ; 
          break;
  
        
      }
  
      output = result.toString();
      return output ; 
          
    
  }



  
  
}
