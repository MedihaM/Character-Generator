import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;

public class Generator extends JFrame {

	// Contains the "indices" of the adjectives in the Adjectives.txt file
	static int[] adjectives;

	public static void main(String[] args) {

		new Generator();

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to the character generator!");
		System.out.println("-----------------------------------");
		System.out.println("How many adjectives would you like? (Recommended: ~4)");

		// Create an array of adjectives if the person wants adjectives
		try {
			int integer = keyboard.nextInt(); // Get the number they want
		
		if (integer > 0) {
			
			if (integer > Adjectives.getAdjCount()) { // If too many adjectivs are selected
				System.out.println("A maximum of " + Adjectives.getAdjCount() + " adjectives are available.");
				System.out.println("You probably wouldn't want to use them all, though!");
			} else {

				fillAdjectives(integer);

				System.out.println("Here are some words that describe your character:");
				for (int i = 0; i < adjectives.length; i++) {
					try {
						System.out.println(" -->  " + Adjectives.getAdjective(adjectives[i]));
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}

		// Produce the three colours
		new JavaGraphics();
		} catch (Exception e){
			System.out.println("Your request could not be handled.");
		}

	}

	/**
	 * Fills in the array of adjectives with random, different words.
	 * 
	 * @param n
	 */
	public static void fillAdjectives(int n) {
		adjectives = new int[n];

		// Put in the first adjective
		adjectives[0] = Adjectives.getRandomNumber();

		for (int i = 1; i < adjectives.length; i++) {

			while (true) {
				boolean occupied = false;
				int number = Adjectives.getRandomNumber();

				for (int j = 0; j < i; j++) {
					if (number == adjectives[j])
						occupied = true;
				}
				if (!occupied) {
					adjectives[i] = number;
					break;
				}
			}
		}
	}

}
