public class DemoArrayLoop {

  public static void main ( String [] args){

      int[] nums = new int[4];

      nums[0] = 100; 
      nums[1] = 109;
      nums[2] = 1000 ; 
      nums[3] = 1005; 
    // use nums.length -> 4
      for ( int i = 0 ; i < nums.length ; i++){

          System.out.println(nums[i]);

      }


      // sum  of the array 

    int tmp = 0 ;
    for (int i = 0 ; i < nums.length ; i++){
        tmp = tmp + nums[i];

    }
    System.out.println(" the sum is :" + tmp);
    // fidn the max value in th array 

    int max = -1; 
    

    for (int i = 0 ; i < nums.length;i++){
    
      max = nums[i];

      for ( int j = 0 ; j < nums.length ; j++){
          if (max < nums[j]) {
              max = nums[j];


          }

      }
      
    }
    System.out.println("the max value is :" + max);



    /// fidn the min calue in the array 

    int min = 99999; 

    for (int i = 0 ; i < nums.length ; i++) {

      if (nums[i]< min){
        min = nums[i];

      }

    }
    System.out.println(" the min value is :" + min);

    // find the average of all the values in the array 
    double avg = 0 ; 
    double leng = nums.length; 
    
    for  (int i = 0 ; i < nums.length ; i++){

        avg += nums[i];

    }

    avg = avg / leng ; 
    System.out.println(" the average value of the array is :" + avg);


    // Print the odd numbers in the array, from the tail  of array

    for (int i = (nums.length-1); i >= 0 ; i--){

      if ( nums[i]%2 != 0 ){
        System.out.println(" the odd number at array location " + i+ " is :" +nums[i]);
      }


    }
    // find the index of the taget 
    int[] integers = new int[] {100,3,10,5,-100};
    int target= 10 ;
    int tmptmp = 0; 
   outloop: for ( int i = 0 ; i < integers.length; i++){
      if ( integers[i]==target){
          tmptmp = i ; 
          break outloop;
      }


    }
          System.out.println(" the location of 10 is :"+ tmptmp) ;

    //str.toCharArray()


    String str = " hello world" ;
    char[] characters  = str.toCharArray();
    str = "";
    for ( int i = 0 ; i<characters.length; i++){
   
    //  System.out.println(characters[i]);
    if ( characters[i]== 'o'){
      characters[i] = 'z' ; 
    }
    str = str + characters[i];
    //Alternatively convert the Char into a String  : String.valueOf(characters)
    System.out.println("Alternatively");
    String SS = String.valueOf(characters) ;
    System.out.println(String.valueOf(characters)); 
    System.out.println(String.valueOf(SS)); 
    

  
    

    }
      System.out.println(str);

    // when you find 'o', replace it by 'z' then print the string 
    
    

  } 
  
}
