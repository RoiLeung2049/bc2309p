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
                       
   

   // test String method ; 
// try to make a String array 
   String[] testS = new String[1];
   testS[0] = "Green";
   //testS[1] = "Red" ;
   int[] Aarray = new int[26];
   for (String d : testS){
    // try to turn the String into Char Array 
      for ( char e :d.toLowerCase().toCharArray()) {
          Aarray[(e+0)-97]++ ;

      }
      //for looping the array 

   }
         for (int w : Aarray){
        System.out.println(w);
      }

     
      String Test = "hello";
      String Test2 = Test.replace("h"," ");
      System.out.println(Test2.indexOf('l'));
      // get the 
}
}