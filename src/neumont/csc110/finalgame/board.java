package neumont.csc110.finalgame;

import java.io.IOException;

public class board {
	String[][] boardlength = new String[24][25];

	public void Movement(String symbol, int x, int y) throws IOException {

		dice roll = new dice();
		int diceRoll = 0;
		int rollChange = roll.diceRoll();

		do {

			String[] direction = { "up", "down", "left", "right" };
			int move = ConsoleUI.promptForMenuSelection(direction, false);
			if (move == 1) {

				y--;

				boolean check = check(x, y);

				if (check != true) {
					y++;
					display(symbol, x, y);
					diceRoll--;
				}

				else {
					display(symbol, x, y);
					diceRoll++;
				}

			}

			if (move == 2) {

				y++;

				boolean badIn = check(x, y);

				if (badIn != true) {
					y--;
					display(symbol, x, y);
					diceRoll--;
				}

				else {
					display(symbol, x, y);
					diceRoll++;
				}
			}

			if (move == 3) {

				x--;

				boolean badIn = check(x, y);

				if (badIn != true) {
					x++;
					display(symbol, x, y);
					diceRoll--;
				}

				else {
					display(symbol, x, y);
					diceRoll++;
				}
			}

			if (move == 4) {

				x++;

				boolean badIn = check(x, y);

				if (badIn != true) {
					x--;
					display(symbol, x, y);
					diceRoll--;
				}

				else {
					display(symbol, x, y);
					diceRoll++;
				}
			}

		} while (diceRoll < rollChange);

	}

	public boolean check(int x,int y) {
		if (x < 0) {
			System.out.println("cant move there");

			return false;
		}

		if (x > 23) {
			System.out.println("cant move there");

			return false;
		} 
		// secret pass
		// cant go in same room twice
		// enter door
		// move into room suggest/or move prompt

		if (y < 0) {
			System.out.println("cant move there");
			return false;
		}
		if (y > 24) {
			System.out.println("cant move there");
			return false;
		} else {
			return true;
		}
		
	}
	

