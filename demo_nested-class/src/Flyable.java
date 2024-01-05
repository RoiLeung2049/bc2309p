@FunctionalInterface // i.e. 1 interfaec has 1 function only ; for description only , not affect the complier 
// it is to be used for lambda expression , create 1-off class object 
public interface Flyable {

  void fly();
  




  public static void main(String[] args) {
    Flyable f = new Superman() ; // put child into parent obj, ok 

    Flyable f2 = new Flyable() {
      @Override
      public void fly(){
        System.out.println("I'm flying 2.") ; 
      }
    };
    //lambda
    Flyable f3 = () -> {
      System.out.println("I'm flying 3..");
    };

    Readable r1 = () ->{

    };

  }
}
