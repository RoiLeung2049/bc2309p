public class TestEnum {


  public enum Currency{
    USD , GBP , EUR , HKD
  }

  

  public enum Currency2{

    USD("USD", "FED"),
    Eur("EUR","ECB"),
    AUD("AUD","BOA");
    private final  String name ;
    private final String CentralBank ; 

    public String getCentralName(){
      return this.CentralBank;
    }
    private   Currency2(String n , String CB){
      this.name  = n ; 
      this.CentralBank = CB ; 
    }
  }

  public static void main(String[] args) {
    
    for(Currency2 ccy : Currency2.values()){
      if(ccy != Currency2.Eur ){
        System.out.println("The ccy is : "+ ccy) ;
        System.out.println(ccy.CentralBank);
      }
      
    }

  }
  
}
