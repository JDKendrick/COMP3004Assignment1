package common;

public class Rule {

	public int currentScore(String s[]) {
		
		String value;
		int score = 0;
		
		for (int i = 0; i < s.length; i++) {
		
			value = s[i].substring(1, s[i].length());
		
			switch(value) {
		
				case "K": case "Q": case "J":
					score = score + 10;
					break;
				case "A":						
					score = score + 11;
					break;
				case "2": case "3": case "4": case "5": case "6": 
				case "7": case "8": case "9": case "10":
					score = score + Integer.parseInt(value);
					break;
				default:
					return -1;	
			}	
		}
		
		if(score > 21) {
			
			int i = 0;
			
			while (score > 21 && i < s.length) {
				
				value = s[i].substring(1, s[i].length());
				
				if(value.equals("A"))
					score = score - 10;
				
				i++;				
			}			
		}
		
		return score;		
	}		
}
