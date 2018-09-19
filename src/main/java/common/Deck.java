package common;

import java.util.Random;

public class Deck {

	//Declares a deck of 52 cards in suit-value pairs (I.E. King of Spades is "SK")
	protected String [] cards = {"HA","H2","H3","H4","H5","H6","H7","H8","H9","H10","HJ","HQ","HK",
					             "SA","S2","S3","S4","S5","S6","S7","S8","S9","S10","SJ","SQ","SK",
					             "CA","C2","C3","C4","C5","C6","C7","C8","C9","C10","CJ","CQ","CK",
					             "DA","D2","D3","D4","D5","D6","D7","D8","D9","D10","DJ","DQ","DK"};
	
	//Shuffles the current deck
	public void shuffle() {
		
		int [] randomSeed = new int [52];
		String [] temp = new String [52];
		Random randomGen = new Random();
		
		for (int i = 0; i < randomSeed.length; i++) {
			
			randomSeed[i] = randomGen.nextInt(52);
			
			for(int j = 0; j < i; j++) {	
				
				if(randomSeed[j] == randomSeed[i]) {
					i--;
					break;					
				}				
			}				
		}
		
		for (int i = 0; i < temp.length; i++)
			temp[i] = this.cards[i];
		
		for (int i = 0; i < temp.length; i++)
			this.cards[i] = temp[randomSeed[i]];
		
	}
	
	//Prints out the configuration of the current deck 
	public String toString() {
		
		String answer = "";
		
		for (int i = 0; i < this.cards.length; i++) 
			answer += this.cards[i];
		
		return answer;
		
	}	
}
