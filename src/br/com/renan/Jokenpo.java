package br.com.renan;

import java.util.Random;

public class Jokenpo {

	public static void main(String[] args) {
		
		String yourChoice = "Rock"; // Paper, Scissors or Rock
		String pcChoice;
		int i = 0;
		
		while (i < 100) {
			pcChoice = sortChoice();
			System.out.println(yourChoice+" vs "+pcChoice +": " +oldGame(yourChoice, pcChoice));
			i++;
		}
	}

	public static String sortChoice() {
		Random random = new Random();
		int choiceNumber = random.nextInt(3);

		switch (choiceNumber) {
		case 0:
			return "Rock";
		case 1:
			return "Paper";
		case 2:
			return "Scissors";
		default:
			break;
		}
		return null;
	}

	public static String oldGame(String choice1, String choice2) {
		
		if(choice1.equals(choice2))
			return "Draw! Try again";
		
		if (choice1.equals("Paper")) {
			if (choice2.equals("Rock"))
				return "You won! Paper beats Rock";

			return "You lose! Scissors beats Paper";
		}
		if (choice1.equals("Rock")) {
			if (choice2.equals("Scissors"))
				return "You won! Rock beats Scissors";

			return "You lose! Paper beats Rock";
		}
		if (choice1.equals("Scissors")) {
			if (choice2.equals("Paper"))
				return "You won! Scissors beats Paper";

			return "You lose! Rock beats scissors";
		}
		return null;
	}
}
