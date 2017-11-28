package neumont.csc110.finalgame;

import java.io.IOException;

public class board {
	String[][] boardlength = new String[24][25];

	public void room() {

	}

	public void Movement() throws IOException {
		dice roll = new dice();

		int diceRoll = 0;
		int rollChange = roll.roll();
		do {
			String[] direction = { "up", "down", "left", "right" };
			int move = ConsoleUI.promptForMenuSelection(direction, false);
			if (move == 1) {

				diceRoll++;
			}
			if (move == 2) {
				diceRoll++;
			}
			if (move == 3) {
				diceRoll++;
			}
			if (move == 4) {
				diceRoll++;
			}

		} while (diceRoll < rollChange);

	}

	public void SecondaryMove() {
		// secret pass
		// cant go in same room twice
		// enter door
		// move into room suggest/or move prompt

	}

	public void Board() {

		for (int line = 0; line < 24; line++) {
			for (int column = 0; column < 25; column++) {

				System.out.print("|");
				boardlength[line][column] = "_";

				if (boardlength[0][0] == "_") { // study
					boardlength[0][0] = " ";
				}
				if (boardlength[0][1] == "_") {
					boardlength[0][1] = " ";
				}
				if (boardlength[0][2] == "_") {
					boardlength[0][2] = " ";
				}
				if (boardlength[0][3] == "_") {
					boardlength[0][3] = " ";
				}
				if (boardlength[0][4] == "_") {
					boardlength[0][4] = " ";
				}
				if (boardlength[0][5] == "_") {
					boardlength[0][5] = " ";
				}
				if (boardlength[0][6] == "_") {
					boardlength[0][6] = "X";
				}
				if (boardlength[1][0] == "_") {
					boardlength[1][0] = " ";
				}
				if (boardlength[1][1] == "_") {
					boardlength[1][1] = "S";
				}
				if (boardlength[1][2] == "_") {
					boardlength[1][2] = "t";
				}
				if (boardlength[1][3] == "_") {
					boardlength[1][3] = "u";
				}
				if (boardlength[1][4] == "_") {
					boardlength[1][4] = "d";
				}
				if (boardlength[1][5] == "_") {
					boardlength[1][5] = "y";
				}
				if (boardlength[1][6] == "_") {
					boardlength[1][6] = " ";
				}
				if (boardlength[2][0] == "_") {
					boardlength[2][0] = " ";
				}
				if (boardlength[2][1] == "_") {
					boardlength[2][1] = " ";
				}
				if (boardlength[2][2] == "_") {
					boardlength[2][2] = " ";
				}
				if (boardlength[2][3] == "_") {
					boardlength[2][3] = " ";
				}
				if (boardlength[2][4] == "_") {
					boardlength[2][4] = " ";
				}
				if (boardlength[2][5] == "_") {
					boardlength[2][5] = " ";
				}
				if (boardlength[2][6] == "_") {
					boardlength[2][6] = " "; // end study
				}
				if (boardlength[0][8] == "_") {// hall
					boardlength[0][8] = "X";
				}
				if (boardlength[0][9] == "_") {
					boardlength[0][9] = " ";
				}
				if (boardlength[0][10] == "_") {
					boardlength[0][10] = " ";
				}
				if (boardlength[0][11] == "_") {
					boardlength[0][11] = " ";
				}
				if (boardlength[0][12] == "_") {
					boardlength[0][12] = " ";
				}
				if (boardlength[0][13] == "_") {
					boardlength[0][13] = " ";
				}
				if (boardlength[0][14] == "_") {
					boardlength[0][14] = " ";
				}
				if (boardlength[0][15] == "_") {
					boardlength[0][15] = "X";
				}
				if (boardlength[1][9] == "_") {
					boardlength[1][9] = " ";
				}
				if (boardlength[1][10] == "_") {
					boardlength[1][10] = " ";
				}
				if (boardlength[1][11] == "_") {
					boardlength[1][11] = " ";
				}
				if (boardlength[1][12] == "_") {
					boardlength[1][12] = " ";
				}
				if (boardlength[1][13] == "_") {
					boardlength[1][13] = " ";
				}
				if (boardlength[1][14] == "_") {
					boardlength[1][14] = " ";
				}
				if (boardlength[2][9] == "_") {
					boardlength[2][9] = " ";
				}
				if (boardlength[2][10] == "_") {
					boardlength[2][10] = " ";
				}
				if (boardlength[2][11] == "_") {
					boardlength[2][11] = " ";
				}
				if (boardlength[2][12] == "_") {
					boardlength[2][12] = " ";
				}
				if (boardlength[2][13] == "_") {
					boardlength[2][13] = " ";
				}
				if (boardlength[2][14] == "_") {
					boardlength[2][14] = " ";
				}
				if (boardlength[3][9] == "_") {
					boardlength[3][9] = " ";
				}
				if (boardlength[3][10] == "_") {
					boardlength[3][10] = "H";
				}
				if (boardlength[3][11] == "_") {
					boardlength[3][11] = "a";
				}
				if (boardlength[3][12] == "_") {
					boardlength[3][12] = "l";
				}
				if (boardlength[3][13] == "_") {
					boardlength[3][13] = "l";
				}
				if (boardlength[3][14] == "_") {
					boardlength[3][14] = " ";
				}
				if (boardlength[4][9] == "_") {
					boardlength[4][9] = " ";
				}
				if (boardlength[4][10] == "_") {
					boardlength[4][10] = " ";
				}
				if (boardlength[4][11] == "_") {
					boardlength[4][11] = " ";
				}
				if (boardlength[4][12] == "_") {
					boardlength[4][12] = " ";
				}
				if (boardlength[4][13] == "_") {
					boardlength[4][13] = " ";
				}
				if (boardlength[4][14] == "_") {
					boardlength[4][14] = " ";
				}
				if (boardlength[5][9] == "_") {
					boardlength[5][9] = " ";
				}
				if (boardlength[5][10] == "_") {
					boardlength[5][10] = " ";
				}
				if (boardlength[5][11] == "_") {
					boardlength[5][11] = " ";
				}
				if (boardlength[5][12] == "_") {
					boardlength[5][12] = " ";
				}
				if (boardlength[5][13] == "_") {
					boardlength[5][13] = " ";
				}

				if (boardlength[5][14] == "_") {
					boardlength[5][14] = " ";
				}
				if (boardlength[6][9] == "_") {
					boardlength[6][9] = " ";
				}
				if (boardlength[6][10] == "_") {
					boardlength[6][10] = " ";
				}
				if (boardlength[6][11] == "_") {
					boardlength[6][11] = " ";
				}
				if (boardlength[6][12] == "_") {
					boardlength[6][12] = " ";
				}
				if (boardlength[6][13] == "_") {
					boardlength[6][13] = " ";
				}
				if (boardlength[6][14] == "_") {
					boardlength[6][14] = " ";// end hall
				}
				if (boardlength[0][17] == "_") {
					boardlength[0][17] = "X";// lounge
				}
				if (boardlength[0][18] == "_") {
					boardlength[0][18] = " ";
				}

				if (boardlength[0][19] == "_") {
					boardlength[0][19] = " ";
				}
				if (boardlength[0][20] == "_") {
					boardlength[0][20] = " ";
				}
				if (boardlength[0][21] == "_") {
					boardlength[0][21] = " ";
				}
				if (boardlength[0][22] == "_") {
					boardlength[0][22] = " ";
				}
				if (boardlength[0][23] == "_") {
					boardlength[0][23] = " ";
				}
				if (boardlength[0][24] == "_") {
					boardlength[0][24] = " ";
				}
				if (boardlength[1][17] == "_") {
					boardlength[1][17] = " ";
				}
				if (boardlength[1][18] == "_") {
					boardlength[1][18] = " ";
				}
				if (boardlength[1][19] == "_") {
					boardlength[1][19] = " ";
				}
				if (boardlength[1][20] == "_") {
					boardlength[1][20] = " ";
				}
				if (boardlength[1][21] == "_") {
					boardlength[1][21] = " ";
				}
				if (boardlength[1][22] == "_") {
					boardlength[1][22] = " ";
				}
				if (boardlength[1][23] == "_") {
					boardlength[1][23] = " ";
				}
				if (boardlength[1][24] == "_") {
					boardlength[1][24] = " ";
				}
				if (boardlength[2][17] == "_") {
					boardlength[2][17] = " ";
				}
				if (boardlength[2][18] == "_") {
					boardlength[2][18] = " ";
				}
				if (boardlength[2][19] == "_") {
					boardlength[2][19] = " ";
				}
				if (boardlength[2][20] == "_") {
					boardlength[2][20] = " ";
				}
				if (boardlength[2][21] == "_") {
					boardlength[2][21] = " ";
				}
				if (boardlength[2][22] == "_") {
					boardlength[2][22] = " ";
				}
				if (boardlength[2][23] == "_") {
					boardlength[2][23] = " ";
				}
				if (boardlength[2][24] == "_") {
					boardlength[2][24] = " ";
				}
				if (boardlength[3][17] == "_") {
					boardlength[3][17] = " ";
				}
				if (boardlength[3][18] == "_") {
					boardlength[3][18] = "L";
				}
				if (boardlength[3][19] == "_") {
					boardlength[3][19] = "o";
				}
				if (boardlength[3][20] == "_") {
					boardlength[3][20] = "u";
				}
				if (boardlength[3][21] == "_") {
					boardlength[3][21] = "n";
				}
				if (boardlength[3][22] == "_") {
					boardlength[3][22] = "g";
				}
				if (boardlength[3][23] == "_") {
					boardlength[3][23] = "e";
				}
				if (boardlength[3][24] == "_") {
					boardlength[3][24] = " ";
				}
				if (boardlength[4][17] == "_") {
					boardlength[4][17] = " ";
				}
				if (boardlength[4][18] == "_") {
					boardlength[4][18] = " ";
				}
				if (boardlength[4][19] == "_") {
					boardlength[4][19] = " ";
				}
				if (boardlength[4][20] == "_") {
					boardlength[4][20] = " ";
				}
				if (boardlength[4][21] == "_") {
					boardlength[4][21] = " ";
				}
				if (boardlength[4][22] == "_") {
					boardlength[4][22] = " ";
				}
				if (boardlength[4][23] == "_") {
					boardlength[4][23] = " ";
				}
				if (boardlength[4][24] == "_") {
					boardlength[4][24] = " "; // end lounge
				}
				if (boardlength[4][0] == "_") {
					boardlength[4][0] = "X";
				}
				if (boardlength[6][0] == "_") {
					boardlength[6][0] = "X";
				}
				if (boardlength[6][1] == "_") {
					boardlength[6][1] = " ";
				}
				if (boardlength[6][2] == "_") {
					boardlength[6][2] = " ";
				}
				if (boardlength[6][3] == "_") {
					boardlength[6][3] = " ";
				}
				if (boardlength[6][4] == "_") {
					boardlength[6][4] = " ";
				}
				if (boardlength[6][5] == "_") {
					boardlength[6][5] = " ";
				}
				if (boardlength[7][0] == "_") {
					boardlength[7][0] = " ";
				}
				if (boardlength[7][1] == "_") {
					boardlength[7][1] = " ";
				}
				if (boardlength[7][2] == "_") {
					boardlength[7][2] = " ";
				}
				if (boardlength[7][3] == "_") {
					boardlength[7][3] = " ";
				}
				if (boardlength[7][4] == "_") {
					boardlength[7][4] = " ";
				}
				if (boardlength[7][5] == "_") {
					boardlength[7][5] = " ";
				}
				if (boardlength[7][6] == "_") {
					boardlength[7][6] = " ";
				}
				if (boardlength[8][0] == "_") {
					boardlength[8][0] = "L";
				}
				if (boardlength[8][1] == "_") {
					boardlength[8][1] = "i";
				}
				if (boardlength[8][2] == "_") {
					boardlength[8][2] = "b";
				}
				if (boardlength[8][3] == "_") {
					boardlength[8][3] = "r";
				}
				if (boardlength[8][4] == "_") {
					boardlength[8][4] = "a";
				}
				if (boardlength[8][5] == "_") {
					boardlength[8][5] = "r";
				}
				if (boardlength[8][6] == "_") {
					boardlength[8][6] = "y";
				}
				if (boardlength[9][0] == "_") {
					boardlength[9][0] = " ";
				}
				if (boardlength[9][1] == "_") {
					boardlength[9][1] = " ";
				}
				if (boardlength[9][2] == "_") {
					boardlength[9][2] = " ";
				}
				if (boardlength[9][3] == "_") {
					boardlength[9][3] = " ";
				}
				if (boardlength[9][4] == "_") {
					boardlength[9][4] = " ";
				}
				if (boardlength[9][5] == "_") {
					boardlength[9][5] = " ";
				}

				if (boardlength[10][0] == "_") {
					boardlength[10][0] = "X"; // end Lbrary
				}
				if (boardlength[11][0] == "_") {
					boardlength[11][0] = "X";
				}
				if (boardlength[12][0] == "_") { // billiards
					boardlength[12][0] = " ";
				}
				if (boardlength[12][1] == "_") {
					boardlength[12][1] = " ";
				}
				if (boardlength[12][2] == "_") {
					boardlength[12][2] = " ";
				}
				if (boardlength[12][3] == "_") {
					boardlength[12][3] = " ";
				}
				if (boardlength[12][4] == "_") {
					boardlength[12][4] = " ";
				}
				if (boardlength[12][5] == "_") {
					boardlength[12][5] = " ";
				}
				if (boardlength[13][0] == "_") {
					boardlength[13][0] = "B";
				}
				if (boardlength[13][1] == "_") {
					boardlength[13][1] = "i";
				}
				if (boardlength[13][2] == "_") {
					boardlength[13][2] = "l";
				}
				if (boardlength[13][3] == "_") {
					boardlength[13][3] = "l";
				}
				if (boardlength[13][4] == "_") {
					boardlength[13][4] = "i";
				}
				if (boardlength[13][5] == "_") {
					boardlength[13][5] = "a";
				}
				if (boardlength[14][0] == "_") {
					boardlength[14][0] = "r";
				}
				if (boardlength[14][1] == "_") {
					boardlength[14][1] = "d";
				}
				if (boardlength[14][2] == "_") {
					boardlength[14][2] = "s";
				}
				if (boardlength[14][3] == "_") {
					boardlength[14][3] = " ";
				}
				if (boardlength[14][4] == "_") {
					boardlength[14][4] = " ";
				}
				if (boardlength[14][5] == "_") {
					boardlength[14][5] = " ";
				}
				if (boardlength[15][0] == "_") {
					boardlength[15][0] = " ";
				}
				if (boardlength[15][1] == "_") {
					boardlength[15][1] = " ";
				}
				if (boardlength[15][2] == "_") {
					boardlength[15][2] = " ";
				}
				if (boardlength[15][3] == "_") {
					boardlength[15][3] = " ";
				}
				if (boardlength[15][4] == "_") {
					boardlength[15][4] = " ";
				}
				if (boardlength[15][5] == "_") {
					boardlength[15][5] = " "; // end billiard
				}
				if (boardlength[17][0] == "_") {
					boardlength[17][0] = "X";
				}
				if (boardlength[19][0] == "_") {
					boardlength[19][0] = "X";
				}
				if (boardlength[19][1] == "_") {
					boardlength[19][1] = " ";
				}
				if (boardlength[19][2] == "_") {
					boardlength[19][2] = " ";
				}
				if (boardlength[19][3] == "_") {
					boardlength[19][3] = " ";
				}
				if (boardlength[19][4] == "_") {
					boardlength[19][4] = " ";
				}
				if (boardlength[20][0] == "_") {
					boardlength[20][0] = "C";
				}
				if (boardlength[20][1] == "_") {
					boardlength[20][1] = "o";
				}
				if (boardlength[20][2] == "_") {
					boardlength[20][2] = "n";
				}
				if (boardlength[20][3] == "_") {
					boardlength[20][3] = "s";
				}
				if (boardlength[20][4] == "_") {
					boardlength[20][4] = "e";
				}
				if (boardlength[20][5] == "_") {
					boardlength[20][5] = "r";
				}
				if (boardlength[21][0] == "_") {
					boardlength[21][0] = "v";
				}
				if (boardlength[21][1] == "_") {
					boardlength[21][1] = "a";
				}
				if (boardlength[21][2] == "_") {
					boardlength[21][2] = "t";
				}
				if (boardlength[21][3] == "_") {
					boardlength[21][3] = "o";
				}
				if (boardlength[21][4] == "_") {
					boardlength[21][4] = "r";
				}
				if (boardlength[21][5] == "_") {
					boardlength[21][5] = "y";
				}
				if (boardlength[22][0] == "_") {
					boardlength[22][0] = " ";
				}
				if (boardlength[22][1] == "_") {
					boardlength[22][1] = " ";
				}
				if (boardlength[22][2] == "_") {
					boardlength[22][2] = " ";
				}
				if (boardlength[22][3] == "_") {
					boardlength[22][3] = " ";
				}
				if (boardlength[22][4] == "_") {
					boardlength[22][4] = " ";
				}
				if (boardlength[22][5] == "_") {
					boardlength[22][5] = " ";
				}
				if (boardlength[23][0] == "_") {
					boardlength[23][0] = " ";
				}
				if (boardlength[23][1] == "_") {
					boardlength[23][1] = " ";
				}
				if (boardlength[23][2] == "_") {
					boardlength[23][2] = " ";
				}
				if (boardlength[23][3] == "_") {
					boardlength[23][3] = " ";
				}
				if (boardlength[23][4] == "_") {
					boardlength[23][4] = " ";
				}
				if (boardlength[23][5] == "_") {
					boardlength[23][5] = " ";
				}
				if (boardlength[23][6] == "_") {
					boardlength[23][6] = "X";
				}
				if (boardlength[23][10] == "_") { // ballroom
					boardlength[23][10] = " ";
				}
				if (boardlength[23][11] == "_") {
					boardlength[23][11] = " ";
				}
				if (boardlength[23][12] == "_") {
					boardlength[23][12] = " ";
				}
				if (boardlength[23][13] == "_") {
					boardlength[23][13] = " ";
				}

				if (boardlength[22][10] == "_") {
					boardlength[22][10] = " ";
				}
				if (boardlength[22][11] == "_") {
					boardlength[22][11] = " ";
				}
				if (boardlength[22][12] == "_") {
					boardlength[22][12] = " ";
				}
				if (boardlength[22][13] == "_") {
					boardlength[22][13] = " ";
				}
				if (boardlength[21][8] == "_") {
					boardlength[21][8] = " ";
				}
				if (boardlength[21][9] == "_") {
					boardlength[21][9] = " ";
				}
				if (boardlength[21][10] == "_") {
					boardlength[21][10] = " ";
				}
				if (boardlength[21][11] == "_") {
					boardlength[21][11] = " ";
				}
				if (boardlength[21][12] == "_") {
					boardlength[21][12] = " ";
				}
				if (boardlength[21][13] == "_") {
					boardlength[21][13] = " ";
				}
				if (boardlength[21][14] == "_") {
					boardlength[21][14] = " ";
				}
				if (boardlength[21][15] == "_") {
					boardlength[21][15] = " ";
				}
				if (boardlength[20][8] == "_") {
					boardlength[20][8] = " ";
				}
				if (boardlength[20][9] == "_") {
					boardlength[20][9] = " ";
				}
				if (boardlength[20][10] == "_") {
					boardlength[20][10] = " ";
				}
				if (boardlength[20][11] == "_") {
					boardlength[20][11] = " ";
				}
				if (boardlength[20][12] == "_") {
					boardlength[20][12] = " ";
				}
				if (boardlength[20][13] == "_") {
					boardlength[20][13] = " ";
				}
				if (boardlength[20][14] == "_") {
					boardlength[20][14] = " ";
				}
				if (boardlength[20][15] == "_") {
					boardlength[20][15] = " ";
				}
				if (boardlength[19][8] == "_") {
					boardlength[19][8] = "B";
				}
				if (boardlength[19][9] == "_") {
					boardlength[19][9] = "a";
				}
				if (boardlength[19][10] == "_") {
					boardlength[19][10] = "l";
				}
				if (boardlength[19][11] == "_") {
					boardlength[19][11] = "l";
				}
				if (boardlength[19][12] == "_") {
					boardlength[19][12] = "r";
				}
				if (boardlength[19][13] == "_") {
					boardlength[19][13] = "o";
				}
				if (boardlength[19][14] == "_") {
					boardlength[19][14] = "o";
				}
				if (boardlength[19][15] == "_") {
					boardlength[19][15] = "m";
				}
				if (boardlength[18][8] == "_") {
					boardlength[18][8] = " ";
				}
				if (boardlength[18][9] == "_") {
					boardlength[18][9] = " ";
				}
				if (boardlength[18][10] == "_") {
					boardlength[18][10] = " ";
				}
				if (boardlength[18][11] == "_") {
					boardlength[18][11] = " ";
				}
				if (boardlength[18][12] == "_") {
					boardlength[18][12] = " ";
				}
				if (boardlength[18][13] == "_") {
					boardlength[18][13] = " ";
				}
				if (boardlength[18][14] == "_") {
					boardlength[18][14] = " ";
				}
				if (boardlength[18][15] == "_") {
					boardlength[18][15] = " ";
				}
				if (boardlength[17][8] == "_") {
					boardlength[17][8] = " ";
				}
				if (boardlength[17][9] == "_") {
					boardlength[17][9] = " ";
				}
				if (boardlength[17][10] == "_") {
					boardlength[17][10] = " ";
				}
				if (boardlength[17][11] == "_") {
					boardlength[17][11] = " ";
				}
				if (boardlength[17][12] == "_") {
					boardlength[17][12] = " ";
				}
				if (boardlength[17][13] == "_") {
					boardlength[17][13] = " ";
				}
				if (boardlength[17][14] == "_") {
					boardlength[17][14] = " ";
				}
				if (boardlength[17][15] == "_") {
					boardlength[17][15] = " "; // end ballroom
				}
				if (boardlength[23][17] == "_") {
					boardlength[23][17] = "X";
				}
				if (boardlength[23][18] == "_") {// kitchen
					boardlength[23][18] = " ";
				}
				if (boardlength[23][19] == "_") {
					boardlength[23][19] = " ";
				}
				if (boardlength[23][20] == "_") {
					boardlength[23][20] = " ";
				}
				if (boardlength[23][21] == "_") {
					boardlength[23][21] = " ";
				}
				if (boardlength[23][22] == "_") {
					boardlength[23][22] = " ";
				}
				if (boardlength[23][23] == "_") {
					boardlength[23][23] = " ";
				}
				if (boardlength[23][24] == "_") {
					boardlength[23][24] = " ";
				}
				if (boardlength[22][18] == "_") {
					boardlength[22][18] = " ";
				}
				if (boardlength[22][19] == "_") {
					boardlength[22][19] = " ";
				}
				if (boardlength[22][20] == "_") {
					boardlength[22][20] = " ";
				}
				if (boardlength[22][21] == "_") {
					boardlength[22][21] = " ";
				}
				if (boardlength[22][22] == "_") {
					boardlength[22][22] = " ";
				}
				if (boardlength[22][23] == "_") {
					boardlength[22][23] = " ";
				}
				if (boardlength[22][24] == "_") {
					boardlength[22][24] = " ";
				}
				if (boardlength[21][18] == "_") {
					boardlength[21][18] = " ";
				}
				if (boardlength[21][19] == "_") {
					boardlength[21][19] = " ";
				}
				if (boardlength[21][20] == "_") {
					boardlength[21][20] = " ";
				}
				if (boardlength[21][21] == "_") {
					boardlength[21][21] = " ";
				}
				if (boardlength[21][22] == "_") {
					boardlength[21][22] = " ";
				}
				if (boardlength[21][23] == "_") {
					boardlength[21][23] = " ";
				}
				if (boardlength[21][24] == "_") {
					boardlength[21][24] = " ";
				}
				if (boardlength[20][18] == "_") {
					boardlength[20][18] = "K";
				}
				if (boardlength[20][19] == "_") {
					boardlength[20][19] = "i";
				}
				if (boardlength[20][20] == "_") {
					boardlength[20][20] = "t";
				}
				if (boardlength[20][21] == "_") {
					boardlength[20][21] = "c";
				}
				if (boardlength[20][22] == "_") {
					boardlength[20][22] = "h";
				}
				if (boardlength[20][23] == "_") {
					boardlength[20][23] = "e";
				}
				if (boardlength[20][24] == "_") {
					boardlength[20][24] = "n";
				}
				if (boardlength[19][18] == "_") {
					boardlength[19][18] = " ";
				}
				if (boardlength[19][19] == "_") {
					boardlength[19][19] = " ";
				}
				if (boardlength[19][20] == "_") {
					boardlength[19][20] = " ";
				}
				if (boardlength[19][21] == "_") {
					boardlength[19][21] = " ";
				}
				if (boardlength[19][22] == "_") {
					boardlength[19][22] = " ";
				}
				if (boardlength[19][23] == "_") {
					boardlength[19][23] = " ";
				}
				if (boardlength[19][24] == "_") {
					boardlength[19][24] = " ";
				}
				if (boardlength[18][18] == "_") {
					boardlength[18][18] = " ";
				}
				if (boardlength[18][19] == "_") {
					boardlength[18][19] = " ";
				}
				if (boardlength[18][20] == "_") {
					boardlength[18][20] = " ";
				}
				if (boardlength[18][21] == "_") {
					boardlength[18][21] = " ";
				}
				if (boardlength[18][22] == "_") {
					boardlength[18][22] = " ";
				}
				if (boardlength[18][23] == "_") {
					boardlength[18][23] = " ";
				}
				if (boardlength[18][24] == "_") {
					boardlength[18][24] = " "; // end kitchen
				}
				if (boardlength[16][24] == "_") {
					boardlength[16][24] = "X";
				}

				if (boardlength[23][23] == "_") {
					boardlength[23][23] = " ";
				}
				if (boardlength[15][24] == "_") {
					boardlength[15][24] = " ";
				}
				if (boardlength[13][16] == "_") {
					boardlength[13][16] = " ";
				}
				if (boardlength[13][17] == "_") {
					boardlength[13][17] = " ";
				}
				if (boardlength[13][18] == "_") {
					boardlength[13][18] = " ";
				}
				if (boardlength[13][19] == "_") {
					boardlength[13][19] = " ";
				}
				if (boardlength[13][20] == "_") {
					boardlength[13][20] = " ";
				}
				if (boardlength[13][21] == "_") {
					boardlength[13][21] = " ";
				}
				if (boardlength[13][22] == "_") {
					boardlength[13][22] = " ";
				}
				if (boardlength[13][23] == "_") {
					boardlength[13][23] = " ";
				}
				if (boardlength[13][24] == "_") {
					boardlength[13][24] = " ";
				}

				if (boardlength[14][20] == "_") {
					boardlength[14][20] = " ";
				}
				if (boardlength[14][21] == "_") {
					boardlength[14][21] = " ";
				}
				if (boardlength[14][22] == "_") {
					boardlength[14][22] = " ";
				}
				if (boardlength[14][23] == "_") {
					boardlength[14][23] = " ";
				}
				if (boardlength[14][24] == "_") {
					boardlength[14][24] = " ";
				}
				if (boardlength[12][16] == "_") {
					boardlength[12][16] = "D";
				}
				if (boardlength[12][17] == "_") {
					boardlength[12][17] = "i";
				}
				if (boardlength[12][18] == "_") {
					boardlength[12][18] = "n";
				}
				if (boardlength[12][19] == "_") {
					boardlength[12][19] = "i";
				}
				if (boardlength[12][20] == "_") {
					boardlength[12][20] = "n";
				}
				if (boardlength[12][21] == "_") {
					boardlength[12][21] = "g";
				}
				if (boardlength[12][22] == "_") {
					boardlength[12][22] = " ";
				}
				if (boardlength[12][23] == "_") {
					boardlength[12][23] = " ";
				}
				if (boardlength[12][24] == "_") {
					boardlength[12][24] = " ";
				}
				if (boardlength[11][16] == "_") {
					boardlength[11][16] = " ";
				}
				if (boardlength[11][17] == "_") {
					boardlength[11][17] = " ";
				}
				if (boardlength[11][18] == "_") {
					boardlength[11][18] = " ";
				}
				if (boardlength[11][19] == "_") {
					boardlength[11][19] = " ";
				}
				if (boardlength[11][20] == "_") {
					boardlength[11][20] = " ";
				}
				if (boardlength[11][21] == "_") {
					boardlength[11][21] = " ";
				}
				if (boardlength[11][22] == "_") {
					boardlength[11][22] = " ";
				}
				if (boardlength[11][23] == "_") {
					boardlength[11][23] = " ";
				}
				if (boardlength[11][24] == "_") {
					boardlength[11][24] = " ";
				}
				if (boardlength[10][16] == "_") {
					boardlength[10][16] = " ";
				}
				if (boardlength[10][17] == "_") {
					boardlength[10][17] = " ";
				}
				if (boardlength[10][18] == "_") {
					boardlength[10][18] = " ";
				}
				if (boardlength[10][19] == "_") {
					boardlength[10][19] = " ";
				}
				if (boardlength[10][20] == "_") {
					boardlength[10][20] = " ";
				}
				if (boardlength[10][21] == "_") {
					boardlength[10][21] = " ";
				}
				if (boardlength[10][22] == "_") {
					boardlength[10][22] = " ";
				}
				if (boardlength[10][23] == "_") {
					boardlength[10][23] = " ";
				}
				if (boardlength[10][24] == "_") {
					boardlength[10][24] = " ";
				}
				if (boardlength[9][16] == "_") {
					boardlength[9][16] = " ";
				}
				if (boardlength[9][17] == "_") {
					boardlength[9][17] = " ";
				}
				if (boardlength[9][18] == "_") {
					boardlength[9][18] = " ";
				}
				if (boardlength[9][19] == "_") {
					boardlength[9][19] = " ";
				}
				if (boardlength[9][20] == "_") {
					boardlength[9][20] = " ";
				}
				if (boardlength[9][21] == "_") {
					boardlength[9][21] = " ";
				}
				if (boardlength[9][22] == "_") {
					boardlength[9][22] = " ";
				}
				if (boardlength[9][23] == "_") {
					boardlength[9][23] = " ";
				}
				if (boardlength[9][24] == "_") {
					boardlength[9][24] = " "; // end dining room
				}
				if (boardlength[9][9] == "_") {
					boardlength[9][9] = " "; // center
				}
				if (boardlength[9][10] == "_") {
					boardlength[9][10] = " ";
				}
				if (boardlength[9][11] == "_") {
					boardlength[9][11] = " ";
				}
				if (boardlength[9][12] == "_") {
					boardlength[9][12] = " ";
				}
				if (boardlength[9][13] == "_") {
					boardlength[9][13] = " ";
				}
				if (boardlength[10][9] == "_") {
					boardlength[10][9] = " ";
				}
				if (boardlength[10][10] == "_") {
					boardlength[10][10] = " ";
				}
				if (boardlength[10][11] == "_") {
					boardlength[10][11] = " ";
				}
				if (boardlength[10][12] == "_") {
					boardlength[10][12] = " ";
				}
				if (boardlength[10][13] == "_") {
					boardlength[10][13] = " ";
				}
				if (boardlength[11][9] == "_") {
					boardlength[11][9] = " ";
				}
				if (boardlength[11][10] == "_") {
					boardlength[11][10] = " ";
				}
				if (boardlength[11][11] == "_") {
					boardlength[11][11] = " ";
				}
				if (boardlength[11][12] == "_") {
					boardlength[11][12] = " ";
				}
				if (boardlength[11][13] == "_") {
					boardlength[11][13] = " ";
				}
				if (boardlength[12][9] == "_") {
					boardlength[12][9] = " ";
				}
				if (boardlength[12][10] == "_") {
					boardlength[12][10] = " ";
				}
				if (boardlength[12][11] == "_") {
					boardlength[12][11] = " ";
				}
				if (boardlength[12][12] == "_") {
					boardlength[12][12] = " ";
				}
				if (boardlength[12][13] == "_") {
					boardlength[12][13] = " ";
				}
				if (boardlength[13][9] == "_") {
					boardlength[13][9] = " ";
				}
				if (boardlength[13][10] == "_") {
					boardlength[13][10] = " ";
				}
				if (boardlength[13][11] == "_") {
					boardlength[13][11] = " ";
				}
				if (boardlength[13][12] == "_") {
					boardlength[13][12] = " ";
				}
				if (boardlength[13][13] == "_") {
					boardlength[13][13] = " ";
				}
				if (boardlength[14][9] == "_") {
					boardlength[14][9] = " ";
				}
				if (boardlength[14][10] == "_") {
					boardlength[14][10] = " ";
				}
				if (boardlength[14][11] == "_") {
					boardlength[14][11] = " ";
				}
				if (boardlength[14][12] == "_") {
					boardlength[14][12] = " ";
				}
				if (boardlength[14][13] == "_") {
					boardlength[14][13] = " "; // end center
				}
				System.out.print(boardlength[line][column]);
			}

			System.out.println();
		}

		// how far get to walk dice
		// set start game places
		// generate the board

	}

}
