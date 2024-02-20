package com.vtxlab.tdd;

import static org.hamcrest.MatcherAssert.*;
import org.junit.jupiter.api.BeforeEach ; 
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;

public class CalculatorTest {

  private Calculator calculator ; 

  @BeforeEach
  void init(){
    calculator = new Calculator();
  }


  @Test 
  void testAdd(){
    assertThat(calculator.add(10,3), is(13));
    assertThat(calculator.add(-2,3),is(1));
    assertThat(calculator.add(-2,-9),is(-11));
    
  }


  
}
