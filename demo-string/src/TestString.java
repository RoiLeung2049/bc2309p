public class TestString {
  public static void main (String [] args){
      String str = "abd" ; 
      // if else case 

      //Method 1: equals() -> method 
      // String can use methods  ( in this case .equals() )

    if ("abc".equals(str)){
      System.out.println("it is abc");
    }
    //Method 2 .length()
    if ("abc".length() == 3){
      System.out.println("length = 3"); 
    }
    if ( str.length() ==3){
      System.out.println("length = 3") ; 

    }
    // Method 3 : .charAt(i )  ;   i = 0,1,2,3, ....... +ve
    // str -> "abc" 
    // 'a' at position [ 0]
    // 'b' at postion [ 1]
    // 'c' at position [2]

    if (str.charAt(0)=='a'){
        System.out.println( "charAt 0 in String str is a.") ; 
   }

   if (str.charAt(1) == 'b' || str.length() <3){ // true
      System.out.println("OK");


   }

   long l1 = 2200000000L ; // it converts the 2200000000 into a Long data type 
   short b2 = 32000 ; // Java convert int 320000 to short  32000 to  b2 
                       
   
}
}