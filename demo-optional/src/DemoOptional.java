import java.util.Optional;

public class DemoOptional{


  public static void main(String[] args) {
    String s = null ; 

    Optional<String> os = Optional.ofNullable(null); // os is an object ,but it is not null 
    //Optional<String> os2 = Optional.empty();

    //Approach 1 : isPresent() + get() 
    if(os.isPresent()){
      System.out.println(os.get());
    }else {
      System.out.println("os's string is a null value");
    }

    os.ifPresent(e -> {
      System.out.println(e);
    });

    Optional<String> os3 = Optional.ofNullable("John");
        os3.ifPresent(e -> {
      System.out.println(e);
    });


    //ofNullable() vs of() 
    //Optional<Integer> oi = Optional.of(null); // it can't be null  // if you don't want person to put null value , we can use .of() otherwise , nullpointer exception 

 //   if(oi.isPresent()) {
 //     System.out.println("present");
 //   }

  Optional<Integer> oi = Optional.of(10) ; // auto-box 

  Optional<String> os2 = Optional.empty() ; 
 // os2.
  if(os2.isPresent()){ // os2 is not null , but os2's value is null . 
    System.out.println("os2 present");
  } else {
    System.out.println("os2 is not present");
  }

  //Approach 2 : orElse()
  Integer integer = oi.orElse(0);

  //Approach 3 : ifPresent() 
  oi.ifPresent(e -> {
    System.out.println( "the Integer is " + 1);
  });



  
  }

}