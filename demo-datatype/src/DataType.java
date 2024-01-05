public class DataType {
  public static void main(String[] args) {
    String str = " Hello World!!!"; // Assign value  "Hello World!! " to a variable , str .  
    System.out.println(str); //Print the value of  variable : "Hello World"
    System.out.println("str"); // Print the String value : str
    String box ; //Declaration 聲明  declare what datatype the variable box can save. 
    box = "abc" ; //Assign value "abc" to a variable box . 
    System.out.println(box); //abc

      // Primitives ( one kind of data type), 8 type in total
      int x = 3 ; 
      System.out.println(x);
      int Salary = 100;
      Salary = Salary + x ; 
      System.out.println(Salary);

      int z = Salary /2 ; //103/2 = 51 or 52  
      System.out.println(z);

      // self +1 
      int j = 0 ;
      j++ ; 
      j += 1; 
      System.out.println(j);
      ++j ; 
      System.out.println(j);
      // Can we assign int into a String 
      //String testSte = 1 ; can't  
      String d = "test" ;
      d = d + "ing";
      System.out.println(d);
      double k =  3 ; //assign int to varaible d2, then convert int to double  
      k = k + 1 ;
      System.out.println(k);
      System.out.println();
      //Boolean

      boolean  a   = true ;
      System.out.println(a);
      
      // char  , it is similar to String 
      char t = 'a' ; 

      //byte b = 129 ; // if b = 129 , there will be an error. 
      short sh ; 
      sh = 32767 ; 
      long l1 = 10000; 
      l1 += 10000; 
      System.out.println(l1);

      String k2 = "abc" ; 
      k2 += " bcd";
      System.out.println(k2) ; 


      double d4 = 3.0; // by default, Java treats 3.0 as double. if you put 3.0 into float, then there is any error. 
      float d5 = 3.0f;
      float dd = 3.0f;
      double df = 0 ;
      float fff= 0; 
      long rr = 5; 
      if (df == fff)
        System.out.println("they are the same.");
      else 
        System.out.println("They are  not the same.");
     double  ii = 13 ;
     ii = ii /4 ; 
     System.out.println(ii);


    byte value =127;
    for (int i = 0 ; i<10; i++){
      value ++ ;
      System.out.println("Value:" + value);
    }
  }
}
