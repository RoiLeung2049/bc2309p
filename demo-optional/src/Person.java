import java.util.Optional;

public class Person {


  private String name ; 

   private Optional<String> emailAddress ; // NOT OK, wrong design 
//it is because ,for attribute  in class, it is possible that it can be null. 
// so we don't need to have Optional type .  otherwise , you will return the Optional type , and the user need to have further handling. 

// 如果要GET DATA FROM DATABASE , no requested data return is natural, it is to be handled by null value . 
// Optional<T> should NOT be used in type  of attribute 
//  1. CAll API , this calss may be used for deserialization , then Optional<T> may have some problems. 
// 2. Interact with Database, deserialization for the OPtnial field  has issue

  

public Optional <String> getEmailAddress(){
  // NOT OK
  return this.emailAddress ;
}
}
