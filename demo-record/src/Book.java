public record Book(String bookName, String authorName){// default input are public variable 

  
  // can we define funciton in it ?? 

  public Book { // no "()" in it , and this is the code that is addded to the record's constructor to be executed 
    if(authorName == null || bookName == null ){
      throw new IllegalArgumentException();
    }
  }

  //public void setter(String n){
  //  this.bookName = n ; 
 // }
 // the attribute has been final -ed. 


 public static int add(int x, int y ){
  return x + y ; 

 }

 public void publish(){
  System.out.println(this.authorName + " " + this.bookName()) ; 

 }


 public static final int Num = 10 ; // ok 
 public static String bookstore = "ABC" ; 

}