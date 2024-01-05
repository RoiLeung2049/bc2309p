public class StringBuilderTest {
  
    public static void main(String[] args){
      StringBuilder stringBuilder = new StringBuilder() ; //constructor 
      stringBuilder.append("hello"); // stringBuilder is an object ref
      //append() is an instance method.  this method belong to the obj in heap. 
      stringBuilder.append("world");
      // java return type can have no obj reference to point to it. but you can't use different type obj refer to pointing. 
      System.out.println(stringBuilder.toString()) ; 

      System.out.println(stringBuilder.append(" ").append("something").toString()); // change of state : from StringBuilder to String  
      System.out.println(stringBuilder.toString());
      System.out.println(stringBuilder.append(" ").append("something").toString());

      // 1 -10, even number , by using String builder 
      // output : 236810

      StringBuilder sum = new StringBuilder(); 
      for (int i = 1; i < 11 ; i++){
        if (i%2 == 0){
          sum.append(i);
        }
        
      }
      System.out.println(sum.toString());



      StringBuilder testString = new StringBuilder(sum);
      // test String array 
      String tesA = "Green!" ; 
      // convert the String into char Array 
      char[] testCharA = tesA.toCharArray() ;
      // put them into StringBuilder
      StringBuilder testASB = new StringBuilder(tesA); 
      System.out.println(testASB);
      boolean ff=testASB.toString().equals(tesA);
      String.valueOf(0);
      System.out.println(ff) ;// T
      
      //testString.append()
      
    }
}
