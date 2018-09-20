package common;

public class Dealer extends Player {
	
	protected Deck deck;
	boolean hideCard;
	
	public Dealer() {
		
		deck = new Deck();
		hideCard = true;
					
	}
	
	public void deal(Player player) {
		
		int i = 0;
		
		while(player.cards[i] != null)
			i++;
		
		player.cards[i] = this.deck.cards[this.deck.position];
		this.deck.cards[this.deck.position] = ""; //Prevents you from dealing the same card twice.
		this.deck.position++;
		
	}
	
	public void deal(String s, Player player) {
		
		for(int i = this.deck.position; i < this.deck.cards.length; i++) {
			
			if(this.deck.cards[i].equals(s)) {
				
				int j = 0;
				
				while(player.cards[j] != null)
					j++;
				
				player.cards[j] = this.deck.cards[i];
				this.deck.cards[i] = ""; //Prevents you from dealing the same card twice.
				return;				
			}			
		}
		
		System.out.println("Error: Card not in deck");		
	}
	
	public void dealStartingHand(Player player) {
		
		this.deal(player);
		this.deal(player);
		
	}
	
	//@override
	public String checkHand() {
		
		String hand = "";
		int i = 0;
		
		if(this.cards[0] == null) 
			return "The dealer's hand is empty";
		
		while(this.cards[i] != null) {	
			
			//If the dealer has 2 and only 2 cards, the second card is shown as "unknown"
			if(this.hideCard == true && i+1 == 2)
				return hand + "Unknown";
			
			hand = hand + this.cards[i] + ", ";
			i++;
			
		}
					
		hand = hand.substring(0, hand.length() - 2); //Removes ", " from the end of the string
		
		return hand;
	}

}
