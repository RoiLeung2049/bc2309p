public class Car {

    String make;
    String model ; 
    String year ;

  // Empty Constructor of Car class . no statement inside { }
    public Car() {

    }

    public Car(String make, String model, String year){
      this.make = make; 
      this.model = model ; 
      this.year = year; 
    }

    public Car(String make , String model ){
      this.make = make ; 
      this.model = model ; 
    }

    public void setMake(String make){
      this.make = make ;
    }
  
      public void setModel(String model){
        this.model = model ; 

      }

      public void setYear(String year){
        this.year = year; 
      }

      public String getMake(){
        return this.make;
      }

      public static void main(String[] args){

        Car c1 = new Car() ; // object is created in Heap 
        c1.setMake("abc"); // c1 with memory reference find the Car object created in Heap---> then it Use thie method inside the object and pass the value "abc" to the instance variable in Car object  
        c1.setModel("xyz");
        c1.setYear("2020");
        Car c2 = new Car();
        System.out.println(c2.getMake());

        Car c3 = new Car("cba","ijk","2023");
        System.out.println(c3.getMake());

        Car c4 = new Car("fdv", "2022"); 
        //System.out.println(c4.getModel);
      }
}
