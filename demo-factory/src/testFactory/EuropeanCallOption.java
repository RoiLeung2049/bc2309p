package testFactory;

public class EuropeanCallOption extends Option {

  public EuropeanCallOption(double S, double T){
    super.setMaturity(T);
    super.setStrike(S);



    
  }
  @Override
  public double intrinctValue(double spot){
    return Math.max(spot-super.getStrike(), 0);
  }

  @Override
  public String toString(){
    return "this is an option of calss : " + this.getClass() + " with strike :" + super.getStrike() + " with maturity : "  + super.getMaturity() ;
  }

  @Override
  public String type(){
      return OptionType.EUROPEAN.toString();
  }
  
}
