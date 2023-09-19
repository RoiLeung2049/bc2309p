/**
 * 
 * When target = 'c', the expected output:
 * We found 3 character c in the String.
 * 
 * When target = 'z', the expected output:
 * Not Found.
 */
// Count the target of character in a String.
public class JavaQuest5 {
  public static void main(String[] args) {
    String str = "Welcome to the coding bootcamp."; // You should not change this line
    char target = 'c'; // Update this target to test the logic

    // Use a loop to count the target of character in a String.
    // code here
    // define a counter for number od char. match with target  in str
    int num = 0 ; 
    // convert the str into char Array
    char[] cArray = str.toCharArray();
    for (char d : cArray) { // check the char in cArray with target char
      if (d == target){
         num += 1;  
      }


    }

    // if found, print "We found 3 character c in the String."
    // if not found, print "Not Found."
    // code here
          /// the final part to give the  matching result by println
      if (num !=0){
        System.out.println(" we found "+ num + " character c in the String.");

      }else { // case when no match occur.
        System.out.println("Not Found.");
      }
  }
}