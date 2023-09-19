/**
 * Example Output
 * Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240

 
    // Your program should be able to handle all the above test case.
    int secondMax;
    // code here
    int [] numArray = nums  ; 
    // define the maximum loop time  which is equal to the length of integer array 
    int counter = numArray.length;
    //System.out.println(counter); //6
    // we can use 3 loops to get the second max 
    //1st loop get the max value 
    // 2st loop get the locatin of the max value in the aray 
    //3rd  with the information of max value index. 2nd loopm  we can get the second max 
    int max = -999 ; 

    for ( int i = 0 ; i < counter; i++){
       if ( max < numArray[i]){
        max = numArray[i] ; 
       }
      }
      int maxLoc = 0 ;
      for (int i = 0 ; i < counter ; i++){
        if ( max==numArray[i]){
            maxLoc = i ; 
        }
      }
    secondMax = -999;
    for ( int i = 0 ; i < counter; i++){
       if ( (secondMax < numArray[i]) &&  (i != maxLoc)){
        secondMax = numArray[i];
       }
      
    }
    // Finally print the result 
    System.out.println("Second Max = " +secondMax) ; 
  }
}