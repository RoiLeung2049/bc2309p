public class ifelse {
  public static void main ( String [] args){


    //boolean
    boolean isMale = false ; 
    if ( isMale ){ // it means, if ( isMale == true)
      System.out.println(" I am Male") ;        



    }else {

        System.out.println("I am Female."); // print
    }

    // char
    char grade = 'A' ; 

    if ( grade == 'B') {


        System.out.println(" it is B") ; 

    } else if ( grade == 'C' || grade  == 'A'){
      System.out.println("it is C or A.");
    } else {
      System.out.println("bye");
    }


    // check if a number i a even number 



     int num = 10 ; 
      if( num % 2 == 0 ) {

          System.out.println(" it is an even number . num =" + num) ; 






      }
      if (num % 2 ==1) { 
        System.out.println(" it is an odd number.");
      }

  }

  
}
