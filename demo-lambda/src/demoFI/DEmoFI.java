package demoFI;

public class DEmoFI {



  public static void main(String[] args) {
      double strike = 120d ; 
  double spot = 100d; 

  // Call option payoff
  options callOption1 = (s ,k)-> Math.max(s-k ,0) ; 

  System.out.println(" the call option value is :" + callOption1.payOff(spot ,strike));


  
  }
  
}
