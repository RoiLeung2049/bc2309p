package comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByPriceAsc implements Comparator<Book>{

  @Override 
  public int compare(Book o1, Book o2) { 

    return  o1.getPrice() > o2.getPrice() ? 1 : -1 ; 
  }
  
  public static void main(String[] args) {
    List<Book> books = new ArrayList<> (List.of(new Book("A",30.5), new Book("B",50.8), new Book("C",40.9)));

    Collections.sort(books,new SortByPriceAsc());// asscending 

    System.out.println(books);
  }
}
