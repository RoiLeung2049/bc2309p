package com;



import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance; 

@TestInstance(TestInstance.Lifecycle.PER_METHOD) // by default  this anonotation has been made. 

public class TestInstanceTest {


  private  int x ; 


  @Test 
  void testMethod1(){
    this.x++;
    assertEquals(1, this.x);
  }
  


    @Test 
  void testMethod2(){
    this.x++;
    assertEquals(1, this.x);
  }
}
