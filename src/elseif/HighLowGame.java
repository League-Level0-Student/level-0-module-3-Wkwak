//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		int tries = 0;
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100) + 1;
		
		// 2. Print out the random variable above
		JOptionPane.showMessageDialog(null, random);
		// 11. Repeat steps 1 to 10 ten times
		for (int i = 0; i <11; i++) {
			
		}
			// 1. Ask the user for a guess using a pop-up window, and save their response 
				String rnumber = JOptionPane.showInputDialog("Think of a number between 1 and 100");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
				int trunumber = Integer.parseInt(rnumber);
			// 5. if the guess is correct
			while (trunumber != random) {
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				if (trunumber > random) {
					JOptionPane.showMessageDialog(null, "Your number is too high");
					tries++;
				}
				// 8. Tell them it's too high
			// 9. if the guess is low
				if (trunumber < random) {
					JOptionPane.showMessageDialog(null, "Your number is too low");
					tries++;
				}
				// 10. Tell them it's too low
				if (tries == 5) {
					JOptionPane.showMessageDialog(null, "you lose");
					return;
					
				}
				rnumber = JOptionPane.showInputDialog("Guess again");
				trunumber = Integer.parseInt(rnumber);
			}
		// 13. Tell them they lose
			JOptionPane.showMessageDialog(null, "You win");
	}

}


