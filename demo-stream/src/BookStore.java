import java.util.List;

public class BookStore {

  private String owner ; 

  private List<String> books ; 

  public BookStore(){

  }

  public BookStore(String name , List<String> books){
    this.owner = name ; 
    this.books = books ; 
  }


  public String getOwner(){
    return this.owner ; 
  }
  public List<String> getBooks() { 
      return this.books;
   }
  
}
