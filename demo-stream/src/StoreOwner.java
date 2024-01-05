import java.util.List;
public class StoreOwner {

  private String name ; 

  private int age ; 

  private List<String> books ;
  public StoreOwner() {

  }

  public StoreOwner(String name , int age , List<String> books){
    this.name = name ; 
    this.age = age ; 
    this.books = books ;  
  }

  public int getAge(){
    return this.age ; 
  }

  public String toString(){
    return "StoreOwner(" 
          + "name=" + this.name 
          + ", age=" + this.age 
          +" , books= " + this.books;
  }


  
  
}
