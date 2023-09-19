public class App {
    public static void main(String[] args) throws Exception {
        
        for ( int i = 0 ; i < 5 ; i++) {

            System.out.println(i);

        }

        // by using while loop 

        int j = 0 ;
        // sum 1- 10
        int sum = 0 ; 
        while( j < 11) {


             sum += j ;


              j++ ;  


        }

        System.out.println( " the sum is : "+ sum);
        //  sum : even 1 - 10 

        int x = 0 ;
        int sumx = 0 ; 

        while (x < 10){


            if ( x % 2 == 0){

                sumx += x ;
            }
            x++ ;  // same as while ( ++x < 10) 
        }
        System.out.println(sumx);

    }
}
