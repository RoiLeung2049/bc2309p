public class DemoConvesion {

  public static void main ( String [] arg){

      short s4 = 3000 ; 
      byte b4 = (byte) s4; 
      System.out.println(b4);
      System.out.println("End of example 1.");

      short s5 = 128 ; 
      byte b5 = (byte) s5 ; 
      System.out.println ( b5) ; 

      System.out.println(" End of exampel 2.");
      // example of overflow 
      short s6 = 32767; 
      s6++ ;
      System.out.println(s6);

      // int -> char ( 6xxxx) 
      int i6 = 70000;
      char c6 = (char) i6; 
      System.out.println(c6);

    //char comparsion 
    char c8 = 'A';// 65
    char c9 = 'a'; // 97

    if ( c8> c9){ // Java has do a conversion
      System.out.println("c8 > c9 in acsii");
    }else {
      System.out.println("c9 >= c8 in ascii");
    }


    byte b9 = 100 ; 
    short s9 = 101; 

    if ( s9 > b9) {
      // b9 : byte -> short a conversion 
      System.out.println( "s9 > b9");
    }

  }
}
