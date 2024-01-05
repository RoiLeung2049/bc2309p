public class DemoStringIndexOutOfBound {
  

  public static void main(String[] args) {
    String s = "Hello"; //java.lang.StringIndexOutOfBoundsException
    charAt(s);
  }


  public static char charAt(String s){
    return s.charAt(s.length());

  }
}
