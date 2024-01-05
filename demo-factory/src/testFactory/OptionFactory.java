package testFactory;

public interface  OptionFactory {

    public  Option createCall(double S ,double T);

    public Option createPut(double S ,double T) ; 


    public static OptionFactory create(OptionType type){
      return switch(type){
        case EUROPEAN -> new EuropeanFactory();
        case AMERICAN -> new AmericanFactory();
         
      };
    }


    public static void main(String[] args) {
      double spot = 100d ; 
      double strike = 110d ; 
      double maturity = 2d ; 

      // create European Put option ; 
      OptionFactory oF = OptionFactory.create(OptionType.EUROPEAN);
      Option callOption =  oF.createCall(strike, maturity);

      System.out.println(callOption);

      System.out.println( " the instrinc value is "+ callOption.intrinctValue(spot) );
      System.out.println(callOption.type());


      OptionFactory aF = OptionFactory.create(OptionType.AMERICAN); 
      Option aPutOption = aF.createPut(strike, maturity); 

      System.out.println(aPutOption);


      System.out.println(aPutOption.type());


    }
  
  
  
}
