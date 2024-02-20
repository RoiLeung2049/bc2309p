package com.business.javacode.model;

public class RealCalculator {
  

  private Calculators calculators ; 

  public RealCalculator(Calculators calculators){ // this input parameter let this user to decide the calculator obj, it is to give dependecncy to the user not the coder. 
    this.calculators = calculators ; 
  }

  public int calculate( int p ){ // this is 1 unit , we test all possible case 
    return  this.calculators.addition(p,p/2) + p + 4; 
  }



  public int sleep(int second ){
    int result = this.calculators.addition(second,second/2) ;
    
    for ( int i = 0 ; i < 10 ; i++){ // 0 - 9 }

      result += i * 2 ; 
      // 0* 2 + 1 * 2 + 2 * 2 + 3 * 2 
  }
 // 3 + 2 + 4 + 6 + 8 + 10 + 12 + 14 + 16 +18

  return result ; 
  }



}
