package com.business.javacode.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

//@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
//@Builder // not use under extends 
@SuperBuilder 

public class Staff  extends Person{



  private String name ; 
  private int age ; 



  public Staff(String name , int age ){
    super(name);
    this.name = name  ;
    this.age = age  ;
  }

  //public String getName() {
  //  return this.name ;
 // }

  //public int getAge() {
 //   return this.age ; 
 // }

 // public void setName(String name) {
 //   this.name = name ; 
 // }

 // public void setAge (int age){
 //   this.age = age ;
  //}
  
  public boolean isAdult(){
    return this.age >18  ?  true : false ; 
  }
  public static void main(String[] args) {
    Staff staff = new Staff("John", 20) ;
    System.out.println(staff.getAge());
    System.out.println(staff.getName());
    Staff staff2  = new Staff("John",20) ; 
    System.out.println(staff.toString());
    System.out.println(staff.equals(staff2));
    System.out.println(staff.hashCode());
    System.out.println(staff2.hashCode());
    Staff staff4 = Staff.builder().name("Steven").age(30).build() ; 
    

  }
}
