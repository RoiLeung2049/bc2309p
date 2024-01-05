public class Company {


  private String name ;


    // static metho dcan call static class , this can encapulate the nested class 
    public static Employee createEmployee(String emplyeeName  , int employeeId){
      return new Employee(emplyeeName,employeeId);
    }


    // public static method 

  public static class Employee {

    private String employeeName ;

    private int employeeId ; 

    public Employee(String employeeName, int employeeId){
      this.employeeId = employeeId;
      this.employeeName = employeeName ; 
    }


    public void into(){
      System.out.println("Empoyee Name :"+ this.employeeName);
      System.out.println("Employee Id"+ this.employeeId);
      // under this decide , the employee is not related to the company instancitated 
    }

  }
  


  public static void main(String[] args) {

  }
}
