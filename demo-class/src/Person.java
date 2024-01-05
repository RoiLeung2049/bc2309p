public class Person {
    
  int age;
  char gender ;  // 'M' or 'F'
  String firstName ;
  String lastName ; 
  // this above is called state varaible ; 


  public static String getName(Person P){
    return P.firstName + " " +P.lastName;
  }
  public boolean isElderly(){
    if (this.age > 65 )
      return true ;
    return false ; 
  }
  public void setfName(String a){
    this.firstName = a ;
  }

  public void setlName(String b){
    this.lastName = b ;
  }
  public String getfName(){
    return this.firstName;
  }

  public String getlName(){
    return this.lastName;
  }

  public static void main(String[] args){
    // test undefult class
    Person P1 = new Person();
    System.out.println(P1.isElderly());//false
    String a= " John";
    String b = "SCB" ;

    P1.setfName(a);
    P1.setlName(b);

    System.out.println(P1.getfName());
    //
    System.out.println("the second obj is created");
    Person P2 =new Person() ;
    P2.setfName("Patrick");
    P2.setlName("Lo");

    System.out.println("afterinsit:" +P2.getfName());
    System.out.println("before assignement"+ (P1 ==P2));
    P2 = P1; 
    System.out.println(P2.getfName());// P2 is the obj that point to the same instance as P1 
    // now change the name of P1 
    P1.setfName("testFirstname");
    System.out.println("P1 new first Name "+ P1.getfName()); //testFirstName;

    System.out.println("print P2 now ");

    System.out.println("P2 nme is nor :"+ P2.getfName()); //testFirstname;
    System.out.println("before assignement"+ (P1 ==P2));

  }
}
