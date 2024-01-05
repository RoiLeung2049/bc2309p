public class Gclass<T> {


  private T item ; 


  public Gclass(){

  }

  public Gclass(T input){
    this.item = input ; 
  }

  public  T getItem(){
    return this.item; 

  }
  
  public static void main(String[] args) {
    Gclass<String> gs = new Gclass<>("Test");

    System.out.println(gs.getItem());
  }
  
}
