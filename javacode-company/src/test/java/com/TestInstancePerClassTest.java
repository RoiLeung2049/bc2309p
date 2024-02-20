package com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.*;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

@TestInstance(TestInstance.Lifecycle.PER_METHOD) // this mean there is ONE object instantiated to test for the whole clas
// i.e. shared vairable.

public class TestInstancePerClassTest {
   // permethod => beforeeach 
   // perclass => beforeall 

  private int x ; 

  @BeforeEach 
void inti(){
  this.x =20 ; 
}

  @Test 
 
  public void testA() {
    this.x++ ; 

    assertEquals(21,this.x);
  }

    @Test 
    @DisplayName("Testing Sort FUnction")
  public void testB() {
    this.x++ ; 
    assertEquals(21,this.x); // there is a shared variable , by the annotation @TestInstance( TestInstance.Lifecycle.PER_CLASS)


  }




}
