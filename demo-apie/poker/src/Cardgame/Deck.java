package Cardgame;

public class Deck {

  Card[] cards;
  int numOfCards;
  public Deck(){

  }

  public Deck(int num){
    this.numOfCards = num ; 
    Card[] C = new Card[num];
    int i = 0 ;
    for (Suits S : Suits.values()){
      for(Rank R : Rank.values()){
          cards[i++] = new Card(S,R);
      }
    }
  }

  public static void Shuffle(){
    
  }
  
}
