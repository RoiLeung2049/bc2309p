public class Student {


  private String name ;
  private int age ; 
  private char gender ; 


// make a PRIVATE constructor  ( all argument constructor)
  private Student (String name ,int age, char gender){
    this.name = name ;
    this.age = age ;
    this.gender = gender;
  }


  public static class Builder{
    private String name ;
    private int age ; 
    private char gender ; 

    public Builder name(String name ){
        this.name = name ;
        return this;
    }

    
    public Builder age(int age ){
        this.age = age ;
        return this;
    }

    public Builder gender(char gender ){
        this.gender = gender ;
        return this;
    }

    public Student build(){
      return new Student(this.name,this.age,this.gender);
    }


  }

  public static Student.Builder builder(){// return builder obj
      return  new Student.Builder(); 
  }
  public static void main(String[] args) {
    // recall no define constrcutor then we have empty constructor!!
    Student student = new Student.Builder()  //Student.Builder is the call of Nested Call 
                      .name("John")
                      .age(19)
                      .gender('M')
                      .build();

    // alternarively , no loops so constant time 
    Student student2 = Student.builder()
                       .name("John")
                       .age(19)
                      .gender('M')
                      .build(); 
  }



  
}
