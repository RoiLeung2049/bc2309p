import java.util.Objects;
import java.util.Scanner;

public class DemoUnCheckedException{

  public static void main(String[] args) {



   // Scanner s = new Scanner (Objects obj);
    //nullpointer exception
    try{
      String s = null ; 
      System.out.println(s.length());

    }catch (NullPointerException e){

    }
    int result = 0 ; 
   
    try {
      result = sum(-1,-2);
    }catch (Exception e){
       result = -1 ; 
    }
    // Example1 : 
  //  System.out.println(dividedByZero(9,0)); // we need to think how is the project ?  User ? Developer ?  java.lang.ArithmeticException


    try{
      //Since divided3 would throw a check exception 
      // so the method caller has to handle the method call by try catch 
      result =divide3(9,0);

    } catch (BusinessException e){// this case it is the user to decide we is the handling in case of ArithemticException.  
      //this design let the user to decide the outcome but not the developer 
      System.out.println(e.getErrormessage());
      result = -1;  
    }


    

    //Example 2 

    
  }


//1. ArithmeticException (//by Zero)
  public static int sum(int x1, int x2) throws Exception { // throws Exception means this function will throw Exception
    if(x1 >= 0 && x2>= 0)
      return x1+ x2;
    throw new Exception("ERROt");// if it is empty then it will be unhandled exception.
  //  return  -1 ; 
  }

  public static int dividedByZero(int x , int y ){
    int result = x/y ;
    return result ; 



  }

  public static int  divide2(int x , int y) { // try to fix the ArithemticExeption  , // develoepr has decided . 

    int result ; 
    try{
      result = x/y ;

    }catch(ArithmeticException e){ // Is it a must to cahat ArithemticExceprtion? No 
      // it is because this is an unchecked exception. 
      result = 0 ;  // this try catch has to be agreed with user rather then developer decide without consent
    }
    return result ; 
  }


  public static int divide3(int x , int y ) throws BusinessException { // the throw BusinessException method signature force the user of this code to do try catch 
    // this force the user to decide the hanlding of divde zero exception . 

    
    int result ; 
    try{
      result = x/y ;

    }catch(ArithmeticException e){ // Is it a must to catch ArithemticExceprtion? No 
      // it is because this is an unchecked exception. 
      throw new BusinessException(ErrCode.SERVER_TIMEOUT);  // this case i am using a checked exception 
      // it convert uncheck exception to checked exception  => what to do ? 1) need the method signature throws BusinexxException ; 2) need to do try catch 
    }
    return result ; 
  }




}