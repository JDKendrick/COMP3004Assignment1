package common;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Game {
	
	String userInput;
	Scanner scan = new Scanner(System.in);
	
	public void run() {
		
		this.intro();		
		if(userInput.equals("c"))
			this.playConsole();
		else if(userInput.equals("f"))
			this.playFile();
		else
			this.quit();
	}
	
	public void intro() {
		
		System.out.println("|                          |\n" +
						   "|        Blackjack!        |\n" +
						   "|                          |\n");

		System.out.println("Would you like to play using console input or file input?\n"
				         + "(Type \"c\" for console input, \"f\" for file input, or \"q\" to quit...)" );
		
		this.getInput();
		
		while(!userInput.equals("c") && !userInput.equals("f") && !userInput.equals("q")) {
			
			System.out.println("Error: Invalid input. Please try again.");
			this.getInput();
			
		}		
	}	
	
	public void getInput() {
		
		System.out.print("\n>");
		
		userInput = scan.nextLine();
		
		System.out.println();
		
	}	
	
	public void playConsole() {
		
		Dealer dealer = new Dealer();
		Player player = new Player();
		Rule ruleBook = new Rule();
		
		System.out.println("Game Start:\n\nDealer Shuffles...");
		
		dealer.deck.shuffle();
		
		System.out.println("Dealer deals to Player...");
		
		dealer.dealStartingHand(player);
		
		System.out.println("Dealer deals to Dealer...\n");
		
		dealer.dealStartingHand(dealer);
		
		System.out.println("Your " + player.status(player.checkHand(), ruleBook.currentScore(player.cards)));
		System.out.println("Dealer's " + dealer.status(dealer.checkHand(), ruleBook.currentScore(dealer.cards)));
		
	}
	
	public void playFile() {
		
		String str;
		
		System.out.println("Please type in the name of the file you are using (without the .txt at the end):");
		
		this.getInput();
		
		
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader("src\\main\\resources\\" + userInput + ".txt"));
			System.out.println(br.readLine());
			
			str = br.readLine();
			
			while(str != null) {
				
				System.out.println(str);
				
				str = br.readLine();
			}
			
			br.close();
		}
		catch (Exception e){
			System.out.println(e);
		}
				
	}
	
	
	public void quit() {
		
		System.out.println("Come play again soon!");
		System.exit(0);
		
	}
}
