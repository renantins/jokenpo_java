package br.com.renan;

import java.util.Random;

public class Jokenpo {

	public static void main(String[] args) {
		String yourChoice = "Paper";
		String pcChoice = sortChoice();

		oldGame(yourChoice, pcChoice);

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

	public static void oldGame(String choice1, String choice2) {
		if (!choice1.equals(choice2)) {
			
			System.out.println(choice1 + " vs " + choice2);
			
			if (choice1.equals("Paper") && !choice2.equals(choice1)) {
				if (choice2.equals("Rock")) {
					System.out.println("You won! Paper beats Rock");
				} else {
					System.out.println("You lose! Scissors beats Paper");
				}
			} else if (choice1.equals("Rock") && !choice2.equals(choice1)) {
				if (choice2.equals("Scissors")) {
					System.out.println("You won! Rock beats Scissors Pedra");
				} else {
					System.out.println("You lose! Paper beats Rock");
				}
			} else if (choice1.equals("Scissors") && !choice2.equals(choice1)) {
				if (choice2.equals("Paper")) {
					System.out.println("You won! Scissors beats Paper");
				} else {
					System.out.println("You lose! Rock beats scissors");
				}
			}
		} else {
			System.out.println("Draw! Try again.");
		}

	}
}
