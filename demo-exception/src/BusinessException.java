public class BusinessException extends Exception {
  // class for Checked Exception

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

    public  BusinessException(ErrCode t){ // control the message  and code input to be in enum 
      super(t.getMessage());
      this.code = t.getCode();
    
    }

    public static void main(String[] args) {
     // BusinessException b = new BusinessException(NAME_TOO_LONG_EXCEPTION);

    }
  
}
