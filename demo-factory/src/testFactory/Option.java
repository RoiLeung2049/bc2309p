package testFactory;

public  abstract class Option {
  // call option is an option 
  // put option is an option 
  // European Option
  // American Option 

  private  double maturity; 
  private double strike  ; 

  public Option() {

  }; 

  public void setMaturity(double mat){
    this.maturity = mat;
  }

  
  public void setStrike(double k){
    this.strike = k;
  }

  public double getStrike(){
    return this.strike;
  }

  public double getMaturity(){
    return this.maturity ; 
  }

  public abstract double intrinctValue(double spot  ) ; 

  public abstract String type();

}
