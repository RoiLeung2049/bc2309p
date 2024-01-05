package Cardgame;

public class Player {

  Card[] hands; 
  //String playerName; 
  int playerNumber;
  
  Player(){

  }

  Player(int numOfcard , int playerNum ){
    this.hands = new Card[numOfcard];
    this.playerNumber = playerNum;
  }

}
