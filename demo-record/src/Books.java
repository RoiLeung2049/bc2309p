public class Books {

  private String bookName ; 
  private String autherName ; 


  public Books() {

  }

  public Books(String n , String an ){
    this.bookName = n ; 
    this.autherName = an ;
  }

  public String getName(){
    return this.bookName ;
  }

  public String getAutherName(){
    return this.autherName ;
  }
  @Override
  public String toString(){

    return "Book [" + "bookName=" + this.getName() + ", authorName=" + this.getAutherName() + "]"  ; 

  } 


  
  public boolean equals(Books book2){
    return this.autherName.equals(book2.getAutherName()) && this.getName().equals(book2.getName());
  }

  
}
