package common;

import junit.framework.TestCase;

public class PlayerTester extends TestCase{
	
	public void testCheckHand() {
		
		Player player = new Player();
		Dealer dealer = new Dealer();
		
		assertEquals("Your hand is empty", player.checkHand());
		
		dealer.deal("SK", player);		
		assertEquals("SK", player.checkHand()); 
		
		dealer.deal("SQ", player);
		assertEquals("SK, SQ", player.checkHand());		
		
	}
	
	public void testStatus() {
		
		Player player = new Player();
		Dealer dealer = new Dealer();
		Rule ruleBook = new Rule();
		
		dealer.deck.shuffle();
		dealer.deal("C6", player);
		dealer.deal("S9", player);
		
		assertEquals("Hand: C6, S9\nScore: 15\n", player.status(player.checkHand(), ruleBook.currentScore(player.cards)));
		
		
	}

}
