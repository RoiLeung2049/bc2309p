package comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book implements Comparable<Book>{

  private String name ;
  
  private double price ; 
  
  public Book(){

  }

  public Book(String name , double price){
    this.name = name ; 
    this.price = price ; 
  }
  public double getPrice(){
    return this.price; 
  }
  @Override
 public String toString(){
  return "name is " + this.name + "and " + "price is " + this.price ;
 }
  // public int compareTo(T o) ; 
  @Override // Part 1 of sort algo 
  public int compareTo (Book book) { // this is for sorting algorithem . the larger price , come first 

    return book.getPrice() > this.price ? -1 : 1 ; 

  }


  public static void main(String[] args) {
    List<Book> books = new ArrayList<> (List.of(new Book("A",30.5), new Book("B",50.8), new Book("C",40.9)));


      // Part2 of sort algo ; 

      Collections.sort(books); // this is pass by reference 


      System.out.println(books);

    
  }
}
