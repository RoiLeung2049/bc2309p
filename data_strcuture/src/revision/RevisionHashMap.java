package revision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RevisionHashMap {

 public static int counter = 0 ; 
  private static final String KEY_PREFIX = "B"; // static final need to be CApital letter and _ to sepaerate



  public static Book putNew(Map<String,Book> bookMap , Book book){
    bookMap.put(genKey(),book) ; 
    return null ; 
  }
  public static void main(String[] args) {
 
      // map usual use key as String , value as class
  Map<String , Book> bookMap = new HashMap<> () ; 

  bookMap.put(genKey(), new Book(12.0 , "HP"));
//  counter++;
  // key -> "B1" , "B2" , "B3" 
bookMap.put(genKey(), new Book(13.0 , "HR"));

  

System.out.println(bookMap);

    List<Book> books = new ArrayList<>(); 
    

  for (Map.Entry<String, Book> entry : bookMap.entrySet()){ // set of key-pair in entrySet
    books.add(entry.getValue());
  }




  RevisionHashMap.putNew(bookMap, new Book(30.2 , "Mary"));



    System.out.println(books); 


    String bookKey  = "B3" ;
    
    if(!bookMap.containsKey(bookKey)){

      bookMap.put(bookKey,new Book(40.5 , "Sally"));

    }


    
    String bookKey2  = "B4" ;
    
    if(!bookMap.containsKey(bookKey2)){

      bookMap.put(bookKey2,new Book(50.5 , "Tommy"));

    }


    System.out.println(bookMap);

  }
  
  public static String genKey() { 
    return KEY_PREFIX.concat(String.valueOf(++counter));
    // we need a counter / a static variable to monitor the number of key,value pair in map 

  }



  
  
}
