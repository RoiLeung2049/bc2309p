public class DividedByNegativeException extends RuntimeException{
  
  public DividedByNegativeException(){

  }


  private int code ; 

  public int getCode(){
   // super.getMessage();
    return this.code; 
  }

  public String getMessage(){
    return this.getMessage();
  }


  // "10002 - Sever Connection Time out ."
  public String getErrormessage(){
    return this.getCode()+  "-" + super.getMessage();

  }
  
  //public BusinessException(String message){
  //  super(message); 

  //}

//  public BusinessException(){

  //}


 // public BusinessException(String message , int code){
  //    super(message);
 //     this.code = code ; 
//  }

  public  DividedByNegativeException(ErrCode t){ // control the message  and code input to be in enum 
    super(ErrCode.DIVIDED_BY_NEGATIVE_EXCEPTION.getMessage();
    this.code = ErrCode.DIVIDED_BY_NEGATIVE_EXCEPTION.getCode();
  
  }



  public static int calculate(int balance) throws DividedByNegativeException{

    if(balance <0)
      throw new DividedByNegativeException();
    return 10/balance;
    // this statement are a show the negotiation decision with user. 
  }


  

}
