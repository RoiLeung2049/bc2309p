public class Ooption {

  private double strike;
  private double maturity ; 
  private String optionType ;
  // constructor 
  public Ooption(){

  }

  public Ooption(double s , double t, String cp){
    this.strike = s ; 
    this.maturity    =  t ; 
    if (cp.toLowerCase().equals("call") || cp.toLowerCase().equals("put")){
      this.optionType = cp ; 
    }else {
      this.optionType = null ;  // need to be handled by exception 
    }
  }

  public double intrinctValue(double spot ){

    if ( this.optionType.toLowerCase() =="call"){
      return Math.max(this.strike , 0 );
    }else if (this.optionType.toLowerCase() == "put"){
      return Math.max(this.strike - spot , 0 ) ; 
    }
    return  -1  ; 
  }

  
}
