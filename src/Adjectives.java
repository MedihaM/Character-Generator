import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

/**
 * 
 * Deals with a list of adjectives. Accesses the Adjectives.txt file (which was
 * taken from https://www.d.umn.edu/~rave0029/research/adjectives1.txt with
 * several tweaks).
 * 
 * 
 * @author Mediha
 *
 */
public class Adjectives {

	static BufferedReader br;
	static int adjectives = getAdjCount();

	/**
	 * Calculates the number of adjectives in Adjectives.txt
	 * 
	 * @return the number of adjectives.
	 */
	public static int getAdjCount() {
		int count = 0;

		try {
			br = new BufferedReader(new FileReader("Data/Adjectives.txt"));
			// Count the number of lines
			while (br.readLine() != null) {
				count++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return count;
	}

	/**
	 * Calculates a random number between 0 and the number of adjectives. This
	 * number is used to reference an adjective.
	 * 
	 * @return A random number less than the number of adjectives.
	 */
	public static int getRandomNumber() {
		Random random = new Random();
		return random.nextInt(getAdjCount());
	}

	/**
	 * Gets the adjective at the given index.
	 * 
	 * 
	 * @param n
	 *            The index of the adjective.
	 * @return An adjective
	 * @throws IOException
	 */
	public static String getAdjective(int n) throws IOException {
		br = new BufferedReader(new FileReader("Data/Adjectives.txt"));
		String line = null;

		for (int i = 0; i <= n; i++) {
			line = br.readLine();
		}

		return line;
	}

}
