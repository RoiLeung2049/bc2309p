import java.util.Optional ; 
import java.util.List;
import java.util.ArrayList ; 
public class OptionalMethod {

  public static String[] database = new String[] {"xyz","ijk","abc"};

  public static List<String> database2  = new ArrayList<>(List.of("xyz","ijk","abc"));
  public static void main(String[] args) {

      Optional<Integer> intOp = OptionalMethod.fromDatabase("mmm"); // return Optinal[2] 
// Optional is a type that we can remove the occurenec of null point
// usually we will check the Optional object return and this can prevent us form null Pointer Exception 

    //Approach 1 : .get() 
      if(intOp.isPresent()){
        System.out.println(intOp.get());

      }else{ // case when not found the element .In this case , we don't have nullPointException
        System.out.println("Not found.");
      }
      // Approach 2 : orElse()
      Integer integer = intOp.orElse(0);
      //Approach 3 : ifPresent()
      intOp.ifPresent( e-> {
        System.out.println("integer is " + e );

      });

      //Approach  4 : orElseThrow() 
      intOp.orElseThrow( () -> new RuntimeException());
      System.out.println(intOp);


  }



  // the output of Optional will not return null 
// we don't want to return a null to the method user , as a developer, soln:
  public static  Optional<Integer> fromDatabase(String s){
    // Common Use Care : Optional<T> as a return type 

    // if we can't fidn s, we will return null 

    for( int i = 0 ; i < database.length;i++){
      if(s.equals(database[i])){
        return Optional.of(i) ;
      }
    }
    return Optional.empty();
  }

    public static  Optional<Integer> fromDatabase2(String s){
    // Common Use Care : Optional<T> as a return type 

    // if we can't fidn s, we will return null 

      Optional<String> os =  database2.stream() //
                  .filter(e ->  "abc".equals(e)) //"abc" 
                  //.map(e-> database2.indexOf(e)) // after map , it become a String
                  .findFirst() ;//
                  
      
    if(!os.isPresent()){
      return Optional.of(-1) ;
    }

    return Optional.of(database2.indexOf(os.get()));
    

}

}
