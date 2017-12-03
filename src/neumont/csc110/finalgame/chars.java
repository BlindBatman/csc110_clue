package neumont.csc110.finalgame;


import java.io.IOException;



public class chars {
	public boolean loop = false;
	int count = 0;

	board move = new board();
	Players p1 = new Players();
	Players p2 = new Players();
	Players p3 = new Players();
	Players p4 = new Players();
	Players p5 = new Players();
	Players p6 = new Players();

	public void Character() throws IOException {
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("How many players are there?");
//		String input = in.readLine();
//		int numbIn = Integer.parseInt(input);

		while (count != 6) {
			System.out.println("Who would you like to play as? ");
			String[] character = { "Miss Alice" + "' Scarlet '" + "nguyen", "Professor koehler", "Colonel Joshua krebs",
					"Mrs.Corrine" + "'Peacock'" + "padilla ", "Mr.Ryan" + "'green'" + "cox",
					"Ms.sharon" + "'white'" + "struve" };
			ConsoleUI.promptForMenuSelection(character, false);
			count++;

		}
		
		count = 0;
		peeps();

	}

	public void peeps() throws IOException {
		int[] location = { 16, 0, 0, 5, 0, 18, 9,23 ,14, 23, 23,7 };
		do {
			if (count == 0) {
				p1.name = "Miss Alice" + " 'Scarlet' " + "nguyen";
				System.out.println(p1.name + " it is your turn.");
				p1.symbol = "S";
				p1.x = location[0];
				p1.y = location[1];
				move.Movement(p1.symbol, p1.x, p1.y);
				count++;
			}
			if (count == 1) {
				p2.name = "Professor koehler";
				System.out.println(p2.name + " it is your turn.");
				p2.symbol = "P";
				p2.x = location[2];
				p2.y = location[3];
				move.Movement(p2.symbol, p2.x, p2.y);
				count++;
			}
			if (count == 2) {
				p3.name = "Mrs.Corrine" + " 'Peacock' " + "padilla ";
				System.out.println(p3.name + " it is your turn.");
				p3.symbol = "C";
				p3.x = location[4];
				p3.y = location[5];
				move.Movement(p3.symbol, p3.x, p3.y);
				count++;
			}
			if (count == 3) {
				p4.name ="Mr.Ryan" + " 'green' " + "cox";
				System.out.println(p4.name + " it is your turn.");
				p4.symbol = "G";
				p4.x = location[6];
				p4.y = location[7];
				move.Movement(p4.symbol, p4.x, p4.y);
				count++;
			}
			if (count == 4) {
				p5.name = "Ms.sharon" + " 'white' " + "struve" ;
				System.out.println(p5.name + " it is your turn.");
				p5.symbol = "W";
				p5.x = location[8];
				p5.y = location[9];
				move.Movement(p5.symbol, p5.x, p5.y);
				count++;
			}
			if (count == 5) {
				p6.name = "Colonel Joshua Krebs";
				System.out.println(p6.name + " it is your turn.");
				p6.symbol ="K";
				p6.x = location[10];
				p6.y = location[11];
				move.Movement(p6.symbol, p6.x, p6.y);
				count++;
			}
			count= 0;
		} while (true);
	}
}
