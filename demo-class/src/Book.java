public class Book {

  int noOfPages ; 
  String author ; 

  public void setAuthor(String x) { // no static here ! => it is an instance method (i.e. an instance means object)
    this.author = x; //
  }

  public String getAuthor(){
    return this.author ; 
  }

  public void setNoOfPages(int num){
    this.noOfPages = num;
  }
  
  public int getNoOfPages(){
    return this.noOfPages ;
  }
  public static void main ( String[] args){
    Book book1 = new Book() ;  // book1 is an object.

    Book book2 = new Book() ; // book2 is another object. 

    book1.setAuthor("John");
    System.out.println(book1.getAuthor()) ;
    book1.setNoOfPages(50);
    System.out.println(book1.getNoOfPages());

  }

}
