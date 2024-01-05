public class Teacher extends Persons{

  public static void main(String[] args) {
    Teacher t= new Teacher();
    t.setAge(20);
    t.setName("Teacher");

    System.out.println(t);

    System.out.println(t.getAge());
    System.out.println(t.getname());
  }
  
}
