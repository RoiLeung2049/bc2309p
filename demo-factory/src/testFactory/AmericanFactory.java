package testFactory;

public class AmericanFactory implements OptionFactory{
  
  //EuropeanFactory use Euro Call and Euro Put 
  @Override
  public Option createCall(double S , double T) {
   return new  AmericanCallOption( S,  T) ;

  }

  @Override
  public Option createPut(double S , double T) {
   return new  AmericanPutOption( S,  T) ;

  }



}
