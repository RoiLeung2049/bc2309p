package animal;

import java.util.Objects;

public class SmallBird extends Bird{

  public SmallBird(String Name){
    super(Name);


  }

  @Override
  public boolean equals(Object object) { // b1.equals(b2) => true
    if( this == object)
      return true; // if "this"  is equal to "object" , then they should be the same // it is because they are referrign the same memory allocation. 
    if(!(object instanceof Bird)){// filter out the case for non-Bird
      return false ;
    }
    Bird bird = (Bird) object ; // this downcast is protected by line 15. it is because i have kick out the obj which is not of type Bird
    return bird.getName().equals(this.getName());
// alternatively, return Objects.equals(bird.getName(), this.name); 


  }

  @Override
  public int hashCode(){
    return Objects.hash(this.getName());
  } 

  public static void main(String[] args) {
    SmallBird b1 = new SmallBird("Teacher") ;
    SmallBird b2 = new SmallBird("Teacher!") ;
    System.out.println(b1.toString());// Teacher 
    System.out.println(b1.equals(b2)) ; 
    System.out.println(b1.hashCode()); //1746572565
    System.out.println(b2.hashCode());//989110044; 
    // different reference different hashcode . 

  }
  
}
