package revision;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RevisionArrayLiat {

  public static void main(String[] args) {
    
      // usual practice LHS :List  ; RHS : ArrayList

      List<Book> books =  new ArrayList<>();  
    // add 3 books into books 
      books.add( new Book(100.2,"HP"));
      books.add( new Book(45.0,"HG"));
      books.add( new Book(30.0,"IQT"));
      
      // print the result
      System.out.println(books);// need to make toString 


      // for-each loop -> "ABC,30.0"

      for ( Book b : books){
        System.out.println(b.getAuthor() + "," + String.valueOf(b.getPrice()));
      }

      //calculate average price 
      double numOfBook = books.size();
      System.out.println("Print" + numOfBook);
      BigDecimal sum = BigDecimal.valueOf(0) ; 
      for (Book b : books){
        sum = sum.add(BigDecimal.valueOf(b.getPrice()));
      }
      // to be fixed 
     // double averagePrice = sum.divide(BigDecimal.valueOf(numOfBook).setScale(2,BigDecimal.ROUND_HALF_UP)).doubleValue() ; 

     // System.out.println("the Average Price of Books is " + String.valueOf(averagePrice));


     List<Book> books2  = new ArrayList<>();
     books2 = books.subList(2,books.size()-1);
     // books refer to original ist Books
     // 
   //  Book removed = books.remove(0); 

    // System.out.println( "removed is +" + removed.getAuthor() );

     //System.out.println("remain" + books);


     // rmove all books with price > 50 ; 
    //  for ( Book b : books){
      //  if (b.getPrice() > 50.0){
        //  books.remove(books.indexOf(b)); // java.util.ConcurrentModificationException . 
          //i.e. the for each loop get the obj to loop, it has been locked at can't be modified  atm . 
          // => this implicit that for-each loop is for "Read" purpose only but not "Write" or modification prupose .

        //}

        // for modification purpose , we need to use index 
        for ( int i = 0 ; i< books.size(); i++){
          if(books.get(i).getPrice() > 50.0){
             books.remove(i);
          }
        }


          System.out.println(books);

          // Add all the bookd to a Set collection HashSet

          Set<Book> bSet = new HashSet();

          for (Book b: books){
            bSet.add(b);
          }
          System.out.println(bSet);
          // Add all the books to an Array (Book[])

          Book[] bArray = new Book[books.size()];
          for ( int i = 0 ; i < books.size(); i++){
            bArray[i]= books.get(i);
          }
          bSet.clear() ; 
          bSet.addAll(books);// addAll can input Collections 


          
          for ( int i = 0 ; i < books.size() ; i++){
             System.out.println("Array :"+ bArray[i]);
          }
         



      }

           
  }

  

