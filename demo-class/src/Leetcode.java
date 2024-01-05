public class Leetcode {

  public static void main(String[] args){

      String s ; // the input string 
  s= "world2 hello1" ;
  // split the strign into a sequnce of wods by .Split()
  // collect them by a String Array 
  String[] tmpArray = s.split(" "); 
  // get the last value in word  by substring
    int[] iArray = new int[tmpArray.length] ; 
  for (int i = 0 ;i < tmpArray.length; i++){
    String tmpStr = tmpArray[i].substring(tmpArray[i].length()-1);
    iArray[i] = Integer.valueOf(tmpStr);
    //System.out.println(iArray[i]);


  }
  
  // do the bubble sort with the string array 
  int tmp = 0 ; 
  String tmps = "" ; 
  for ( int i = 0 ; i < iArray.length; i++){

    for ( int j=1 ; j < iArray.length-i  ; j++  ){

      if ( iArray[j-1]> iArray[j]){
        tmp = iArray[j-1];
        tmps = tmpArray[j-1];
        iArray[j-1]=iArray[j];
        tmpArray[j-1]=tmpArray[j];
        iArray[j]  = tmp ; 
        tmpArray[j]= tmps;
      }
    }
  }
    String result = "";
   for (String str : tmpArray){
    result = result + " " + str ; 

    // return the final string 

     }
     System.out.println(result);
  }


}
