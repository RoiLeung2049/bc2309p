package Cardgame;

public class Cardgame {

  Player[] Players;
  Deck[] Decks;
  int numOfCardInDeck ;
  int numberOfPlayer ;
  int numberOfCardPerPlayer ; 
  public Cardgame(int numOfPlayer,int numberOfDesk, int numCD ){
    this.numberOfPlayer = numOfPlayer;
    Player[] P = new Player[this.numberOfPlayer] ;
    Deck[] D = new Deck[numberOfDesk];
    this.numOfCardInDeck = numCD;
    this.Decks = D ;
    this.Players = P ;
    //instantiate a Deck 
    for (Deck d : this.Decks){
      d.cards = new Card[this.numOfCardInDeck];

    }
    //need to shuffle the desk 
    // desk.shuffle() ; 
    //instantiate a group of Player; 
    int j = 0 ; 
    for (Player p : this.Players){
      p.playerNumber = j++ ; 
      
    }
  }
}
