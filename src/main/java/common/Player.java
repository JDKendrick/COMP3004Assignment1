package common;

public class Player {

	String [] cards = new String [12]; //12 is the maximum amount of cards a player can potentially have in blackjack.
	
	public Player () {} 
	
	public String checkHand() {
		
		String hand = "";
		int i = 0;
		
		if(this.cards[0] == null) 
			return "Your hand is empty";
		
		while(this.cards[i] != null) {		
			hand = hand + this.cards[i] + ", ";
			i++;
		}
					
		hand = hand.substring(0, hand.length() - 2); //Removes ", " from the end of the string
		
		return hand;	
		
	}	
	
}
