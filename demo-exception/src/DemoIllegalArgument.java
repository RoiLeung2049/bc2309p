public class DemoIllegalArgument {
  
  private int balance ; 

  public DemoIllegalArgument(int balance){
    this.balance = balance ; 
  }

  public static void main(String[] args) {
    DemoIllegalArgument account = new DemoIllegalArgument(1);
    account.credit(-100);
  }
  
  public void credit( int amount){

    if(amount <= 0){
      throw new IllegalArgumentException("WRONG VALUE") ; // this program will not do the code below 
    }

    this.balance  += amount ; 
  }
}
