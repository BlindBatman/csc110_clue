package neumont.csc110.finalgame;

import java.util.Random;

public class dice {

	public int diceRoll() {
		Random Dice = new Random();
		int[] rolls = new int[2];
		for (int i = 0; i < rolls.length; i++) {

			rolls[i] = Dice.nextInt(6) + 1;

		}

		System.out.print("Your rolls are " + rolls[1]);
		System.out.println(" and " + rolls[0] + " ");
		return rolls[0] + rolls[1];
	}

}
