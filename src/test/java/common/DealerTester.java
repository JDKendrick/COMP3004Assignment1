package common;

import static org.junit.Assert.assertNotEquals;
import junit.framework.TestCase;

public class DealerTester extends TestCase{

	/*Tests the functionality of the dealer dealing the starting hand.
	/*  - Note that the second card for the dealer will be "face down" 
	/*    when using the "checkHand()" function */
	
	public void testDealStartingHand(){
		
		Player player = new Player();
		Dealer dealer = new Dealer();
		
		Dealer.dealStartingHand(player);
		
		assertNotEquals(null, player.cards[0]);
		assertNotEquals(null, player.cards[1]);
		assertEquals(null, player.cards[2]);
		assertEquals(null, dealer.cards[0]); //The following 2 tests confirm that the dealer has not received any cards yet. 
		assertEquals(null, dealer.cards[1]);
		
		Dealer.dealStartingHand(dealer);
		
		assertNotEquals(null, dealer.cards[0]);
		assertNotEquals(null, player.cards[1]);
		assertEquals(null, player.cards[2]);
		
	}
	
}
