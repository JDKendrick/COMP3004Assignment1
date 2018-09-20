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
		
		dealer.dealStartingHand(player);
		
		assertNotEquals(null, player.cards[0]);
		assertNotEquals(null, player.cards[1]);
		assertEquals(null, player.cards[2]);
		assertEquals(null, dealer.cards[0]); //The following 2 tests confirm that the dealer has not received any cards yet. 
		assertEquals(null, dealer.cards[1]);
		
		dealer.dealStartingHand(dealer);
		
		assertNotEquals(null, dealer.cards[0]);
		assertNotEquals(null, player.cards[1]);
		assertEquals(null, player.cards[2]);
		
	}
	
	public void testDealRandomCard() {
		
		Dealer dealer = new Dealer();
		Player player = new Player();
		
		dealer.deal(player);
		
		assertNotEquals(null, player.cards[0]);
		
	}
	
	public void testDealSpecificCard() {
		
		Dealer dealer = new Dealer();
		Player player = new Player();
		dealer.deck = new Deck();
				
		dealer.deck.shuffle();
		dealer.deal("SK", player);
		assertEquals("SK", player.checkHand());		
		
	}
	
	public void testCheckHand() {
		
		Dealer dealer = new Dealer();
		
		assertEquals("The dealer's hand is empty", dealer.checkHand());
		
		dealer.deal("SK", dealer);		
		assertEquals("SK", dealer.checkHand()); 
		
		dealer.deal("SQ", dealer);
		assertEquals("SK, Unknown", dealer.checkHand());
		
		dealer.deal("SA", dealer);
		assertEquals("SK, SQ, SA", dealer.checkHand());
		
	}
	
}
