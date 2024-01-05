
public class App {


    // test generic programming 

    public static <T extends Number ,Y extends Number> double  addNum(T a, Y b){
        
        // if T is double , Y is not double 
        // convert into double type 

        if( a instanceof Double){
            
        }
        //System.out.println("the result is " + ) ; 
        return 0;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

       addNum(1.0,2.5);
    }
}
