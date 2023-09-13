public class TestNestedLoop {


  public static void main ( String [] args){

      for ( int i = 0 ; i < 5; i++){
      //  System.out.println( " the i now is :"+ i);
        for ( int j = 0 ; j < 5; j++){
          System.out.println(" i now is :"+ i +". " + "the j now is :"+ j);
          // when i = 0 ;
          // Enter Another Loop ( J counter );
          // i = 0 , j = 0 , print i -> 0 ; 
          // j++ 
          // i = 0 ; j = 1 , print  i ->0
          // j++ 
          // i = 0 ; j = 2 , print i -> 0 


        }

      //  i => 1 - 10 
      // j => 11-20
      // print even numberfor i  and j
      }
        for  ( int k= 1; k<11 ; k++){

          for ( int l = 11 ; l < 20 ;  l++){

              if ((k%2== 0 )&& (l%2 ==0)){
                if ( l< 15){
                  System.out.println("k="+ k + " , " + "l="+ l);

                }
                  

              }

          }
        }
      }

  }
  

