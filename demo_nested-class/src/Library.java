public class Library {
  
  private String name ; 

  public Library(){

  }

  public Library(String name){
    this. name = name ; 
  }

  public  Book valueOf(String id ){
    return new Book(id);

  }
  public class Book{

     // private String  name ;
    private String id ; 
    public Book(String id ){
      this.id = id ; 
    }

    public String info(){
      return this.id ; 
    }


  }



  
}
