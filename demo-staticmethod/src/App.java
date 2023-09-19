public class App {
    public static void main(String[] args)  { // this part is actually a static method that is called by JVM called main . 
        int x =2 ; 

        int result = add(10 , x);
        System.out.println(result) ; 
        int min = 5 ;
        int max = 8;
        int tmp =  sum(5,8);
        System.out.println(tmp);
        int tmpp =sums(5, 8) ; 
        System.out.println(tmpp);
    }

    // 1st int -> the return type of the method 
    // add -> methood name 
    // ( int x , int y ) -> parameters 
    // add(int x , int y) -> method  signature : name + parameters
    public static int add(int x , int y){// x = 2 , y  = 3 

        int result = x+ y ; 
        return result ; 
    }


    public static int sum( int min , int max){
        int tmp = 0 ; 
        

        for ( int i = min ; i < max+1 ; i ++){
            tmp = tmp + i;
        }
        return tmp ; 
    }
    
    
    public static short sums( int min , int max){
        int tmp = 0 ; 
        
        for ( int i = min ; i < max+1 ; i ++){
            tmp = tmp + i;
        }
        return (short)tmp ; 
}
}