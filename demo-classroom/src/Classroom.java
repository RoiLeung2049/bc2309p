public class Classroom {

  // classroom has Students 
  private Student[] students;
  private Teacher[] teachers;
  // classroom has room 
  //private Room room ; 
    // room has tables and chairs. 
  private Table[] tables ; 
  private Chair[] chairs; 
    
  
  public Classroom(){

  }

  public Classroom(int numOfStudents, int numOfTables, int numOfChairs, int numOfTeacher){
    this.students = new Student[numOfStudents];
    this.tables = new Table[numOfTables];
    this.chairs = new Chair[numOfChairs];
    this.teachers = new Teacher[numOfTeacher]; 

  }

  public void setStudent(Student st){

      this.students[this.getNumOfStudents()] = st ; 
    }
    
    public void setTable(Table t){

      this.tables[this.getNumOfTables()] = t ; 
    }
    
    public void setChairs(Chair c){

      this.chairs[this.getNumOfChairs()] = c ; 
    }

    public void setTeachers(Teacher tr){

      this.teachers[this.getNumOfTeachers()] = tr ; 
    }

  public int getNumOfStudents(){
    int tmp = 0 ; 
    for (Student s : this.students){
      if(s!=null){
        tmp++;
      }

    }
    return tmp ; 
  }

  

   public int getNumOfTables(){
    int tmp = 0 ; 
    for (Table t : this.tables){
      if(t!=null){
        tmp++;
      }

    }
    return tmp ; 
  }

  public int getNumOfChairs(){
    int tmp = 0 ; 
    for (Chair c : this.chairs){
      if(c!=null){
        tmp++;
      }

    }
    return tmp ; 
  }


  public int getNumOfTeachers(){
      int tmp = 0 ; 
      for (Teacher tr : this.teachers){
        if(tr!=null){
         tmp++;
        }
      }
      return tmp ; 
    }
}