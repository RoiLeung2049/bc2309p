
public interface MathOpertion {

    int operate(int x , int y);


    public static void main(String[] args) {
        MathOpertion addition = (x , y )-> { // addition is an MathOperation object.  this syntax is to define the implementation of abstract method operate
          return x+ y ;
        }; 
        System.out.println(addition.operate(3, 5));
    }
} 

