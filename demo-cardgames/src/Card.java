public class Card {

  private String suits; // clubs, diamonds, hearts , spades 
  private int cardNumber ; //1 2 3 4 5 6 7 8 9 10 11  12 13 
  // 1 -> A , 11 -> Jack , 12 -> Queen , 13 -> King    

  public Card(){

  }

  public Card(String s, int n){
    this.suits = s ; 
    this.cardNumber = n ;
  }

  public String getSuits(){
    return this.suits;
  }

  public int getCardNumber(){
    return this.cardNumber;
  }
  
}
