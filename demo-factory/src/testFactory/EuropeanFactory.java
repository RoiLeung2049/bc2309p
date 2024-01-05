package testFactory;

public class EuropeanFactory implements OptionFactory{
  
  //EuropeanFactory use Euro Call and Euro Put 
  @Override
  public Option createCall(double S , double T) {
   return new  EuropeanCallOption( S,  T) ;

  }

  @Override
  public Option createPut(double S , double T) {
   return new  EuropeanPutOption( S,  T) ;

  }



}
