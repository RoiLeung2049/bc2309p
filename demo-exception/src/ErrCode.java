public enum ErrCode {

  //10001 - 20000

  // enum is to control the Err message .  + wwe have to use enum type ( i.e. ErrCode at the object)
  NAME_TOO_LONG_EXCEPTION(10001,"Name is too long"),
  SERVER_TIMEOUT(10002,"Server connection Time out."),
  DIVIDED_BY_NEGATIVE_EXCEPTION(20000,"Divided by mgative excpeiton"),
  
  // add message here 
  ;

  private int code ; 
  private String errMsg ; 

  private ErrCode(int code, String errMsg){
    this.code = code ; 
    this.errMsg = errMsg ;
  }

  public int getCode() {
    return code;
  }

  public String getMessage(){
    return this.errMsg;
  }
  
}
