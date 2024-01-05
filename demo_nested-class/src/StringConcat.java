public class StringConcat {


  public static void main(String[] args) {
    //Approach 1
    Concat concat1 = ( a , b) -> a.concat(b);

    //Approach 2 
    Concat concat2 = (a ,b)-> {
      return a.concat(b);
    };

    
  }
  
}
