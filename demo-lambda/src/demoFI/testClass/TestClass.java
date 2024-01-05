package demoFI.testClass;

import demoFI.testClass2.TestClasss;

public class TestClass {

   protected  int glass = 4 ; 
   protected int counter = 1000 ; 

   private int ear = 88 ; 
   public TestClass(){
    System.out.println("Test1 :") ;
   }

   public int getValueG() {
    return this.counter ; 
   }

   public static void main(String[] args) {
      TestClass  t = new TestClass();

      TestClasss tss = new TestClasss() ; 

      System.out.println(tss.name);
      System.out.println(t.glass) ; 


      t.ear = 50 ; 

      int gg = t.ear ; // assigned by reference 
     
      System.out.println(gg ) ; // 88 

       t.ear = 88 ; 

      System.out.println(t.ear ) ;  // 50 

      System.out.println(gg ) ;  // 50 
      




   }

  
}
