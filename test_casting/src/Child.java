import java.util.Objects;

public class Child extends Father{

  public String Name = "Son"; 

  @Override
  public String toString(){
    return "My Name is " + this.Name + " " + super.Name ;
  }
  
  // Cons
  public Child(){

  }

  public Child(String Name){
    this.Name = Name ;  
  }

  // equals() 

  @Override   
  public boolean equals(Object obj){

    if (this == obj){
      return true ; 
    }else if ( obj instanceof Child){
      Child child = (Child) obj ; 
      return  this.Name ==  child.Name ? true : false ;
    }
    return false ; 
  }

  @Override 
  public int hashCode(){
    return Objects.hashCode(this.Name);
  }

  public static void main(String[] args) {
    Child C = new Child("Peter");
    System.out.println(C.Name); // Peter F 

    // downcast 
    System.out.println(((Father)C).Name); // F 


    // consider the opposite

   // Father F = new Father();
   // System.out.println(F.Name); // F 
   // System.out.println(((Child)F).Name );

    Child D = new Child("Peter"); 
    System.out.println(C.equals(D));
    System.out.println(C.hashCode()==D.hashCode()); 
  }
}
