import java.util.Arrays; 

public class Demo2DArray {
    public static void main(String[] args) {
      int[] Objref = new int[3]; 
      int[] Objref2 = new int[] { 2,3,4,5} ;
      


      // declare 2d array
      int [] [] twoDArr = new int[3][3];
      int [] [] twoDArry = new int[] [] {{1,2,3},{4,5,6},{11,13,17}};


      int tmp = 1;
      // for counting the row 
      for ( int i = 0 ; i < twoDArr.length;i++){
        for ( int j = 0 ; j <twoDArr[0].length; j++){
           twoDArr[i][j] = tmp;
           tmp= tmp +2; 
        }
      
        // assign 1,3,5,7,9..  to array  3x3 
        // 1 ,3, 5   0,0 => 1 , 0 ,1 = 3 , 0 2 = 5   
        // 7 , 9 ,11,  1  => 1, 0 => 7 , 1,1 => 9    (i+1)*3 + 1
        // 13, 15, 17  2

      }
      for ( int[] s : twoDArr){
        for (int ss : s ){
 //         System.out.println(" this output of looping the matrix is :" +ss);
        }
      }


      //printIntTeoDArray(twoDArry);
   //   printIntTwoDArray(Objref2);// looping 1 d array 
   //   printIntTwoDArray(twoDArry); // looping 2 D array 


    // assign 2,4,6,8,10 .. to another array 
    int [][] evenTwoDArray = new int[3][3];
    int ttmp = 2 ;
      // for counting the row 
      for ( int i = 0 ; i < evenTwoDArray.length;i++){
        for ( int j = 0 ; j <evenTwoDArray[0].length; j++){
           evenTwoDArray[i][j] = ttmp;
           ttmp= ttmp +2; 
        }

    }
   // System.out.println(Arrays.toString(evenTwoDArray));
  // printIntTwoDArray(evenTwoDArray);
  
    for (int[] s: evenTwoDArray){
      System.out.println(Arrays.toString(s));
    }
   // Arrays.toString(evenTwoDArray);
  //   printIntTwoDArray(evenTwoDArray);
      System.out.println("NEXT");
    System.out.println(Arrays.toString(additionAcrossColumn(evenTwoDArray)) );



    char[][] arr9 = new char[][]{{'h','e','l','l','o'},{'J','o','h','n'}};
    String[] str =  convertChToStr(arr9);
    System.out.println(str[0] + " " + str[1]);

 //   printIntToDArray(twoDArrayProduct(twoDArr, evenTwoDArray));
    // arr2d even2d (3 x 3 ) 
    // convert to an 1 D array by addition across column   
     // end of main 

  }
    public static void  printIntToDArray( int[][] arrayA){
       for ( int i = 0 ; i < arrayA.length ; i++){
        for( int j = 0 ; j< arrayA[0].length; j++){
          System.out.println("printing static method output "+ arrayA[i][j]);
        }
       }
    }


    public static void printIntTwoDArray(Object obj){
        if( obj instanceof int[]){
          int[] intArray = (int[]) obj;
          for ( int i = 0 ; i < intArray.length ; i++){
        
            System.out.println("looping 1 D array  "+ intArray[i]);
          
            }
        }else if ( obj instanceof int[][]){
           int[][] intTwoDArray = (int[][]) obj ; 
           for ( int i = 0 ; i < intTwoDArray.length ; i++){
        for( int j = 0 ; j< intTwoDArray[0].length; j++){
          System.out.println("looping 2 D array "+ intTwoDArray[i][j]);
        }
       }
        }
    }

    public static int[][] twoDArrayProduct(int[][] A , int[][] B){
      // assum the 2 arrays are of same size

      int[][] C = new int[A.length][A[0].length];
      for( int i = 0 ; i < A.length; i++){
        for( int j = 0 ; j < A[0].length;j++){
          C[i][j] = A[i][j] * B[i][j];
        }
        
      }
      return C ; 
    }

    public static int[] additionAcrossColumn(int[][]A){
        int[] output = new int[A[0].length];

        for (int i=0 ; i < A[0].length; i++){
          for ( int j =0; j < A.length; j++){
            output[i] += A[j][i];
          }
        }
        return output ;

    }

    public static String[] convertChToStr(char[][] C){
      String[] str = new String[C.length] ;
      for (int i = 0 ; i < C.length;i++){
          str[i] = "";
        for (int j = 0 ; j < C[i].length;j++){
              
              str[i] = str[i] + C[i][j]+"" ;
          
            
        }
      }
      return str ; 
    }

      
}
