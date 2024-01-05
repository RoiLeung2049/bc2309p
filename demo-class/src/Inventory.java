public class Inventory {

  // class inside a class 
  Stock[] stocks ; // stock array for more than one stock  at this line,  the object reference is null.

  static String location ="TST" ; // the static keyword means this variable follow the class , but not object.

  public void setStock(Stock st){
    // get he index which is the largest one not null element 
    int tmp = 0; ;
    for ( Stock s : this.stocks){
      if (s!= null) {
          tmp++ ; 

          /// or we can ue keyword break 
          // for ( int i = 0 ; i < this.stocks.length; i++){
          // if(stocks[i]== null)
          //  stocks[i] = stock ; 
          // break ; // this for loop will be broken.   
          
      }
    }
    this.stocks[tmp] = st;
  }

  public Inventory(){
     this.stocks = new Stock[100];
  }
  public Inventory(Stock s, String location){
    this.stocks = new Stock[100]; // array need to define the length of the list; 
    this.stocks[0] = s;
    //this.location = location ; 
  }

  public void setLocaation(String L){
  //  this.location = L ; 
  }
  // method: return no. of stock in the stock array 

  public int getNumOfStock(){
    int tmp  = 0 ; 

     
    for ( Stock s : this.stocks){
      if (s!= null) {
          tmp++ ;
      } 
     
    }
    return tmp ; 
  }
  public Stock[] getStock(){
    return this.stocks ; 
  }
  public static void main(String[ ]args){

    // new a stock ; 
    // new a inventory 
    double price = 100.0 ; 
    Stock st = new Stock(price);
    double price2 = 99.0 ;  
    Stock st2  = new Stock(price2);
   // Stock[] sts = new Stock[5]; 
  //  sts[0]= st;
    Inventory inv = new Inventory(st,"Test");
    //inv.setStock(st);
    inv.setStock(st2);
    double price3 = 2000.0;
    Stock st3 = new Stock(price3);
    inv.setStock(st3);
  //  System.out.println(inv.stocks[0].price);//100

    for (Stock s : inv.getStock()){
      if (s != null){
          System.out.println(s.getPrice());
      }
      
    }

    System.out.println(inv.getNumOfStock()); //3

    System.out.println(Inventory.location);//TST

  }
  
}
