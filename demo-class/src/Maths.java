public class Maths {

  public static void main (String[]args){


      System.out.println(Math.min(19,7)); //7 
      System.out.println(Math.pow(2,10));//1024
      // Math return double if you want other number type , we need to use casting 
      // e.g.
      System.out.println((int)Math.sqrt(8));// 3 
      System.out.println(Math.abs(-7)); // 7 

    System.out.println(Maths.powers(3, 3)); // 8 
    System.out.println(Math.round(5.44));// 5
    System.out.println(Math.round(5.45)); //5.5
    System.out.println(Math.round(5.5)); // round to the integer
    System.out.println(Math.round(5.4));// 0 -1 exclude 1

    
  }

  public static double powers(double base , double power){
    double tmp = base ; 
    if ( power == 0 ){
        return 1; 
    }else {
            for (int i =1 ; i < power ; i++){
              tmp = tmp * base;
          }

    }

    return tmp ; 
  }

  public static int min ( int a , int b ){

   // if ( a<=b){
   //   return a ; 
   // }else {
    //  return b ;
   // }
// alternatively
  return a>b  ? b : a ; 

  }
  
}
