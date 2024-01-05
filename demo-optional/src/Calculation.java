import java.util.Optional;

public class Calculation {

  public static Integer add( Optional<Integer> x, Optional<Integer> y ){ // the input is a bad design
    if(x == null|| y == null)
      throw new IllegalArgumentException();
    int xValue = 0 ; 
    if(x.isPresent()) {
      xValue = x.get();
    }

        int yValue = 0 ; 
    if(y.isPresent()) {
      yValue = y.get();
    }

    return xValue + yValue ; 
  }
  

  public static void main(String[] args) {
    Integer i1 = null ; 
    Integer i2 = 2 ; 

    Integer result = add( Optional.ofNullable(i1), Optional.ofNullable(i2));
    Integer result2 = add(null , null); // result2 are the same as result . result is the trouble.  

    System.out.println(add(Optional.ofNullable(i1),Optional.ofNullable(i2))); // null + 2 -> 2
    System.out.println(add(null , null)); // throw IAE

  }

}
