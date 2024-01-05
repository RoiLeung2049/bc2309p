package revision;

public class Book {

  // for class ,ususally we have private for variable  for member data 
  private double price ; 
  private String author; 


  public Book() {  // this empty constructor can be put private or public . if it is private , then it can be only used by method in this class . 

  }

  public Book( double p , String a){
    this.price = p ; 
    this.author = a ; 
  }

  //get
  public double getPrice(){
    return this.price;
  }

  public String getAuthor(){
    return this.author ; 
  }
  //setter   this is a freedo to determine wther to have setter or not 
  
  public void setPrice(double p){
    this.price = p ; 
  }

  public void setAuthor(String a){
    this.author = a ; 
  }

  //toString
  @Override
  public String toString(){
    return "auther is : "+ this.author + "," + " price is : " + this.price ;
  }
}
