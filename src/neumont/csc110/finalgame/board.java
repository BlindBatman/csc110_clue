package neumont.csc110.finalgame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class board {
	Weapons[] weaponArray = Weapons.values();
	DetectivePad callPad = new DetectivePad();
	String[][] boardlength = new String[24][25];
	Hand callHandClass = new Hand();
	int i;
	public void Weap() {
		weaponArray[0].x = 0;
		weaponArray[0].y = 19;
		weaponArray[1].x = 2;
		weaponArray[1].y = 2;
		weaponArray[2].x = 0;
		weaponArray[2].y = 7;
		weaponArray[3].x = 17;
		weaponArray[3].y = 11;
		weaponArray[4].x = 11;
		weaponArray[4].y = 19;
		weaponArray[5].x = 11;
		weaponArray[5].y = 24;
		
	}

	public void turnSwitch(ArrayList<Players> players) throws IOException {
		i = 0;
		do {
			System.out.println(players.get(i).name + "");
			Movement( players);
			i++;
			if (i == players.size()) {
				i = 0;
			}
		} while (i < players.size());

	}

	public void Movement( ArrayList<Players> players) throws IOException {

		dice roll = new dice();
		int diceRoll = 0;
		int rollChange = roll.diceRoll();
		callPad.promptForPad();
		callHandClass.promptToIgnoreAccusation();
		if(callHandClass.accuse()==true) {
			players.remove(players.indexOf(i));
		}
		do {

			String[] direction = { "up", "down", "left", "right" };
			int move = ConsoleUI.promptForMenuSelection(direction, false);

			if (move == 1) {

				players.get(i).y--;

				boolean check = check(players.get(i).x, players.get(i).y);

				if (check != true) {
					players.get(i).y++;
					diceRoll--;
					enterRoom( players,players.get(i).x, players.get(i).y);
				}

				else {
					diceRoll++;
					enterRoom(players,players.get(i).x, players.get(i).y);
				}

			}

			if (move == 2) {

				players.get(i).y++;

				boolean badIn = check(players.get(i).x, players.get(i).y);

				if (badIn != true) {
					players.get(i).y--;
				}

				else {
					diceRoll++;
					enterRoom(players, players.get(i).x, players.get(i).y);
				}
			}

			if (move == 3) {

				players.get(i).x--;

				boolean badIn = check(players.get(i).x, players.get(i).y);

				if (badIn != true) {
					players.get(i).x++;
					diceRoll--;
					enterRoom(players, players.get(i).x, players.get(i).y);
				}

				else {
					diceRoll++;
					enterRoom(players, players.get(i).x, players.get(i).y);
				}
			}

			if (move == 4) {

				players.get(i).x++;

				boolean badIn = check(players.get(i).x, players.get(i).y);

				if (badIn != true) {
					players.get(i).x--;
					diceRoll--;
					enterRoom(players, players.get(i).x, players.get(i).y);
				}

				else {
					diceRoll++;
					enterRoom(players, players.get(i).x, players.get(i).y);
				}
			}

			display(players);

		} while (diceRoll < rollChange);

	}

	public boolean check(int x, int y) {
		if (x < 0) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}

		if (x > 24) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}

		if (y < 0) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y > 23) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 0 && x == 0 || y == 0 && x == 1 || y == 0 && x == 2 || y == 0 && x == 3 || y == 0 && x == 4
				|| y == 0 && x == 5 || y == 0 && x == 6) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 1 && x == 0 || y == 1 && x == 1 || y == 1 && x == 2 || y == 1 && x == 3 || y == 1 && x == 4
				|| y == 1 && x == 5 || y == 1 && x == 6) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 2 && x == 0 || y == 2 && x == 1 || y == 2 && x == 2 || y == 2 && x == 3 || y == 2 && x == 4
				|| y == 2 && x == 5 || y == 2 && x == 6) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 3 && x == 0 || y == 3 && x == 1 || y == 3 && x == 2 || y == 3 && x == 3 || y == 3 && x == 4
				|| y == 3 && x == 5 || y == 4 && x == 0) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 0 && x == 8 || y == 0 && x == 9 || y == 0 && x == 10 || y == 0 && x == 11 || y == 0 && x == 12
				|| y == 0 && x == 13 || y == 0 && x == 14 || y == 0 && x == 15) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;

		}
		if (y == 1 && x == 9 || y == 1 && x == 10 || y == 1 && x == 11 || y == 1 && x == 12 || y == 1 && x == 13
				|| y == 1 && x == 14) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 2 && x == 9 || y == 2 && x == 10 || y == 2 && x == 11 || y == 2 && x == 12 || y == 2 && x == 13
				|| y == 2 && x == 14) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 3 && x == 9 || y == 3 && x == 10 || y == 3 && x == 11 || y == 3 && x == 12 || y == 3 && x == 13
				|| y == 3 && x == 14) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 4 && x == 9 || y == 4 && x == 10 || y == 4 && x == 11 || y == 4 && x == 12 || y == 4 && x == 13
				|| y == 4 && x == 14) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 5 && x == 10 || y == 5 && x == 11 || y == 5 && x == 12 || y == 5 && x == 13 || y == 5 && x == 14) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 6 && x == 9 || y == 6 && x == 10 || y == 6 && x == 11 || y == 6 && x == 12 || y == 6 && x == 13
				|| y == 6 && x == 14) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 7 && x == 9 || y == 7 && x == 10 || y == 7 && x == 13 || y == 7 && x == 14) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 0 && x == 17 || y == 0 && x == 18 || y == 0 && x == 19 || y == 0 && x == 20 || y == 0 && x == 21
				|| y == 0 && x == 22 || y == 0 && x == 23) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 1 && x == 17 || y == 1 && x == 18 || y == 1 && x == 19 || y == 1 && x == 20 || y == 1 && x == 21
				|| y == 1 && x == 22 || y == 1 && x == 23) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 2 && x == 17 || y == 2 && x == 18 || y == 2 && x == 19 || y == 2 && x == 20 || y == 2 && x == 21
				|| y == 2 && x == 22 || y == 2 && x == 23) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 3 && x == 17 || y == 3 && x == 18 || y == 3 && x == 19 || y == 3 && x == 20 || y == 3 && x == 21
				|| y == 3 && x == 22 || y == 3 && x == 23) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 4 && x == 17 || y == 4 && x == 18 || y == 4 && x == 19 || y == 4 && x == 20 || y == 4 && x == 21
				|| y == 4 && x == 22 || y == 4 && x == 23) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 5 && x == 18 || y == 5 && x == 19 || y == 5 && x == 20 || y == 5 && x == 21 || y == 5 && x == 22
				|| y == 5 && x == 23) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 6 && x == 0 || y == 6 && x == 1 || y == 6 && x == 2 || y == 6 && x == 3 || y == 6 && x == 4
				|| y == 6 && x == 5) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 7 && x == 0 || y == 7 && x == 1 || y == 7 && x == 2 || y == 7 && x == 3 || y == 7 && x == 4
				|| y == 7 && x == 5 || y == 7 && x == 6) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 8 && x == 0 || y == 8 && x == 1 || y == 8 && x == 2 || y == 8 && x == 3 || y == 8 && x == 4
				|| y == 8 && x == 5) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 9 && x == 0 || y == 9 && x == 1 || y == 9 && x == 2 || y == 9 && x == 3 || y == 9 && x == 4
				|| y == 9 && x == 5 || y == 9 && x == 6) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 10 && x == 0 || y == 10 && x == 1 || y == 10 && x == 2 || y == 10 && x == 4 || y == 10 && x == 5) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 12 && x == 0 || y == 12 && x == 2 || y == 12 && x == 3 || y == 12 && x == 4 || y == 12 && x == 5) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 13 && x == 0 || y == 13 && x == 1 || y == 13 && x == 2 || y == 13 && x == 3 || y == 13 && x == 4
				|| y == 13 && x == 5) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 14 && x == 0 || y == 14 && x == 1 || y == 14 && x == 2 || y == 14 && x == 3 || y == 14 && x == 4
				|| y == 14 && x == 5) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 15 && x == 0 || y == 15 && x == 1 || y == 15 && x == 2 || y == 15 && x == 3 || y == 15 && x == 4) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 16 && x == 0 || y == 16 && x == 1 || y == 16 && x == 2 || y == 16 && x == 3 || y == 16 && x == 4
				|| y == 16 && x == 5) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 9 && x == 16 || y == 9 && x == 17 || y == 9 && x == 19 || y == 9 && x == 20 || y == 9 && x == 21
				|| y == 9 && x == 22 || y == 9 && x == 23) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 10 && x == 16 || y == 10 && x == 17 || y == 10 && x == 18 || y == 10 && x == 19 || y == 10 && x == 20
				|| y == 10 && x == 21 || y == 10 && x == 22 || y == 10 && x == 23) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 11 && x == 16 || y == 11 && x == 17 || y == 11 && x == 18 || y == 11 && x == 19 || y == 11 && x == 20
				|| y == 11 && x == 21 || y == 11 && x == 22 || y == 11 && x == 23) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 12 && x == 17 || y == 12 && x == 18 || y == 12 && x == 19 || y == 12 && x == 20 || y == 12 && x == 21
				|| y == 12 && x == 22 || y == 12 && x == 23) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 13 && x == 16 || y == 13 && x == 17 || y == 13 && x == 18 || y == 13 && x == 19 || y == 13 && x == 20
				|| y == 13 && x == 21 || y == 13 && x == 22 || y == 13 && x == 23) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 14 && x == 16 || y == 14 && x == 17 || y == 14 && x == 18 || y == 14 && x == 19 || y == 14 && x == 20
				|| y == 14 && x == 21 || y == 14 && x == 22 || y == 14 && x == 23) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 15 && x == 19 || y == 15 && x == 20 || y == 15 && x == 21 || y == 15 && x == 22 || y == 15 && x == 23
				|| y == 16 && x == 23 || y == 8 && x == 23 || y == 6 && x == 23) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 19 && x == 0 || y == 19 && x == 1 || y == 19 && x == 2 || y == 19 && x == 3) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 20 && x == 0 || y == 20 && x == 1 || y == 20 && x == 2 || y == 20 && x == 3 || y == 20 && x == 4
				|| y == 20 && x == 5) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 21 && x == 0 || y == 21 && x == 1 || y == 21 && x == 2 || y == 21 && x == 3 || y == 21 && x == 4
				|| y == 21 && x == 5) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 22 && x == 0 || y == 22 && x == 1 || y == 22 && x == 2 || y == 22 && x == 3 || y == 22 && x == 4
				|| y == 22 && x == 5) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 23 && x == 0 || y == 23 && x == 1 || y == 23 && x == 2 || y == 23 && x == 3 || y == 23 && x == 4
				|| y == 23 && x == 5) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 24 && x == 0 || y == 24 && x == 1 || y == 24 && x == 2 || y == 24 && x == 3 || y == 24 && x == 4
				|| y == 24 && x == 5) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 18 && x == 18 || y == 18 && x == 20 || y == 18 && x == 21 || y == 18 && x == 22
				|| y == 18 && x == 23) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 19 && x == 18 || y == 19 && x == 19 || y == 18 && x == 20 || y == 18 && x == 21 || y == 18 && x == 22
				|| y == 19 && x == 23) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 20 && x == 18 || y == 20 && x == 19 || y == 20 && x == 20 || y == 20 && x == 21 || y == 20 && x == 22
				|| y == 20 && x == 23) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (

		y == 21 && x == 18 || y == 21 && x == 19 || y == 21 && x == 20 || y == 21 && x == 21 || y == 21 && x == 22
				|| y == 21 && x == 23) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 22 && x == 18 || y == 22 && x == 19 || y == 22 && x == 20 || y == 22 && x == 21 || y == 22 && x == 22
				|| y == 22 && x == 23) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 23 && x == 18 || y == 23 && x == 19 || y == 23 && x == 20 || y == 23 && x == 21 || y == 23 && x == 22
				|| y == 23 && x == 23) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 14 && x == 16 || y == 14 && x == 17 || y == 14 && x == 18 || y == 14 && x == 19 || y == 14 && x == 20
				|| y == 14 && x == 21 || y == 14 && x == 22 || y == 14 && x == 23) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 17 && x == 8 || y == 17 && x == 10 || y == 17 && x == 11 || y == 17 && x == 12 || y == 17 && x == 13
				|| y == 17 && x == 14) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 18 && x == 8 || y == 18 && x == 9 || y == 18 && x == 10 || y == 18 && x == 11 || y == 18 && x == 12
				|| y == 18 && x == 13 || y == 18 && x == 14) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 19 && x == 9 || y == 19 && x == 10 || y == 19 && x == 11 || y == 19 && x == 12 || y == 19 && x == 13
				|| y == 19 && x == 14 || y == 19 && x == 15) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 20 && x == 8 || y == 20 && x == 9 || y == 20 && x == 10 || y == 20 && x == 11 || y == 20 && x == 12
				|| y == 20 && x == 13 || y == 20 && x == 14 || y == 20 && x == 15) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 21 && x == 8 || y == 21 && x == 9 || y == 21 && x == 10 || y == 21 && x == 11 || y == 21 && x == 12
				|| y == 21 && x == 13 || y == 21 && x == 14 || y == 21 && x == 15) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 22 && x == 8 || y == 22 && x == 9 || y == 22 && x == 10 || y == 22 && x == 11 || y == 22 && x == 12
				|| y == 22 && x == 13 || y == 22 && x == 14 || y == 22 && x == 15) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 23 && x == 10 || y == 23 && x == 11 || y == 23 && x == 12 || y == 23 && x == 13) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}
		if (y == 24 && x == 10 || y == 24 && x == 11 || y == 24 && x == 12 || y == 24 && x == 13) {
			System.out.println(" You Shall Not Pass, Move Again");
			return false;
		}

		else {
			return true;
		}
	}

	public void enterRoom(ArrayList<Players> players, int x, int y) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		if (y == 3 && x == 6) {
			System.out.println(" You like to enter Room 323??");
			String choice = in.readLine();
			choice.toLowerCase();
			if (choice.equals("yes") || choice.equals("y")) {
				suggestingInRoom(players,x, y);
			} else {
			}
		}
		if (y == 5 && x == 9 || y == 7 && x == 11 || y == 7 && x == 12) {
			System.out.println(" You like to enter the Bunker??");
			String choice = in.readLine();
			choice.toLowerCase();
			if (choice.equals("yes") || choice.equals("y")) {
				suggestingInRoom(players, x, y);
			} else {

			}
		}
		if (y == 5 && x == 17) {
			System.out.println(" You like to enter Room 209??");
			String choice = in.readLine();
			choice.toLowerCase();
			if (choice.equals("yes") || choice.equals("y")) {
				suggestingInRoom(players, x, y);
			} else {

			}
		}
		if (y == 8 && x == 6 || y == 10 && x == 3) {
			System.out.println(" You like to enter the Teacher Offices??");
			String choice = in.readLine();
			choice.toLowerCase();
			if (choice.equals("yes") || choice.equals("y")) {
				suggestingInRoom(players, x, y);
			} else {

			}
		}
		if (y == 12 && x == 1 || y == 15 && x == 5) {
			System.out.println(" You like to enter Billiard Room??");
			String choice = in.readLine();
			choice.toLowerCase();
			if (choice.equals("yes") || choice.equals("y")) {
				suggestingInRoom(players, x, y);
			} else {
			}
		}
		if (y == 19 && x == 4) {
			System.out.println(" You like to enter Room 010??");
			String choice = in.readLine();
			choice.toLowerCase();
			if (choice.equals("yes") || choice.equals("y")) {
				suggestingInRoom(players, x, y);
			} else {

			}
		}
		if (y == 19 && x == 8 || y == 17 && x == 9 || y == 17 && x == 14 || y == 18 && x == 15) {
			System.out.println(" You like to enter the Financial Offices??");
			String choice = in.readLine();
			choice.toLowerCase();
			if (choice.equals("yes") || choice.equals("y")) {
				suggestingInRoom(players, x, y);
			} else {

			}
		}
		if (y == 19 && x == 19) {
			System.out.println(" You like to enter Admission Office??");
			String choice = in.readLine();
			choice.toLowerCase();
			if (choice.equals("yes") || choice.equals("y")) {
				suggestingInRoom(players, x, y);
			} else {
			}
		}
		if (y == 12 && x == 16 || y == 9 && x == 18) {
			System.out.println(" You like to enter Market??");
			String choice = in.readLine();
			choice.toLowerCase();
			if (choice.equals("yes") || choice.equals("y")) {
				suggestingInRoom(players, x, y);
			} else {
			}

		}

	}

	public void suggestingInRoom(ArrayList<Players> players, int x, int y) throws IOException {

		if (y == 12 && x == 16 || y == 9 && x == 18) {
			callHandClass.promptForSuggestionInMarket(players);
		}
		if (y == 19 && x == 19) {
			callHandClass.promptForSuggestionInAdmission(players);
		}
		if (y == 19 && x == 8 || y == 17 && x == 9 || y == 17 && x == 14 || y == 18 && x == 15) {
			callHandClass.promptForSuggestionInFinance(players);
		}
		if (y == 19 && x == 4) {
			callHandClass.promptForSuggestionInRoom010(players);
		}
		if (y == 12 && x == 1 || y == 15 && x == 5) {
			callHandClass.promptForSuggestionInCommons(players);
		}
		if (y == 8 && x == 6 || y == 10 && x == 3) {
			callHandClass.promptForSuggestionInTeacher(players);
		}
		if (y == 3 && x == 6) {
			callHandClass.promptForSuggestionInRoom323(players);
		}
		if (y == 5 && x == 9 || y == 7 && x == 11 || y == 7 && x == 12) {
			callHandClass.promptForSuggestionInBunker(players);
		}
		if (y == 5 && x == 17) {
			callHandClass.promptForSuggestionInRoom209(players);
		}
	}
	// secret pass
	// cant go in same room twice
	// enter door
	// move into room suggest/or move prompt

	public void display(ArrayList<Players> players) throws IOException {
		// take in array list of players
		boolean printSpace = true;
		for (int row = 0; row < 24; row++) {
			for (int column = 0; column < 25; column++) {
				System.out.print("|");
				printSpace = true;
				for (int i = 0; i < players.size(); i++) {
					if (players.get(i).y == row && players.get(i).x == column) {
						System.out.print(players.get(i).symbol);
						printSpace = false;
					}
				}
				for (int i = 0; i < weaponArray.length; i++) {
					if (weaponArray[i].y == row && weaponArray[i].x == column) {
						System.out.print(weaponArray[i].WeaponSymbol);
						printSpace = false;
					}
				}

				if (printSpace != false) {
					System.out.print(boardlength[row][column]);
				}
			}

			System.out.println();
		}

	}

	public board() {
		for (int line = 0; line < 24; line++) {
			for (int column = 0; column < 25; column++) {
				boardlength[line][column] = "_";
			}
		}
		Weap();
		boardlength[0][0] = " ";
		boardlength[0][1] = "R";
		boardlength[0][2] = "O";
		boardlength[0][3] = "O";
		boardlength[0][4] = "M";
		boardlength[0][5] = " ";
		boardlength[0][6] = "X";
		boardlength[1][0] = " ";
		boardlength[1][1] = "3";
		boardlength[1][2] = "2";
		boardlength[1][3] = "3";
		boardlength[1][4] = " ";
		boardlength[1][5] = " ";
		boardlength[1][6] = " ";
		boardlength[2][0] = " ";
		boardlength[2][1] = " ";
		boardlength[2][2] = " ";
		boardlength[2][3] = " ";
		boardlength[2][4] = " ";
		boardlength[2][5] = " ";
		boardlength[3][6] = "D";
		boardlength[2][6] = " "; // end study
		boardlength[0][8] = "X";
		boardlength[0][9] = " ";
		boardlength[0][10] = " ";
		boardlength[0][11] = " ";
		boardlength[0][12] = " ";
		boardlength[0][13] = " ";
		boardlength[0][14] = " ";
		boardlength[0][15] = "X";
		// boardlength[0][16] = "S"; // place Scarlet
		boardlength[1][9] = " ";
		boardlength[1][10] = " ";
		boardlength[1][11] = " ";
		boardlength[1][12] = " ";
		boardlength[1][13] = " ";
		boardlength[1][14] = " ";
		boardlength[2][9] = " ";
		boardlength[2][10] = " ";
		boardlength[2][11] = " ";
		boardlength[2][12] = " ";
		boardlength[2][13] = " ";
		boardlength[2][14] = " ";
		boardlength[3][9] = "B";
		boardlength[3][10] = "U";
		boardlength[3][11] = "N";
		boardlength[3][12] = "K";
		boardlength[3][13] = "E";
		boardlength[3][14] = "R";
		boardlength[4][9] = " ";
		boardlength[4][10] = " ";
		boardlength[4][11] = " ";
		boardlength[4][12] = " ";
		boardlength[4][13] = " ";
		boardlength[4][14] = " ";
		// boardlength[5][0] = "P"; // place Plum
		boardlength[5][9] = "D";
		boardlength[5][10] = " ";
		boardlength[5][11] = " ";
		boardlength[5][12] = " ";
		boardlength[5][13] = " ";
		boardlength[5][14] = " ";
		boardlength[6][9] = " ";
		boardlength[6][10] = " ";
		boardlength[6][11] = " ";
		boardlength[6][12] = " ";
		boardlength[6][13] = " ";
		boardlength[7][11] = "D";
		boardlength[7][12] = "D";
		boardlength[6][14] = " ";// end hall
		boardlength[0][17] = "X";// lounge
		boardlength[0][18] = " ";
		boardlength[5][17] = "D";
		boardlength[0][19] = " ";
		boardlength[0][20] = " ";
		boardlength[8][6] = "D";
		boardlength[10][3] = "D";
		boardlength[12][1] = "D";
		boardlength[15][5] = "D";
		boardlength[19][4] = "D";
		boardlength[19][8] = "D";
		boardlength[17][9] = "D";
		boardlength[17][14] = "D";
		boardlength[18][15] = "D";
		boardlength[19][19] = "D";
		boardlength[11][16] = "D";
		boardlength[9][18] = "D";
		boardlength[0][21] = " ";
		boardlength[0][22] = " ";
		boardlength[0][23] = " ";
		boardlength[0][24] = " ";
		boardlength[1][17] = " ";
		boardlength[1][18] = " ";
		boardlength[1][19] = " ";
		boardlength[1][20] = " ";
		boardlength[1][21] = " ";
		boardlength[1][22] = " ";
		boardlength[1][23] = " ";
		boardlength[1][24] = " ";
		boardlength[2][17] = " ";
		boardlength[2][18] = " ";
		boardlength[2][19] = " ";
		boardlength[2][20] = " ";
		boardlength[2][21] = " ";
		boardlength[2][22] = " ";
		boardlength[2][23] = " ";
		boardlength[2][24] = " ";
		boardlength[3][17] = " ";
		boardlength[3][18] = "R";
		boardlength[3][19] = "O";
		boardlength[3][20] = "O";
		boardlength[3][21] = "M";
		boardlength[3][22] = " ";
		boardlength[3][23] = " ";
		boardlength[3][24] = " ";
		boardlength[4][17] = " ";
		boardlength[4][18] = "2";
		boardlength[4][19] = "0";
		boardlength[4][20] = "9";
		boardlength[4][21] = " ";
		boardlength[4][22] = " ";
		boardlength[4][23] = " ";
		boardlength[4][24] = " "; // end lounge
		boardlength[4][0] = "X";
		boardlength[6][0] = "X";
		boardlength[6][1] = " ";
		boardlength[6][2] = " ";
		boardlength[6][3] = " ";
		boardlength[6][4] = " ";
		boardlength[6][5] = " ";
		boardlength[7][0] = " ";
		boardlength[7][1] = " ";
		boardlength[7][2] = " ";
		boardlength[7][3] = " ";
		boardlength[7][4] = " ";
		boardlength[7][5] = " ";
		boardlength[7][6] = " ";
		boardlength[8][0] = "T";
		boardlength[8][1] = "E";
		boardlength[8][2] = "A";
		boardlength[8][3] = "C";
		boardlength[8][4] = "H";
		boardlength[8][5] = "E";
		boardlength[8][6] = "R";
		boardlength[9][0] = "O";
		boardlength[9][1] = "F";
		boardlength[9][2] = "F";
		boardlength[9][3] = "I";
		boardlength[9][4] = "C";
		boardlength[9][5] = "E";
		boardlength[10][0] = "X"; // end Lbrary
		// boardlength[7][24] = "M"; // place mustard
		boardlength[11][0] = "X";
		boardlength[12][0] = " ";
		boardlength[12][1] = " ";
		boardlength[12][2] = " ";
		boardlength[12][3] = " ";
		boardlength[12][4] = " ";
		boardlength[12][5] = " ";
		boardlength[13][0] = "C";
		boardlength[13][1] = "O";
		boardlength[13][2] = "M";
		boardlength[13][3] = "M";
		boardlength[13][4] = "O";
		boardlength[13][5] = "N";
		boardlength[14][0] = "S";
		boardlength[14][1] = " ";
		boardlength[14][2] = " ";
		boardlength[14][3] = " ";
		boardlength[14][4] = " ";
		boardlength[14][5] = " ";
		boardlength[15][0] = " ";
		boardlength[15][1] = " ";
		boardlength[15][2] = " ";
		boardlength[15][3] = " ";
		boardlength[15][4] = " ";
		boardlength[15][5] = " "; // end billiard
		boardlength[17][0] = "X";
		boardlength[19][0] = "X";
		// boardlength[18][0] = "E"; // place Peacock
		boardlength[19][1] = " ";
		boardlength[19][2] = " ";
		boardlength[19][3] = " ";
		boardlength[19][4] = " ";
		boardlength[20][0] = "R";
		boardlength[20][1] = "O";
		boardlength[20][2] = "O";
		boardlength[20][3] = "M";
		boardlength[20][4] = " ";
		boardlength[20][5] = " ";
		boardlength[21][0] = "0";
		boardlength[21][1] = "1";
		boardlength[21][2] = "0";
		boardlength[21][3] = " ";
		boardlength[21][4] = " ";
		boardlength[21][5] = " ";
		boardlength[22][0] = " ";
		boardlength[22][1] = " ";
		boardlength[22][2] = " ";
		boardlength[22][3] = " ";
		boardlength[22][4] = " ";
		boardlength[22][5] = " ";
		boardlength[23][0] = " ";
		boardlength[23][1] = " ";
		boardlength[23][2] = " ";
		boardlength[23][3] = " ";
		boardlength[23][4] = " ";
		boardlength[23][5] = " ";
		boardlength[23][6] = "X";
		boardlength[23][10] = " ";
		boardlength[23][11] = " ";
		boardlength[23][12] = " ";
		boardlength[23][13] = " ";
		boardlength[22][10] = " ";
		boardlength[22][11] = " ";
		boardlength[22][12] = " ";
		boardlength[22][13] = " ";
		boardlength[21][8] = " ";
		boardlength[21][9] = " ";
		boardlength[21][10] = " ";
		boardlength[21][11] = " ";
		boardlength[21][12] = " ";
		boardlength[21][13] = " ";
		boardlength[21][14] = " ";
		boardlength[21][15] = " ";
		boardlength[20][8] = "O";
		boardlength[20][9] = "F";
		boardlength[20][10] = "F";
		boardlength[20][11] = "I";
		boardlength[20][12] = "C";
		boardlength[20][13] = "E";
		boardlength[20][14] = " ";
		boardlength[20][15] = " ";
		boardlength[19][8] = " ";
		boardlength[19][9] = " ";
		boardlength[19][10] = " ";
		boardlength[19][11] = " ";
		boardlength[19][12] = " ";
		boardlength[19][13] = " ";
		boardlength[19][14] = " ";
		boardlength[19][15] = " ";
		boardlength[18][8] = "F";
		boardlength[18][9] = "I";
		boardlength[18][10] = "N";
		boardlength[18][11] = "A";
		boardlength[18][12] = "N";
		boardlength[18][13] = "C";
		boardlength[18][14] = "E";
		boardlength[18][15] = " ";
		boardlength[17][8] = " ";
		boardlength[17][9] = " ";
		boardlength[17][10] = " ";
		boardlength[17][11] = " ";
		boardlength[17][12] = " ";
		boardlength[17][13] = " ";
		boardlength[17][14] = " ";
		boardlength[17][15] = " "; // end ballroom
		boardlength[23][17] = "X";
		boardlength[23][18] = " ";
		boardlength[23][19] = " ";
		boardlength[23][20] = " ";
		boardlength[23][21] = " ";
		boardlength[23][22] = " ";
		boardlength[23][23] = " ";
		boardlength[23][24] = " ";
		boardlength[22][18] = " ";
		boardlength[22][19] = " ";
		boardlength[22][20] = " ";
		boardlength[22][21] = " ";
		boardlength[22][22] = " ";
		boardlength[22][23] = " ";
		boardlength[22][24] = " ";
		boardlength[21][18] = "O";
		boardlength[21][19] = "F";
		boardlength[21][20] = "F";
		boardlength[21][21] = "I";
		boardlength[21][22] = "C";
		boardlength[21][23] = "E";
		boardlength[21][24] = " ";
		boardlength[20][18] = "I";
		boardlength[20][19] = "O";
		boardlength[20][20] = "N";
		boardlength[20][21] = " ";
		boardlength[20][22] = " ";
		boardlength[20][23] = " ";
		boardlength[20][24] = " ";
		boardlength[19][18] = "A";
		boardlength[19][19] = "D";
		boardlength[19][20] = "M";
		boardlength[19][21] = "I";
		boardlength[19][22] = "S";
		boardlength[19][23] = "S";
		boardlength[19][24] = "-";
		boardlength[18][18] = " ";
		boardlength[18][19] = " ";
		boardlength[18][20] = " ";
		boardlength[18][21] = " ";
		boardlength[18][22] = " ";
		boardlength[18][23] = " ";
		boardlength[18][24] = " "; // end kitchen
		// boardlength[23][9] = "G"; // place Green
		boardlength[16][24] = "X";
		boardlength[23][23] = " ";
		boardlength[15][24] = " ";
		boardlength[13][16] = " ";
		boardlength[13][17] = " ";
		boardlength[13][18] = " ";
		boardlength[13][19] = " ";
		boardlength[13][20] = " ";
		boardlength[13][21] = " ";
		boardlength[13][22] = " ";
		boardlength[13][23] = " ";
		boardlength[13][24] = " ";
		boardlength[14][20] = " ";
		boardlength[14][21] = " ";
		boardlength[14][22] = " ";
		boardlength[14][23] = " ";
		boardlength[14][24] = " ";
		boardlength[12][16] = "M";
		boardlength[12][17] = "A";
		boardlength[12][18] = "R";
		boardlength[12][19] = "K";
		boardlength[12][20] = "E";
		boardlength[12][21] = "T";
		boardlength[12][22] = " ";
		boardlength[12][23] = " ";
		boardlength[12][24] = " ";
		boardlength[11][16] = " ";
		boardlength[11][17] = " ";
		boardlength[11][18] = " ";
		boardlength[11][19] = " ";
		boardlength[11][20] = " ";
		boardlength[11][21] = " ";
		boardlength[11][22] = " ";
		boardlength[11][23] = " ";
		boardlength[11][24] = " ";
		boardlength[10][16] = " ";
		boardlength[10][17] = " ";
		boardlength[10][18] = " ";
		boardlength[10][19] = " ";
		boardlength[10][20] = " ";
		boardlength[10][21] = " ";
		boardlength[10][22] = " ";
		boardlength[10][23] = " ";
		boardlength[10][24] = " ";
		boardlength[9][16] = " ";
		boardlength[9][17] = " ";
		boardlength[9][18] = " ";
		boardlength[9][19] = " ";
		boardlength[9][20] = " ";
		boardlength[9][21] = " ";
		boardlength[9][22] = " ";
		boardlength[9][23] = " ";
		boardlength[9][24] = " "; // end dining room
		boardlength[9][9] = " "; // center
		// boardlength[23][14] = "W"; // place White
		boardlength[9][10] = " ";
		boardlength[9][11] = " ";
		boardlength[9][12] = " ";
		boardlength[9][13] = " ";
		boardlength[10][9] = " ";
		boardlength[10][10] = " ";
		boardlength[10][11] = " ";
		boardlength[10][12] = " ";
		boardlength[10][13] = " ";
		boardlength[11][9] = " ";
		boardlength[11][10] = " ";
		boardlength[11][11] = " ";
		boardlength[11][12] = " ";
		boardlength[11][13] = " ";
		boardlength[12][9] = " ";
		boardlength[12][10] = " ";
		boardlength[12][11] = " ";
		boardlength[12][12] = " ";
		boardlength[12][13] = " ";
		boardlength[13][9] = " ";
		boardlength[13][10] = " ";
		boardlength[13][11] = " ";
		boardlength[13][12] = " ";
		boardlength[13][13] = " ";
		boardlength[14][9] = " ";
		boardlength[14][10] = " ";
		boardlength[14][11] = " ";
		boardlength[14][12] = " ";
		boardlength[14][13] = " "; // end center
	}

}
