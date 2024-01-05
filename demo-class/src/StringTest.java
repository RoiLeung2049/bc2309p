public class StringTest {



  public static void main(String [] args){

  // Approach 1 
  String str = "hello" ; // str is a object reference  in stack
  // "hello" is an String object in heap 

  //Apporcah 2
  String str2 = new String("hello") ;  // with  new keyword -> created an object in heap  
  // an obj reference str2 pointing to String object in heap 
  // only the 8 primitives type and String can create obj without new. 

  System.out.println(str.equals(str2));

  System.out.println(str == str2);// false


  String str3 = str;  // a new reference str3 is pointing to the same object as str so 
  System.out.println("target check point :" + (str ==str3)); // true 

// change the content in obj reference str , 
  str = " helloA";
  System.out.println("after change of content " + str);
  // check the content in obj reference str str3 ; 
  System.out.println("the content of str3 is "+str3);//"hello"

  // compare again 
  System.out.println("now compare again:" + (str==str3));
  String str4 = "hello"; // under te code of Strign class, it has the mechanism to find 2 String variable with the same value of "hello"
  // so it "reuse" the samae object 

  System.out.println(str == str4);  // true ???!!!! 

  String str5 = "hello!" ;

  System.out.println(str== str5); 
  

  }

  
}
