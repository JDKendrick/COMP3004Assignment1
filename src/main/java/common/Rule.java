package common;

public class Rule {

	public int getCardValue(String s) {
		
		String value = s.substring(1, s.length());
		
		switch(value) {
		
			case "K": case "Q": case "J":
				return 10;						
			case "A":
				return 1;
			case "2": case "3": case "4": case "5": case "6": 
			case "7": case "8": case "9": case "10":
				return Integer.parseInt(value);
			default:
				return -1;	
		}	
	}		
}
