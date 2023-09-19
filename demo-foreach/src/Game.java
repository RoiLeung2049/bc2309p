import java.util.Random;
import java.util.Scanner; 

public class Game { 

  public static void main(String[] args){

    // range 1 - 100
    // bomb : 74 ( random number )
    // User guess a number between 1 - 100 
    // 70 
    // User guess a number between 71 -100 
    // 80
    //User guess a number between 71-79 
    //....
    // 74 -> bomb 



    /// which type of loop   
    ///if input number  != bomb  then  
    //revise the range of min and max  and 
    // ASk user to pick again 
    // do while loop , user at least guess one time 
    // how to ask user question ??  Scanner 
    // how to set the random number 
    // compare user input vs bomb 
    // revise the range for user to pick again

    int min = 1 ;
    int max = 100 ; 
    int bomb  = new Random().nextInt(101); //give 0 ,1, 2, ,3, 4, 5, .. 100
    System.out.println(bomb);
    int userNum = 0 ; 
 
    
    do {
      // How to ask user question 
      // compare user input vs bomb
      // revise the range of the use pick again
      Scanner input = new Scanner (System.in);
      System.out.println(" please give a number betwen :"+ min + " and "+ max); 
      userNum = input.nextInt();
  //    input.close();


      //Validation , check if input is within range
      if ( userNum < min || userNum > max){
        System.out.println(" please revise your number . you input is out of range"); 
        continue ;// userNum = input.nextInt();
      }
            // compare the user input
      if ( userNum != bomb){
        // revied the range of the use pick 
        if (userNum < bomb) {
          // need to revise the min
          min = userNum+1;
        }else if ( userNum > bomb){
          // need to revise the max
          max = userNum-1 ; 
        }

      }else {
        System.out.println( " Game Over !!"); 
      }
      input.close();
    }while(userNum != bomb);
    
    
    



  }
  
}
