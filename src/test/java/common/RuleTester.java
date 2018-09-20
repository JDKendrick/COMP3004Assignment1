package common;

import junit.framework.TestCase;

public class RuleTester extends TestCase {

	public void testCardValue() {
		
		Rule ruleBook = new Rule();
		
		assertEquals(10, ruleBook.getCardValue("SK"));
		assertEquals(10, ruleBook.getCardValue("CK"));
		assertEquals(10, ruleBook.getCardValue("SQ"));
		assertEquals(10, ruleBook.getCardValue("SJ"));
		assertEquals(1, ruleBook.getCardValue("SA"));
		assertEquals(6, ruleBook.getCardValue("S6"));
		assertEquals(10, ruleBook.getCardValue("S10"));
		assertEquals(-1, ruleBook.getCardValue("S11"));
		
	}
	
}
