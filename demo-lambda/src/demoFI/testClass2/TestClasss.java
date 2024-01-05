package demoFI.testClass2;

import demoFI.testClass.TestClass;

public class TestClasss {
  
    public int name  = 2 ; 
    private int pVariable = 9 ; 
  
  public TestClasss(){
    
    
    System.out.println("Test 2 : ") ; 
  }

  public static void main(String[] args) {
    
    TestClasss  e = new TestClasss();
    TestClass t = new TestClass() ; 
    System.out.println(e.name);
    System.out.println(e.pVariable);
  }
}
