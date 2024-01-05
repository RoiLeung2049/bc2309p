public class DemoNullPointer {
  
    public static void main(String[] args) {
      String s = null ; 
      try{
        charAt(s);
      }catch(NullPointerException e){
        System.out.println("null has been handled");
      }
      
    }




    public static void charAt(String s){
      s.charAt(s.length()-1); // error
      //You should fix the program directly
      //instead of using try catch to handle various scenario 

    }
}
