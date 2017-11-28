package neumont.csc110.finalgame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class chars {
	public boolean loop = false;
	int count = 0;

	public void loop() throws IOException {
		do {
			peeps();
			lop();

		} while (!loop);

	}

	public void Character() throws IOException {

		System.out.println("Who would you like to play as? ");
		String[] chars = { "Mrs.Corrine" + "'Peacock'" +"padilla ", "Ms.sharon"+ "'white'" + "struve", "Mr.Ryan"+"'green'" + "cox",
				"Professor koehler", "Miss Scarlet - ", "Colonel krebs" };

		ConsoleUI.promptForMenuSelection(chars, false);

	}

	public int peeps() throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("How many players are there?");
		String input = in.readLine();
		int numbIn = Integer.parseInt(input);
		int keepTrack = 0;
		if (numbIn <= 6) {
			do {
				Character();
				keepTrack++;
			} while (keepTrack <= (numbIn - 1));
			count++;

			return count++;

		} else {
			System.out.println("Sorry but that is to many players");

		}

		return count;

	}

	public boolean lop() {

		if (count == 0 || count > 6) {
			return loop;
		} else if (count < 6) {
			loop = true;
		}
		return loop;
	}
}
