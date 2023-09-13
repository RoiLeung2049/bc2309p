import java.util.Arrays;

public class DemoArray {


  public static void main(String []args){

    //array 
    int[] array ;  // make the memory locaation in a ordered format  array or new keyword make memory connected toegether
    // unlike declare variable , they are in unorganized location in memory.   
    array = new int[3] ;  // initialization 

    int[] arr = new int[3];  // 0 , 1, 2 is the index of the array 
    //assign value to array 
    arr[0] = 100 ; 
    arr[1] = 105;
    arr[2] = 108 ; 
    // arr[3] =110 ; // run-time error 



    arr[1] = 106; // array's value can be reassign afterward 
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

    int  o = arr[0]; // arr[0] is a integer value 
    //arr[1] = 3L; error , cannot assign long value to int variable. 
    System.out.println(o); 

    // decalre int array length  6 
    int[] arrr = new int[6];
    arrr[0]= 1;
    arrr[1]= 2;
    arrr[2]= 3;
    arrr[3]= 4;
    arrr[4]= 5;
    arrr[5]= 6;

    System.out.println(arrr[0]);
    System.out.println(arrr[1]);
    System.out.println(arrr[2]);
    System.out.println(arrr[3]);
    System.out.println(arrr[4]);
    System.out.println(arrr[5]);

    // decalre cahr array with size 4 
    char[] Carr = new char[4];
    Carr[0]= 'd';
    Carr[1] = 'o';
    Carr[2] = 'g';
    Carr[3] = '.';

    System.out.println(Carr[0]);
    System.out.println(Carr[1]);
    System.out.println(Carr[2]);
    System.out.println(Carr[3]);

    //boolean array 
    boolean[] Boom = new boolean[2];
    Boom[0]= true;
    Boom[1]= false; 

    System.out.println(Boom[0]);

    // we can declare the array with assignment 
    int[] arr5 = new int[] {100,99,1005,2000}; 
    //arr5[4] = 2000; 
    

    // if we "new" the arr5 again , they are different arr5 ( i.e. they are of different memory). 
    arr5 = new int[] { 5,1,2,3,4} ; 

    System.out.println("before : index 1 :" + arr5[1] + " index 3 :"+ arr5[3] );
    /// to swap  index 1 and 3 's element
    
    int tmp = 0 ; 
    for ( int i = 0 ; i < arr5.length ; i++){
      if ( i ==1){
        tmp = arr5[i];
        arr5[i] = arr5[3];
        arr5[3] = tmp ;

      }
    }
    System.out.println("after : index 1 :"+ arr5[1] + " index 3 :"+ arr5[3]);
    // if you when to pritn all element in arr  Arrays.toString()
    System.out.println(Arrays.toString(arr5));

    //arr5 : Swap min and max values
    // 1st find the min of the array 
    int min = 99999; 
    
    for ( int i =0 ; i < arr5.length; i++){
     // for (int j = i ; j > i ; j)
      if (arr5[i]< min){
        min = arr5[i];
      }
    

    }
    // 2nd find the max

    int max =-999 ;
    
    for ( int i =0 ; i < arr5.length; i++){
     // for (int j = i ; j > i ; j)
      if (arr5[i]> max){
        max = arr5[i];
      }
    }
      // 3rd swap the value 
    int minloc = 0 ; 
    int maxloc = 0 ;
    for ( int i = 0 ; i < arr5.length ; i++){

      if (arr5[i]== min){
        minloc = i;
          
      }

      if (arr5[i]==max){
        maxloc = i;

      }
      
      

    }

//swap  TBC done 
  //  for ( int i = 0 ; i < arr5.length;i++){
  //    if ( arr5[i]==minloc){
   //     arr5[i]=max ;
   //   }
   //   if ( arr5[i]==maxloc){
   //     arr5[i]= min;

   //   }
   // }
    // print

  //  System.out.println(" after swap : "+ Arrays.toString(arr5));



    // move max value to the tail of the array 
    int [] arr6 = new int[] { 5,1,3,2,410, 13,22,16};
    int maxInt = -1000;
    int maxLoc = -1 ; 
    int swaptmp = 0 ;
    for ( int i = 0 ; i < arr6.length; i++){

      if (arr6[i] > maxInt){
        maxInt = arr6[i] ;
        maxLoc  = i ;  

      }
    System.out.println("max index is :"+ maxLoc);
    
    }
    
    for ( int i = 0 ; i < arr6.length; i++){

      if ( i >maxLoc){
        swaptmp = arr6[i];
        arr6[i]= arr6[maxLoc];
        arr6[i-1]=swaptmp;
        maxLoc +=1;
      }

    }
    // print
    System.out.println("the result is :"+ Arrays.toString(arr6));


    // reverse the string 
    String str = "Ahello"; 
    // make a char Arra 
    char[] charac = str.toCharArray(); 
    char ctmp = ' ' ; 
    int loc = 0 ; 
    // swap by for  loop;
    //System.out.println("lengtht "+ charac.length);
    System.out.println(" before :" + Arrays.toString(charac));
    for ( int i = 0 ; i < charac.length/2 ; i++){
      ctmp = charac[i];
      charac[i] = charac[ charac.length-1-i]; 
      charac[ charac.length-1-i] = ctmp; 
    
    }
    // convert back to a String 
    String.valueOf(charac) ;
    System.out.println("rrrr " +String.valueOf(charac));
    System.out.println("After :"+ Arrays.toString(charac));


  }
    


  
  }


