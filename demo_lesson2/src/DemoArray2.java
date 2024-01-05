import java.util.Arrays;

public class DemoArray2 {
    public static void main(String[] args){
      int[] arr = new int[] {10,4,2,100,-3}; 
     // System.out.println(getMaxLoc(arr));
      // [-3,2,4,10,100]
      //1st step fin the max , put it into the right 
//     int tmp  = 0 ;
//      int idx = -1;
//      int max = -999;  
//      for (int i = arr.length-1; i >1 ; i--){
//        max = -999 ;
 //       for (int  j = i ; j >= 0 ; j--){
 //         if ( max < arr[j]){
//            max = arr[j];
//            idx = j ;
//          }
//        }
        // do the swap 
//        if (i != idx){
//            tmp = arr[idx];
 //           arr[idx]= arr[i];
 //           arr[i]= tmp ; 

          System.out.println(Arrays.toString(bubbleSort(arr)));
        }

//      }
      

      

      
    

    public static int[] bubbleSort (int[] arr){
         int tmp  = 0 ;
      int idx = -1;
      int max = -999;  
      for (int i = arr.length-1; i >1 ; i--){
        max = -999 ;
        for (int  j = i ; j >= 0 ; j--){
          if ( max < arr[j]){
            max = arr[j];
            idx = j ;
          }
        }
        // do the swap 
        if (i != idx){
            tmp = arr[idx];
            arr[idx]= arr[i];
            arr[i]= tmp ; 
        }

      }
     // System.out.println(arr.toString());
      return arr ;       
    }
    // get getMaxLoc within a given range of an array 
    public static int getMaxLoc( int[] tArray, int last){
      int tmp = tArray.length; 


      int idx=0;
      for ( int j = last; j >1 ;j --){
        int max = -999 ; 
        for ( int i = j ; i >=0 ; i--){
           if ( max < tArray[j]){
            max = tArray[j];
            idx = j ;
          }
        }
        
      }
      return idx; 
    }
    public static int getMaxLoc (int[] tArray){
      int macloc = 0;
      int tmp = -999;
      for (int i:tArray){
        
        if (tmp < i){
          tmp = i;
         
        }
      }
     /// System.out.println(tmp);
      for (int j = 0 ; j < tArray.length;j++){
        if (tmp ==tArray[j]){
       ///   System.out.print(j);
          macloc = j;
          break;
        }
      }
      return macloc;
    }
    public static void swap(int[] tArray, int i , int j){
        int tmp = 0 ;
        tmp = tArray[i];
        tArray[i]= tArray[j];
        tArray[j] = tmp ; 
        
    }

    // get length of array 
    public static int getLength(int[] arr){
      return arr.length;
    }
}
