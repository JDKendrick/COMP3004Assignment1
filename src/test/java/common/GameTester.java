package common;

import junit.framework.TestCase;

public class GameTester extends TestCase {

	public void testCardValue() {
		
		Game game = new Game();
		
		game.getCardValue("SK");
		game.getCardValue("CK");
		game.getCardValue("SQ");
		game.getCardValue("SJ");
		game.getCardValue("SA");
		game.getCardValue("S6");
		game.getCardValue("S10");
		
	}
	
}
