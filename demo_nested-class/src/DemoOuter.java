public class DemoOuter {




  public static void main(String[] args) {
    Outer outer = new Outer("ABC");
   Outer.NestedClass nestedClass = new Outer.NestedClass("ABC"); // instance nested  class obj 
   nestedClass.display();
    Company.Employee employee = new Company.Employee("Apple", 123); 
    Employee employee2 = new Employee() ; 

    Company.Employee employee3 = Company.createEmployee("Jogn", 345);


   // Outer outer = new Outer("ABC");
    Outer.InnerClass inner = new Outer("ADEF").new InnerClass("IJK"); // obj Outer("ADEF") has been instanced by we have no obj reference to contain the obj refer to it
    // Outer("ADEF") and  Outer.InnerClass("IJK") are two independent obj. they are not related. 


    inner.display();



    Library library1 = new Library("ABC");
    Library.Book lBook =  library1.valueOf("123");
    System.out.println(lBook.info());





  }
  



}
