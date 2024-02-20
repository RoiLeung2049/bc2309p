import java.util.HashSet;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Function ;
import java.time.LocalDate ;

public class DemoStream{


  public static void main(String[] args) {
      //Recall
        //  Predicate 
        //Consumer


        List<String> strings =  List.of("Hello" , "World" ,"Bye" , "Bye" ,"ABC"); 

       // List<String> ddd =  List.of("Hello" , "World" ,"Bye" , "Bye" ,"ABC") ; 
        // print all content in strings 
        for( String s : strings){
          if(s.length() <= 3 ){
              System.out.println(s);
          }
          
        }
        int total = 0 ; 
        //stream is to replace the for loop . 
        // after Java 8 , we have a method called stream 
        strings.stream()
               .filter( x ->  x.length()<=3) // inner condition first ; it is called intermediate operation , i.e. i returns stream obj for afterward operation
               // .filter RHS return boolean (true or false) so we can combine different conditon
               .forEach(x -> {
                System.out.println(x);
                //total++ ; this is not ok , it is beacuse the variable is to be final and i can only read , but can't write 
               }); // List<String> -> Stream<String> ; it returns Stream object 
                // terminate operation    i.e. it is the  end of the stream operation
                // Stream will wait terminate operation to start intermediate operation 
        // i can do a series of action like builder pattern 
        // example do if .. else in for..loop
        // .filter input Predicate ; i.e. the s.length() < = 3 if..else
        // for each input the for loop ( input void funciton)
// why do we need stream obj , but not do those in List object? 

          Stream<String> ss = strings.stream()//
                 .filter(s -> s.charAt(2)== 'F'); // dun call terminate operation this time . then it returns a stream<String> object 
        // that means line ss doesnot execute .filter method
        // it will execute .filter() method once the terminal operation is used. 
        System.out.println(strings.size()); // 3 
        System.out.println(ss); //  

               //Convet Data Strcuture  : List -> Set
        Set<String> ss2 = strings.stream()
                                 .filter(s -> s.length() <= 3)
                                 .collect(Collectors.toSet());// Collectors.set is a terminal operation 
        ss2.forEach(x -> System.out.println(x));

        // create new List<String> 
        List<String> ns = strings.stream()//
                                 .filter(s-> s.length() >3 )
                                  .map(s -> {
                                      return s.concat("hello");
                                  }).collect(Collectors.toList());

        strings.forEach(s -> System.out.println("Old ArrayList" + s ));
        ns.forEach(s -> System.out.println("New ArrayList " +s));


        // test for stream  on double array
        ArrayList<Double> dArray  = new ArrayList<>() ;
        // add the element 
        dArray.add(1.0);
        dArray.add(20.0);
        dArray.add(3.0);
        dArray.add(4.0);

        ArrayList<Double> ddArray  = new ArrayList<>() ;
        // add the element 
        ddArray.add(1.0);
        ddArray.add(20.0);
        ddArray.add(3.0);
        ddArray.add(2.0);
        // use the stream 
        Stream<Double> ds = dArray.stream() ; 
        //System.out.println("the stream double is : " + ds) ; 
       // ds.map(s -> s +1).forEach(s -> System.out.println(s));
        boolean testA = dArray.containsAll(ddArray);
        System.out.println("Test containsAll : " + testA) ; 
      //  ds.count();
        Function<Double , String> f = s -> String.valueOf(s) ; 
        // use Funciton interface 
        ds.forEach( s->System.out.println(f.apply(s))); // 1 20 3 4
        // forEach is a terminal operation . 
        
        LocalDate today = LocalDate.now() ; 
        System.out.println(today.toString());

        LocalDate date = LocalDate.of(2024, 12, 24);
        int inte = 1 ;
        //System.out.println( inte);
                      
        List<Person> persons = new ArrayList<>() ;
        persons.add(new Person("Jenny" ,20));
        persons.add( new Person("Oscar", 30));
        persons.add(new Person("Wendy", 19));

        //stream.map() ->  [ ' Jenny ', "Oscar", "Wenndy"]

        List<String> name = persons.stream()
                                    .map(s -> s.getName()) // get the element to be collected by  .coolect() 
                                    .collect(Collectors.toList()) ;

        System.out.println((name));


        // the part for using BookStore  , StoreOwner 
        List<BookStore> booksStores  = new ArrayList<>() ; 
        booksStores.add(new BookStore("Wendy",List.of("ABC","AAA"))) ;
        booksStores.add(new BookStore("Jenny",List.of ("BAC","AAA","XYZ"))) ;

        //StoreOwner 
        List<StoreOwner> owners = persons.stream()
        .map(e-> {
            for(BookStore bs : booksStores){
              if(e.getName().equals(bs.getOwner())){
                return new StoreOwner(bs.getOwner(), e.getAge(), bs.getBooks());
              }
            }
            return null ;
        }).filter(so -> so != null)
        .collect(Collectors.toList());  // e is a person , e
        // coonect booksStore -> booksStore , Person.getAge
       // booksStores.stream().map(e->e.getOwner());

      System.out.println(owners);



      //// get the bookstore owner  with book AAA 
      // AAA -> [ Wendy , Jenny]

      List<String> ownerOfAAA = persons.stream().filter( p -> {
          for(BookStore bs : booksStores){
            if(p.getName().equals((bs.getOwner()))&&bs.getBooks().contains("AAA")){
              return true;
            }
            
          }
           return false ;
        }).map(p -> p.getName()).collect(Collectors.toList());

      
        System.out.println(ownerOfAAA);



        /// sorted() 
        List<String> nameList2 = List.of("Jenny","Tommy","Betty"); 
        Comparator<String> descendingName = (s1,s2) ->  s2.compareTo(s1) ;
        nameList2.stream() 
        .sorted(descendingName ) // sorted input can be comparator , which it can be made by lambda expression
        .forEach(e->System.out.println(e));

        //nameList2.stream().filter(null)
        //Stream.class

        Stream<String> sss =Stream.of("ABC","AAA","VVV");
        
        


  }


}