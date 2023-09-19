/**
 * Expected output:
 * 1 1 2 3 5 8 13 21 ...
 * 
 */
public class JavaQuest6 {
  public static void main(String[] args) {
    // for loop to print first 15 numbers in Fibonacci Sequence
    
    // to make a for loop to loop 15 times for printing the valur of sequence , defin a count , times 
    int times = 15 ; 

    // for sequence 1 1 2 3 5 8 13 21 , there is a mapping between index with the sequene 
    // 0 -> 1 ,
    // 1 -> 1 ,
    // 2 -> 2  = 1 + 1 
    // 3 -> 3 = 2 + 1
    // 4 -> 5 = 3 + 2 
    //....
    // 15 -> 21 = 13 + 8 
    
    // so the value of the sequnce need the value created in previous 2 iteration.
    // for i >= 2 , value at i = value i -1 + value  i -2 
    // we need a inteer array to storage the value over the for loop 

    int [] fArray = new int[times];
    //int fLen = fArray.length; 
   // System.out.println(fLen) ; // 15
   // assign the 1st 2 values to fArray 
   fArray[0] = 1 ;
   fArray[1] = 1 ;
   
   // make a for loop to assign the value to fArray and print the value 
   // at ith iteration , i = 0 , 1, just print the value of fArray
   // at ith iteration , i >=2   to 15 , do the calculation ( i.e. fArray [ i] = fArray [i-1] + fArray[i-2])
   // then print the value of fArray [i]

   for ( int i = 0 ; i < times ; i++){

     if ( i >=2){
        // calculation first 
        fArray[i] = fArray[i-1]+ fArray[i-2];
        // print the result of fArray[i]
        System.out.println(fArray[i]);
     } else {
        // for case i = 0 ,1 ; just print the value fArray[i] 
       System.out.println(fArray[i]);
     }
   }

  }
}