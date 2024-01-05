public abstract class Parent {
    abstract void read();



    public static void main(String[] args) {
      Parent parent = new Parent(){// normally abstract class can't be "new" , instanciated , but it only means , we can't : Parent parent = new Parent();
        @Override
        public void read(){
          System.out.println("hello");
        }

      };// this is a one-off usage 

        parent.read();
      
    }

}
