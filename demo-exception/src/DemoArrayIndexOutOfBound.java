public class DemoArrayIndexOutOfBound {





  public static void main(String[] args) {
    arrayIndexOutofBound(new int[10]); //ArrayIndexOfBoundsException
  }
  


  public static void arrayIndexOutofBound(int[] arr){
    arr[arr.length] = 1 ;  /// the error
    // you should fix the program directly 
    //instead of using try catch to hanlde various scenario
  }
}
