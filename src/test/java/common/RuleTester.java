package common;

import junit.framework.TestCase;

public class RuleTester extends TestCase {

	public void testCurrentScore() {
		
		Rule ruleBook = new Rule();
		
		String [] hand1 = {"SK"};
		assertEquals(10, ruleBook.currentScore(hand1));
		
		String [] hand2 = {"CK"};
		assertEquals(10, ruleBook.currentScore(hand2)); //Proves that suits are ignored
		
		String [] hand3 = {"SQ"};
		assertEquals(10, ruleBook.currentScore(hand3));
		
		String [] hand4 = {"SJ"};
		assertEquals(10, ruleBook.currentScore(hand4));
		
		String [] hand5 = {"SA"};
		assertEquals(11, ruleBook.currentScore(hand5));
		
		String [] hand6 = {"S6"};
		assertEquals(6, ruleBook.currentScore(hand6));
		
		String [] hand7 = {"S10"};
		assertEquals(10, ruleBook.currentScore(hand7));
		
		String [] hand8 = {"S11"};
		assertEquals(-1, ruleBook.currentScore(hand8));
		
		String [] hand9 = {"SK", "SQ"};		
		assertEquals(20, ruleBook.currentScore(hand9));
		
		String [] hand10 = {"SK", "SQ", "SJ"};
		assertEquals(30, ruleBook.currentScore(hand10));
		
		String [] hand11 = {"S10", "SQ", "SA"};
		assertEquals(21, ruleBook.currentScore(hand11)); //Ace is 1 in this case
		
		String [] hand12 = {"S6", "SA"};
		assertEquals(17, ruleBook.currentScore(hand12)); //Ace is 11 in this case
		
		String [] hand13 = {"S7", "S3", "S5"};
		assertEquals(15, ruleBook.currentScore(hand13));
		
		String [] hand14 = {"S2", "C2", "S6", "S11", "S7"};
		assertEquals(-1, ruleBook.currentScore(hand14)); //Will return -1 due to there being an invalid card.
		
		String [] hand15 = {"SA", "CA", "H9"};
		assertEquals(21, ruleBook.currentScore(hand15)); //One ace will be 1 and the other will be 11.
		
	}
	
}
