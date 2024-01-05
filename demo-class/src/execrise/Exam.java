
package execrise;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exam {

  //Access Modifier : public ,private, protected, package-pivate(default) 
  //public => class , attribute, method, constructor 
  //private => attribute , method, constructor 
  //protected => attribute, method ,constructor
  //package-private => class , attribute, method , constructor

  private Subject[] subjects ; 
  private static int size =0; 
  private static final int noOfdayOfWeek = 7 ; 
  // constructor; 
  public Exam(){
    this.subjects = new Subject[10];
    String str; 
    str.toCharArray();
    char[] a = new char[] {'A'};
    String.valueOf(a);
    // assume 10 subjects in exam 
  }

  public static int getNoOfDayoOfWeek(){
    return noOfdayOfWeek; 
  }

  public static int getSize(){
      return size;
  }


  public boolean delete(Subject subject){ // need to ensure the input subject is not null 
    String str = subject.getDescription();

    for (Subject sub : this.subjects){
      
      if(sub != null && subject != null && sub.getDescription().equals(str)){
        sub = null ; 
        size-- ; // once subject is deleted , size has to be removed. 
        return true ; 

      }

    }
    return false ; 


  }
  public void setSubject(Subject s){
   // int tmp = 0 ;
    
    this.subjects[size] = s; 
    Exam.size++ ; 
    //for ( int i = 0; i < this.subjects.length ; i++){
    //  if (this.subjects[i] == null){
     //   break;
     // }else {
      //  tmp++;
     // }
   // }
    //this.subjects[tmp] = s ; 
  }


  public double averageScore(){
    double  tmp = 0.0 ; 
    double count = 0.0 ; 
    for (Subject s : this.subjects){
      if ( s!=null){
        tmp = tmp + s.getScore();
        count++ ; 
      }
      
    }
    // use BigDecimal; 
   // BigDecimal up = BigDecimal.valueOf(tmp);
    //BigDecimal down = BigDecimal.valueOf(count);
    //return (up.divide(down).setScale(2,RoundingMode.UP).doubleValue());
    return tmp / count ; 
  }
  public void getSubject(){
    int i = 1 ; 
    for (Subject s : this.subjects){
      if ( s != null){

        System.out.println("exam :" + i + ":" + s.getDescription());
        i++ ; 
      }
    }
  }
  public static void main(String[] args){
    // use an instance method to calcualte the average score of the exam . 
    Subject s1 = new Subject("math", 50);
    Subject s2 = new Subject("eng", 20); 
    Subject s3 = new Subject("chin", 70);
    Subject s4 = new Subject("music",30);
    // construct exam
    Exam ex1 = new Exam();
    // set exam
    ex1.setSubject(s1);
    ex1.setSubject(s2);
    ex1.setSubject(s3);
    // get average score 
    System.out.println(ex1.averageScore()); //140/3 = 46.xxx
    ex1.getSubject();
    // count the number subject 
    System.out.println(Exam.size);//3

    // test delete
    System.out.println(ex1.delete(s4));// true


    System.out.println(s2.getGrade());

    System.out.println(Exam.getNoOfDayoOfWeek());
  }
  
}
