import java.time.LocalDate;

public class LocalDateTest {


  int year ;
  int month  ;
  int day ;
  // constructor
  public LocalDateTest(int year, int month, int day){
    this.year = year;
    this.month = month  ; 
    this.day = day; 
  }

  public static LocalDateTest of(int year, int month, int day) {
    return new LocalDateTest(year, month, day);// call this by a statis method 
  }
  public static void main(String[] args){

      LocalDate date = LocalDate.of(2023,12,31); //.of is modern style , make object without constructor
      System.out.println(date.getMonth());
      System.out.println(date.getDayOfWeek());


      LocalDate date2 = LocalDate.of(2024, 2, 27);


  }
 public  boolean isBetween(LocalDate date1, LocalDate date2){
    LocalDate tmpDate = LocalDate.of(this.year,this.month,this.day);

    if ( date1.isBefore(tmpDate)&& date2.isAfter(tmpDate))
      return true;
    return false ; 
 } 
}
