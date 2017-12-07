package neumont.csc110.finalgame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class chars {
	Hand callHandClass = new Hand();
	public boolean loop = false;
	int count = 0;
	ArrayList<Players> players = new ArrayList<Players>();
	board move = new board();
	Players p1 = new Players();
	Players p2 = new Players();
	Players p3 = new Players();
	Players p4 = new Players();
	Players p5 = new Players();
	Players p6 = new Players();

	public BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public void characterCount() throws IOException {
		boolean isTrue = false;

		boolean validInput = false;
		int playerNumber = 0;
		do {

			while (!validInput) {
				System.out.println("How many players are there? 3-6");
				String playerCount = in.readLine();
				try {
					playerNumber = Integer.parseInt(playerCount);
					validInput = true;
				} catch (NumberFormatException ex) {

					System.out.println("enter valid input");
				}
				if (playerNumber == 3 || playerNumber == 4 || playerNumber == 5 || playerNumber == 6) {

					choosePlayer(playerNumber);
					isTrue = true;
				}

				else {
					System.out.println("Invalid input.");
					isTrue = false;
				}

			}

		} while (isTrue != true);
	}

	private void choosePlayer(int playerNumber) throws IOException {
		int[] location = { 16, 0, 0, 5, 0, 18, 9, 23, 14, 23, 23, 7 };
		int playerCount = 0;
		int choosePlayer = 0;
	String numberGuessed = " ";
		
		do {
			String[] names = { " Miss Alice Scarlet Nguyen" , " Profesor Koehler" , "Mrs. Corrine Peacock Padilla"
					, "Ryan Green Cox" , "Ms. Sharon White Struve" , "Colonel Krebs " };
			choosePlayer = ConsoleUI.promptForMenuSelection(names, false);
			String fuckOFf=Integer.toString(choosePlayer);
		
		 if(choosePlayer== 1|| choosePlayer== 2 || choosePlayer== 3 || choosePlayer== 4
					|| choosePlayer== 5 || choosePlayer== 6 ) {
				if( !numberGuessed.contains(fuckOFf)) {
			 numberGuessed += fuckOFf;
		 
			if (choosePlayer == 1) {

				p1.name = "Miss Alice" + " 'Scarlet' " + "nguyen";
				p1.symbol = "S";
				p1.x = location[0];
				p1.y = location[1];
				players.add(p1);
				playerCount++;
			}
			if (choosePlayer == 2) {
				p2.name = "Professor koehler";
				p2.symbol = "P";
				p2.x = location[2];
				p2.y = location[3];
				players.add(p2);
				playerCount++;

			}
			if (choosePlayer == 3) {
				p3.name = "Mrs.Corrine" + " 'Peacock' " + "padilla ";
				p3.symbol = "C";
				p3.x = location[4];
				p3.y = location[5];
				players.add(p3);
				playerCount++;

			}
			if (choosePlayer == 4) {
				p4.name = "Mr.Ryan" + " 'green' " + "cox";
				p4.symbol = "G";
				p4.x = location[6];
				p4.y = location[7];
				players.add(p4);
				playerCount++;

			}
			if (choosePlayer == 5) {
				p5.name = "Ms.sharon" + " 'white' " + "struve";
				p5.symbol = "W";
				p5.x = location[8];
				p5.y = location[9];
				players.add(p5);
				playerCount++;

			}
			if (choosePlayer == 6) {
				p6.name = "Colonel Joshua Krebs";
				p6.symbol = "K";
				p6.x = location[10];
				p6.y = location[11];
				players.add(p6);
				playerCount++;
			}
			}
		
		 }
			// choice is the number of players and player is the person they chose
			// so if player chose 1 then they chose scarlet which makes them p1 and that
			// goes for every player
			// since we say who is the player they should keep track of themselves since we
			// sysout the name of whose turn it is
			// so essentially we can just make player control what players move and which
			// ones don't ex. if no one chose Krebs then krebs doesnt move
		} while (playerCount < playerNumber);

		move.turnSwitch(players);
	}
	}


