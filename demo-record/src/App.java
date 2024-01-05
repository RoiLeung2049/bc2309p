public class App {
    public static void main(String[] args)  {
        Book book = new Book("John", "HP") ; // all-args constructor 

        //getter (Yes), setter (NO, it is record the data structure is to keep record which is not supposed to be modified in the future ) ?
        System.out.println(book.authorName()) ; // no .get() now 
        //toString ? (Yes) return  a String 
        System.out.println(book.toString());

         //System.out.println(book.authorName)   ; not able to call this line , o the  attribute are private 
         // no empty constructor 

         // .equals() ; handled 
         Book  book2 = new Book(null, null) ; 
         System.out.println(book.equals(book2));


         // hashCode() ? handled 
         System.out.println(book.hashCode());
         System.out.println(book2.hashCode());

    }
}
