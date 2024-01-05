package javaFunctionalInterface;

import java.time.LocalDate;

public class Customer {

  private String name  ;
  private LocalDate joinDate ; 

  

  public Customer(String name , LocalDate Date) {
    this.name = name  ; 
    this.joinDate  = Date;
  }

  public String getName(){
    return this.name ; 
  }

  public LocalDate getJDate(){
    return this.joinDate;
  }
}
