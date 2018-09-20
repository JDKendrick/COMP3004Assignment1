package common;

import junit.framework.TestCase;

public class PlayerTester extends TestCase{
	
	public void testCheckHand() {
		
		Player player = new Player();
		Dealer dealer = new Dealer();
		
		dealer.deal("SK", player);		
		assertEquals("SK", player.checkHand()); 
		
		dealer.deal("SQ", player);
		assertEquals("SK, SQ", player.checkHand());		
		
	}

}
