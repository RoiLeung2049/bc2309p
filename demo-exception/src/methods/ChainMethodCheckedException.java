package methods;

public class ChainMethodCheckedException {



  public static void main(String[] args) {
    // main ->A->B->C
    //C throw checked excption 
    // A & B do not hanlde it 
    // main hanlde try catch 
    try{
       System.out.println(methodA(1));
    } catch ( Exception e ){
      System.out.println("Error");
    }
   
  }

  public static int methodA(int x) throws Exception{
    return methodB(x);
  }

  public static int methodB(int x) throws Exception{
    return methodC(x-1);
  }  

  public static int methodC(int x) throws ArithmeticException{
    try{
         return 1/x ;
    }catch (ArithmeticException e){
      throw new ArithmeticException();
    // return -1; 
    }
   
  }
}
