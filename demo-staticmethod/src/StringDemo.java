public class StringDemo {

   // key points:
   // Method Signature : method name + (optinal)cparameter(s)
   // Method Signture can't be duplicated in a class 
   // Method return type (Class or primitiev or array )
   // With Method code block : you should always return a value for all scenario 
   // the type of return value should match the return type of the mothod 
   //  void + return can be used to check case for 
  public static void main (String [] args) {

    String tt = " this is the input."; 

    System.out.println(print(tt));
    System.out.println(print1(tt));


  }


  public static String print( String str){

    return " test print method end "+ str  ;


  }
  

  public static int print1(String str){

    return str.length() ; 


  }


  public static String print ( String str1, String str2){
      //early return 
    if(!str1.equals(str2))
      return  str1 + str2 ; 
    
    
    return " it is correct ."; // this is equal to if ... else case . 
    
    


  }
}
