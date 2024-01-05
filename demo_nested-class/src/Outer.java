public class Outer{


  private String name ; 

  private static int value = -20 ; 


  public static class NestedClass{ // the nested class name 

      private String name2 ; 

        public NestedClass(String name ){
          this.name2 = name ; 
        }

        public void display(){
          // System.out.println(this.name2 + " " + this.name1); // this method can't callled this.name1 
          System.out.println(this.name2); // it nested class we can't get the data member of outer class . concept of scope 
          System.out.println(this.name2 + " " + Outer.value); 
        }

  }


  public class InnerClass{ // example of inner class not static class
    
    private String name3; 
    
    public InnerClass(String name ){
      this.name3 = name ;
    }

    public void display(){
      System.out.println("Outer name1="+ name); // we can refer to the name variable of the Outer class
    }

  }

  public Outer (String name){
    this.name = name ; 
  }


}