package common;

import junit.framework.TestCase;
import static org.junit.Assert.*;

public class DeckTester extends TestCase{
	
	//This method tests to see if the deck object has the correct number of cards (and none are null).
	public void testDoesDeckHave52Cards() {		
		Deck deck = new Deck();
		
		assertEquals(52, deck.cards.length);		
	}
	
	//This method tests to see if the deck has been shuffled by appending the contents of the "Cards" array then comparing the strings.
	public void testShuffle() {
		Deck deck = new Deck();
		Deck deck2 = new Deck();
		
		deck.shuffle();
		deck2.shuffle();
		
		assertNotEquals(deck.toString(), deck2.toString());		
	}
}
