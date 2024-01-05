import java.util.ArrayList;

public class School {// 1 to many examples



  private ArrayList<Student> students;
  

  public ArrayList<Student> getStudents(){
    return this.students;
  }

  public School(){
    this.students = new ArrayList<>();
  }

  public boolean addStudent(Student student){
    return this.students.add(student);
  }

  @Override
  public String toString(){

  //  for (Student s : this.students){
  //    return " student "+ s + " in School" ;
  //  }
  //  return "";
  return this.students.toString();
  }
  public static void main(String[] args){
    School school = new School();
    school.addStudent(new Student(15, "Mary"));
    school.addStudent(new Student(15, "Ben"));
    System.out.println(school.toString());
  }
  
}
