public class Demolesson2 {
  public static void main ( String [] args){
    // test int 
    int int1 ; 
    int1 = 1;//1
    System.out.println("at first, int1 is :" + int1);
  
  //test + 
    int1 = int1 + 1 ; // 2 
    System.out.println("second, int1 is :"+ int1);

    int1++ ; //3 
    System.out.println("third, int2 is :" +int1);

    int1 += 1 ; 
    System.out.println("fourth, int1 is : " + int1);

// Test String 
    String str1  = " test" ; 
    System.out.println( " at first the String is :" + str1);
    // test String operation 
    System.out.println("second, the String is :" + (str1 + "ing."));
    // test operation between String variables 
    String str2 = "ed" ; 
    System.out.println("thir, the String is :" + (str1 + str2+".")); 
  
  // Test boolean 
    boolean B1 = true ; 
    
    System.out.println(B1);
    // Test && and || 
    boolean B2 = false ; 
    System.out.println(B1 && B2); // expected to be false 
    System.out.println(B1 || B2); // expected to be true 

    System.out.println((B1||B2)&& (B1)); // expected to be true 


    // test Operator 
    int x1 = 1 ; 
    if (x1++ == 2) // do the RHS then do the addition
      System.out.println("x1++ do first , then compare the second"); 
    else 
      System.out.println(" compare first then do the addition.");

    System.out.println("x is :"+ x1); 
    
    int x2 = 1 ; 
    if (++x2 == 2) // do the addition then compare the number
          System.out.println("++x2 do first , then compare the second"); 
    else 
      System.out.println(" compare first then do the addition.");

    System.out.println("x is :"+ x2); 
    





  }
}