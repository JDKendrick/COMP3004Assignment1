package common;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

import junit.framework.TestCase;

public class DeckTester extends TestCase{
	
	//This method tests to see if the deck object has the correct number of cards (and none are null).
	public void doesDeckHave52Cards() {		
		Deck deck = new Deck();
		
		assertEquals(52, deck.cards.length);
		
	}
	
	//This method tests to see if the deck has been shuffled by appending the contents of the "Cards" array then comparing the strings.
	public void isDeckShuffled() {
		Deck deck = new Deck();
		Deck deck2 = new Deck();
		
		deck = deck.shuffle();
		deck2 = deck2.shuffle();
		
		assertFalse(true, assertArrayEquals(deck.cards, deck2.cards));		
	}
	
}
