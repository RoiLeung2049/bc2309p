package syntax;

import java.util.Random;

public class DemoSyntax {



  public static void main(String[] args) {
      
    SupplyInteger randomOddNumber = () -> {
          int times =  new Random().nextInt(10);
          return 1 + times * 2 ; 

      };

      System.out.println(randomOddNumber.getInteger());

      SupplyString sayHello = () -> "Hello World";

      System.out.println(sayHello.supply());

      // to prevent make 2 class for comparable interface 
      // by lambda 
      SupplyString howAreYou;
   //   if(x >= 10){
    //    howAreYou = () -> {
    //      return "hello";
    //    };
    //  }else{
     //   howAreYou = () -> {
      //    return "World";
      //  };
      //}

     // System.out.println(howAreYou.supply);
     CharFunction ctest = (a ,b) -> {
        return a.charAt(b);
     };

     System.out.println(ctest.charFunction("Hello World",2));// l

     
  ConcatFunction coF = (sList) -> {
    StringBuilder s = new StringBuilder() ; 
    for( String ss : sList){
        s.append(ss);
    }
    return   s.toString();
  };

  System.out.println(coF.concat(new String[]{"abd","def"}));
  coF.concat(new String[]{"abd"});
  }



}
