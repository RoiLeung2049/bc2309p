import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Box<T,U> {

  private T data ; 
  private U value;

  public T getData(){
    return this.data ;
  } 

  public void setData(T d){
    this.data = d ; 
  }

  public Box(){

  }
  public Box(T x, U u){
    this.data = x ;
    this.value = u ;  
  }

  public static <T,U> Box<T, U> createBox(T data , U value){
      Box<T,U> box1  = new Box<T,U>(data, value);
      return box1 ; 
  }
 
  
  public static void main(String[] args) {
    Box<int[],String> strbox = new Box<>(new int[] {10, -100, -4},"World"); // data is an array
    Box<String,String> box2 = new Box<>("Hello", "World"); 
    Box<List<String>,Map<String,String>> box3 = new Box<>(List.of("abc","def"),new HashMap<>()); 

    Box<String,Integer> box4 = Box.createBox("Hello", 6);

    
  }
}
