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

            Integer i16  = 8 ; // in memory ,  new Integer (8) ;  new an object in the heap . 
            Integer i17 = new Integer(8); // 38 and 39 are the same . 

            System.out.println(i16.equals(i17));
            System.out.println(i16 ==8); // comparing Integer and int , Integer will be temp unbox for comparing with 8 
            // String method 
            System.out.println(i16.compareTo(8)); //return 0 ; 
            System.out.println(i16.compareTo(9)); //return -1; 



            /// 
            //review of primitive data type 
            byte ss1 = 3 ;
            
            short sss1 = 13; 
            sss1 = ss1; // upcast the byte into shoer 

            int sss2 =3; 
            sss2 = ss1 ;

            float f1 = 13.0f ; // 13.0 is a double  double can't be assign to float so need casting 
            double d1 = f1; 
            double d2 = 4; 

            int w = 123 ; //  a variable  w has a reference of an integer obj which it is pointing to the  integer obj has value 5 in heap , variable is stay at stack . 

            int ttt1 = 67 ; 
            short ss2 = (short) ttt1 ;
            d1 = ss2 ; 
            



    }
}
