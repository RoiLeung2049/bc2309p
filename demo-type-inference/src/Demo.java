import java.util.List;
public class Demo {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //String 
        String s = "Hello" ; 
        // s is an obj reference , a point in stack storing the reference address 
        //"String" is reference type , the method range 
        // "hello" is a string object  in heap 

        // var 
        // During the compiler time : "var" -> "String" , at compiler : it has checked type 
        var s2 = "hello"; 
        //s2 =10 ; // it is because String type 
        // we cannot re-assign the int value to s2 , because s2 in String tupe during compile time  

        List<String> strings = List.of("abc","cba");


        for(var str : strings){
            System.out.println(str.charAt(1));
        }



    }

//var cannot be used in input paramter type an  output parameter type  , but you can call method  and return type to be var type . 
//it is because there is no define of type  on RHS 
    public static int add ( int x , int y ){
        return x+ y ;
    }

    public static double add(double x, double y){
        return x + y ; 
    }
}
