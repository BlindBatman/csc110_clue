package neumont.csc110.finalgame;

import java.io.IOException;

public class gameTest {

	public static void main(String[] args) throws IOException {
	
		board a = new board();
		a.display();	
		while(true) {	
			a.Movement();
			a.display();
		}
//		chars b = new chars();
//		b.loop();
//		dice c = new dice();
//		c.roll();
	}

}
