public class TestStringagain{
  
public static void main(String[] args){
  
      String str1 = "abcd";
      String str2 = "xxza"; 


      // return true / false 
      // question : check if two string has a common char 


    boolean test = false ; 
    int tmp = 0; 

    for ( int i = 0 ; i < str1.length(); i++){
      
      for ( int j  = 0 ; j < str2.length(); j++){
        //System.out.println("test is now "+ test);
        if ( test ){
            break;

        }else{
          //System.out.println(str1.charAt(i));
          //System.out.println(str2.charAt(j));
          if ( str1.charAt(i) == str2.charAt(j)){
            test = true;
            tmp = i;
          }

        }
      }

    }

        if (test ){
      System.out.println("there is common char. and the char is "+ str1.charAt(tmp));
    }else {
      System.out.println("there is no common char.");
    }


}

  }