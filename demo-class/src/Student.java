public class Student extends Persons{// public methods are all inhertiance only .  private of paraent clas can't be inheritance => sution super 
// static variable of parent has alos been inheritnace as well. 
// for public variable in PArent class , this will be inherit immediately. 
  private String studentID; 

  public String getstudentID(){
    return this.studentID;
  }

  public void setStudentID(){
    this.studentID = "1234" ; 
  }

  //All-args constructor

  public Student(String s) {
    super(); // calling parent class (empty) constructor , default called empty consturctor of parent class within without super() 
    
    this.studentID = s; 

  }
  // better solution 
  public Student(String name , int age , String studentID){
    super(name,age);// should be the first line of code **** 
    this.studentID = studentID;
    
  }

  @Override
  public String toString(){
    return "name="+ this.getname() + ", age=" + this.getAge();
  }
  public static void main(String[] args) {
    Student student = new Student("456") ; 
    student.setAge(20);
    student.setName("Peter");
    //Persons cana be initiatlizer 
    Persons person = new Persons() ; 


    Student student2 = new Student("john",13,"1234");
    System.out.println(student2.getAge());
    System.out.println(student2.getname());
    System.out.println(student2.getstudentID());
    System.out.println(Student.x);
    System.out.println(student2.s);

  }

  
}
