package test_file;

import java.util.Arrays;

public class test {
  public static void main (String[] args){
    String str = "I am a boy.";
    Character cC = str.charAt(3);
    System.out.println(cC.compareTo(str.charAt(2)));
    // convet a char into nunmber 
    System.out.println((int)'a'); //97
    System.out.println('a' );//98
    System.out.println((char) ('a' +0));
    Integer aa = 4; 
    String testStr = Integer.toString(0);
    System.out.println(Integer.valueOf("42"));
    System.out.println(testStr);
    // get the number of and chard 

    // get  the length of String 
    int sLength = str.length() ; 
    System.out.println(sLength) ; 
    int index1 = str.indexOf(65);
    System.out.println(index1);// 2
    String str2 = "I am a girl.";
    System.out.println(str.compareTo(str2));
    // test obj 
    Integer num1 = Integer.valueOf(127);
    Integer num2 = Integer.valueOf(127);

    System.out.println(num1 == num2);

    Integer num3 = new Integer(127);
    System.out.println(num1 == num3 );
    System.out.println(num3.parseInt("34"));
    System.out.println(num3.max(aa, index1));




    // tset Array 
    double[] dA = new double[] { 3.0 ,4.0 , 6.0, 50, 100, 9 , 3.0,4.0} ;
    double[] dB = new double[] {3.0 , 4.0 , 6.0} ;
    //dB = dA ; 
    System.out.println(dA.equals(dB)) ; //false
    
    // try to find the second max of the array : 
    double max1 = dA[0];
    double max2 = dA[0];
    double max3 = dA[0];
    for ( int i = 0 ; i < dA.length;i++){
      if(dA[i]> max1){
        // first put max1 into max2 for storage ; 
        max3 = max2;
        max2 = max1 ; 
        max1 = dA[i];
      }

    }
    // testfor String compare 
    System.out.println( " this is the part for testing String comparison.____________________");
    String input = "this"; 
    String target = "qte"; 
    
    String[] parts = target.split("");
    System.out.println(parts.length);
    // this a string compare string 
    System.out.println( "String compare String" + input.contains(target) ); //if this string contain it then it will return non-negative number; without , return -ve 

    for (String s : parts){
       if ( input.contains(s)){
        break ; 
       }else {
        continue;
       }
    }
    // compare at char level 

 
    } 
  }

