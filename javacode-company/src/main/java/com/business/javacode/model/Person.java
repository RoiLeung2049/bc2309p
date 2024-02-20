package com.business.javacode.model;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@EqualsAndHashCode
@SuperBuilder
@ToString
public class Person {

  private String name ; 

  public Person(String name ){
    this.name = name ;
  }

  public String getName() {
    return this.name ; 
  }

  public static String concat(String str){
    return "Hello" + str;
  }

  
}
