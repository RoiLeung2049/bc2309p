public class App {
    public static void main(String[] args) throws Exception {
        int input = 996966;
        System.out.println(" the input value is :" + input);
        System.out.println(" the result is :  " + maximum69Number(input)); 
    }
    public static int maximum69Number(int num){

        // get the number of digital of the input num 
        String tmp = String.valueOf(num) ; 
        int digit = tmp.length();
        // convert the String into char Array
        char [] Carray = tmp.toCharArray();
        String [] Storage = new String [digit +1] ; 
        Storage[0] = tmp ;
        for (int i = 0 ; i < digit;  i++){        // loop over each digit. 
            Carray[i] = interchange(Carray[i]); // perform interchange  over that digit
            // get the new string 
            String tmpStr = String.valueOf(Carray) ;
            //System.out.println(tmpStr);
            // store the string into Storage 
            Storage[i+1] = tmpStr  ; 
            // reset the string 
            Carray = null;// release the memory of Carray 
            Carray = tmp.toCharArray(); // reset the char array  for next loop 
            System.out.println(Storage[i+1]);          
        }
        int[] FinalArray = new int[digit +1] ; 

        for ( int i = 0 ; i < Storage.length ; i++){ // convert the String array back into integer
            FinalArray[i]= Integer.valueOf(Storage[i]);
        }
                // get the max value within a array 
         int finalresult = 0 ; 
         finalresult = arrayMax(FinalArray);
         return finalresult; 
    }
    public static char interchange( char c){
            if (c == '6') {
                 return   '9';
            }else {
                return '6';
            }                   
    }
    public static int arrayMax ( int[] a){  
        int max = -999 ; 

        for (int i : a){

            if (i > max){
                max = i ;
            }
        }
        return max;
    }
}
