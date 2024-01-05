package methods ; 
public class Methods {

  
  public static void main(String[] args) {
    System.out.println(methodA(3));
    // 1. No exception handling , as it is a runtime exception 
    // 2. 
  }

  public static int methodA (int x ){

   // int result ;
    
    try {
        return methodB(x) + 3 ; 
    }catch ( ArithmeticException e ){
      return -1 ; 
    }
   //       return methodB(x) + 3 ; 
  }



  public static int methodB (int x ){
    return methodC(x-2,x-3) +2 ; 
  }

  
  public static int methodC (int x , int y ){
    return (x+1)/y ; 
  }
}




