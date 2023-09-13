public class TestLoop {
  public static void main(String [] args){
    //native example 

    int x = 2 ; 

    x *= 2 ;
    x *= 2 ;
    x *= 2 ;
    x *= 2 ;
    x *= 2 ;
    x *= 2 ;
    x *= 2 ; 
    System.out.println ( "x is :" + x);


    //or using loop

    x = 2;
    // for (counter ;continue criteria ; update )
    // Step 1 : int i = 0 ; 
    // Step 2 : check if i < 7 ; 
    // Step 3 : x = x *2 ; 
    // Step 4 : i++ -> i become 1 ;
    // Step 5: check if i < 7 ; 
    // Step 6 : x = x * 2 ; 
    // Step 7 : i++ ; i becomes 2 ; 
    // .....
    // Step n: i++ ; => i become 6 
    // Step n +1 : check if i < 7 ; 
    // Step n + 2 : x = x * 2 ;
    // Step n + 3 : i++ ; -> become 7 
    // Step n + 4 : check if i < 7 -> false -> exit loop
    for ( int i = 0 ; i < 7 ; i++ ){

      x  = x * 2 ; 
      System.out.println(x); // print7 times 

    }

    //System.out.println(x);
  }
}