	public void display(String symbol, int x, int y) throws IOException {

		for (int row = 0; row < 24; row++) {
			for (int column = 0; column < 25; column++) {

				System.out.print("|");
				if (y != row || x != column) {
					System.out.print(boardlength[row][column]);
				} else {
					System.out.print(symbol);
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
		boardlength[0][0] = " ";
		boardlength[0][1] = " ";
		boardlength[0][2] = " ";
		boardlength[0][3] = " ";
		boardlength[0][4] = " ";
		boardlength[0][5] = " ";
		boardlength[0][6] = "X";
		boardlength[1][0] = " ";
		boardlength[1][1] = "S";
		boardlength[1][2] = "t";
		boardlength[1][3] = "u";
		boardlength[1][4] = "d";
		boardlength[1][5] = "y";
		boardlength[1][6] = " ";
		boardlength[2][0] = " ";
		boardlength[2][1] = " ";
		boardlength[2][2] = " ";
		boardlength[2][3] = " ";
		boardlength[2][4] = " ";
		boardlength[2][5] = " ";
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
		boardlength[3][9] = " ";
		boardlength[3][10] = "H";
		boardlength[3][11] = "a";
		boardlength[3][12] = "l";
		boardlength[3][13] = "l";
		boardlength[3][14] = " ";
		boardlength[4][9] = " ";
		boardlength[4][10] = " ";
		boardlength[4][11] = " ";
		boardlength[4][12] = " ";
		boardlength[4][13] = " ";
		boardlength[4][14] = " ";
		// boardlength[5][0] = "P"; // place Plum
		boardlength[5][9] = " ";
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
		boardlength[6][14] = " ";// end hall
		boardlength[0][17] = "X";// lounge
		boardlength[0][18] = " ";
		boardlength[0][19] = " ";
		boardlength[0][20] = " ";
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
		boardlength[3][18] = "L";
		boardlength[3][19] = "o";
		boardlength[3][20] = "u";
		boardlength[3][21] = "n";
		boardlength[3][22] = "g";
		boardlength[3][23] = "e";
		boardlength[3][24] = " ";
		boardlength[4][17] = " ";
		boardlength[4][18] = " ";
		boardlength[4][19] = " ";
		boardlength[4][20] = " ";
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
		boardlength[8][0] = "L";
		boardlength[8][1] = "i";
		boardlength[8][2] = "b";
		boardlength[8][3] = "r";
		boardlength[8][4] = "a";
		boardlength[8][5] = "r";
		boardlength[8][6] = "y";
		boardlength[9][0] = " ";
		boardlength[9][1] = " ";
		boardlength[9][2] = " ";
		boardlength[9][3] = " ";
		boardlength[9][4] = " ";
		boardlength[9][5] = " ";
		boardlength[10][0] = "X"; // end Lbrary
		// boardlength[7][24] = "M"; // place mustard
		boardlength[11][0] = "X";
		boardlength[12][0] = " ";
		boardlength[12][1] = " ";
		boardlength[12][2] = " ";
		boardlength[12][3] = " ";
		boardlength[12][4] = " ";
		boardlength[12][5] = " ";
		boardlength[13][0] = "B";
		boardlength[13][1] = "i";
		boardlength[13][2] = "l";
		boardlength[13][3] = "l";
		boardlength[13][4] = "i";
		boardlength[13][5] = "a";
		boardlength[14][0] = "r";
		boardlength[14][1] = "d";
		boardlength[14][2] = "s";
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
		boardlength[20][0] = "C";
		boardlength[20][1] = "o";
		boardlength[20][2] = "n";
		boardlength[20][3] = "s";
		boardlength[20][4] = "e";
		boardlength[20][5] = "r";
		boardlength[21][0] = "v";
		boardlength[21][1] = "a";
		boardlength[21][2] = "t";
		boardlength[21][3] = "o";
		boardlength[21][4] = "r";
		boardlength[21][5] = "y";
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
		boardlength[20][8] = " ";
		boardlength[20][9] = " ";
		boardlength[20][10] = " ";
		boardlength[20][11] = " ";
		boardlength[20][12] = " ";
		boardlength[20][13] = " ";
		boardlength[20][14] = " ";
		boardlength[20][15] = " ";
		boardlength[19][8] = "B";
		boardlength[19][9] = "a";
		boardlength[19][10] = "l";
		boardlength[19][11] = "l";
		boardlength[19][12] = "r";
		boardlength[19][13] = "o";
		boardlength[19][14] = "o";
		boardlength[19][15] = "m";
		boardlength[18][8] = " ";
		boardlength[18][9] = " ";
		boardlength[18][10] = " ";
		boardlength[18][11] = " ";
		boardlength[18][12] = " ";
		boardlength[18][13] = " ";
		boardlength[18][14] = " ";
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
		boardlength[21][18] = " ";
		boardlength[21][19] = " ";
		boardlength[21][20] = " ";
		boardlength[21][21] = " ";
		boardlength[21][22] = " ";
		boardlength[21][23] = " ";
		boardlength[21][24] = " ";
		boardlength[20][18] = "K";
		boardlength[20][19] = "i";
		boardlength[20][20] = "t";
		boardlength[20][21] = "c";
		boardlength[20][22] = "h";
		boardlength[20][23] = "e";
		boardlength[20][24] = "n";
		boardlength[19][18] = " ";
		boardlength[19][19] = " ";
		boardlength[19][20] = " ";
		boardlength[19][21] = " ";
		boardlength[19][22] = " ";
		boardlength[19][23] = " ";
		boardlength[19][24] = " ";
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
		boardlength[12][16] = "D";
		boardlength[12][17] = "i";
		boardlength[12][18] = "n";
		boardlength[12][19] = "i";
		boardlength[12][20] = "n";
		boardlength[12][21] = "g";
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
