public class App {
    public static void main(String[] args) throws Exception {
        int [] arr = new int[] { 1,2,3,4,5} ; 


        // print each element 
        for ( int i = 0 ; i < arr.length ; i++){


                System.out.println(arr[i]);

        }

        // for ( int i = 0 ; i < arr.length ; i ++)  i is the counter ; num is the element in the array arr 
        for ( int num : arr){ // this is called for-each if the index of array is not useful to you. for each loop is much better than for counter loop. 
            System.out.println(num);

        }

        // for each , String []

        String [] sarr = new String[] { "i am go to school by bus", "i am go school by train"} ; 

        for ( String str : sarr){
            System.out.println(str) ; 
        };

        int count = 0  ; 
        // do-while loop  , it will to the componenet in do part first then check condition 
        do{
            System.out.println( "count =" + count);
            

        } while(++count < 5) ;//it means count will add 1 first , then it will compare  with  5  . 
        // break 
        // 1- 10 , odd number and > 6 

        int xx = 10;
        while (xx > 6 ){


            if ( xx% 2 == 1  ){
                System.out.println(xx);
            }
            xx--;


        }

        
        
       
}
}