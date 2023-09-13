public class App {
    public static void main(String[] args) throws Exception {
       
            /// Premitiive : short ,int , byte, long ; floar , double ; bool ; char
            // String 

            // this  class : Wrapper Class - Byte, Short, Integer, Long , Float, Double, Character, Boolean
            // doulbe Double : father and son relation 
            // float doulbe : up grade 
            // float Double : no relation 
            

            short s1 = 10;
            int i1 = s1 ; // upcast 
            Integer i11 = i1; // auto-boxing  Wrapper calss have many strong methods than primitive type 
            int i2 = i11; // un-box 
            
            //Integer i12 = s1; // error , cannot direct short variable to Integer directly. 
            Integer i12  = (int) s1; // 1, short -> int ( by ( int) ) 2, int -> Integer 
            // short (cast ) -> int ( auto-box) -> Integer 
            boolean  b1 = true  ; 
            Boolean b11= b1 ; //auto-box 
            boolean b2 = b11 ;  

            char c1 = 'u' ; 
            Character c11 = c1 ; //autobox 

            Float f11 = 9.3f ; // autobox , 9.3f is a float value, the assignment has done auto box 
            Integer i13 = 100 ; // auto-box , it is beacuse 100 is a int value 
            Long l11 = 5L ; // auto-box , 5L is a long value 


            // Wrapper Class has null value
            // Primitives has default value , recall int -> 0 ; double -> 0.0 ; boolean -> false ; char -> '\u0000'
            // Wrapper class -> null value  
            Integer I15 = null;  // I15 is a null pointer .

            Integer t ; 
            System.out.println(t);


    }
}
