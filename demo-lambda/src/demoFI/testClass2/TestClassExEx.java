package demoFI.testClass2;

import demoFI.testClass.TestClass;

public class TestClassExEx extends TestClassEx{

  public int fff = 2; 


  public TestClassExEx() { // super() has been invoke : TestClassEx() will be invoked. 
    // TestClass() will be invoked as well.
    fff =   super.counter ; // can call grandparent class 

  }


  public static void main(String[] args) {
    TestClassExEx texex = new TestClassExEx() ;  
    System.out.println(texex.fff); 


    TestClass te = new TestClassExEx(); 

    
  } 

  
}
