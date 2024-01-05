public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(get(Weekday.WEDNESDAY)); // WENDESDAY

        String dayaType = switch(Weekday.WEDNESDAY){

            case MONDAY -> "Monday" ;
            case TUESDAY -> "Tuesday"; 
            case WEDNESDAY -> "Wednesday";
            case THURSDAY -> "Thurday" ; 
            case FRIDAY -> "Friday";


        };
        System.out.println("Data Type " + dayaType);

    }



    public static String get(Weekday weekday){
          String day = "" ; 
            switch(weekday){
             
                    case MONDAY: // 直接打 ＥＮＵＭ 的VＡＬＵＥ， 而不是 ： Weekday.MONDAY
                        return "Monday";
                        // or day = "Monday"
                        // break ; 
                    case TUESDAY:
                        return "Tuesday";
                    case WEDNESDAY:
                        return "Wednesday";
                    case THURSDAY:
                        return "Thursday";
                    case FRIDAY :
                        return "Friday";

                    default :
                        return "Invalid day";
            
            }



    }


    public static String get2(Weekday weekday){//Switch expression has return type 

        return switch(weekday){
            case MONDAY-> "Monday";
            case TUESDAY -> "Tuesday" ;
            case WEDNESDAY -> "Wendesday";
            case THURSDAY -> "Thursday";
            case FRIDAY -> "Friday";
        }
    }
}
