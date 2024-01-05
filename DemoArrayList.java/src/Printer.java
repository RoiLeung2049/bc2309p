public class Printer<T> {

  // do generic myself
  // make the Printer class to contain generic type object 
  private T x ; 

  public T getX(){
    return this.x; 
  }

  public void setX(T y){
    this.x = y ; 
  }

  public Printer (T x ) {
    this.x = x ;
  }
  
  public Printer() { 

  }

  public static void main(String[] args) {
    Printer<String> printer = new Printer<>("3");
    Printer<Integer> intPrinter = new Printer<>();
    Printer<Double> doublePrinter = new Printer<>() ;
    

  }
  
}
