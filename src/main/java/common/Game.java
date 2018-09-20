package common;

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
		
		
		
		
	}
	
	public void playFile() {
		
		
	}
	
	
	public void quit() {
		
		System.out.println("Come play again soon!");
		System.exit(0);
		
	}
}
