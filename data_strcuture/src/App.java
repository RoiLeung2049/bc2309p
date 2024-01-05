public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

            // using it to test primitive data type 
    // byte , boolean , char, short , integer , long , double , float
    // a small data type to a large data type -> upcasting 
    byte b = 125; 
   // short s  = 32767;

    //b = (byte)s ;
   //  int r = 4 ; 
   // double d =  30 ; 
   // long dd = 30  ; 

   // float ss = 6 ;
   // ss = dd;
    String s = "Hello world";
    char seek ='h';
    int location = s.indexOf(seek); //10
        System.out.println(location);

            String dd = "fff";
    boolean sB = s.contains(dd);


        String ss = "World";
    location = s.indexOf(ss);
    System.out.println(location);
        Integer t = Integer.valueOf(22);
    
        Integer t2 = Integer.valueOf(3)    ;

        System.out.println(t2.compareTo(t));
        String d = "SSS";
        char[] p = d.toCharArray() ; 
       
        
        double f = Math.random()* 5;
        System.out.println(f) ; 
    }



}
