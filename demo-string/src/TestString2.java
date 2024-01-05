import java.lang.reflect.Array;
import java.util.Arrays;

public class TestString2 {
   public static void main( String [] args){

      String str = "hello world"; 
      String [] strs = new String[100];
      String tmp = "" ;
      int j = -1;//***** */
      for (int i = 0 ; i < str.length(); i++){
         if (str.charAt(i) ==' ') {
            // if = " " , then we need to assign the value into the array 
          strs[++j] = tmp; //******** the way to add data into an array with initialization */
          tmp = "";
          continue;
         }else {
            
           tmp += str.charAt(i) ; 
         }
      }
      strs[++j]=tmp;



      // alternatively, use method spilt() of an object
      String[] results = str.split(" ");
      System.out.println(Arrays.toString(results));
      // replace () 
      System.out.println(str.replace(" ","_"));
       System.out.println(compute("TTTTT","BBBB"));

   }


  public static String compute (String str1 , String str2){

    // if length of str1 > str2 , else str2 
    if (str1.length() > str2.length()){
      return str1.concat(str2); //  or str1 +str2 
    }else {
      return str2;
    }

  }
}


                 