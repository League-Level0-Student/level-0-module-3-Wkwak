//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot rob = new Robot();
		Random rand = new Random();
		//3. Ask the user what color they would like the robot to draw
		while (0==0) {
		String color = JOptionPane.showInputDialog("What color would you like to use");
		//5. Use an if/else statement to set the pen color that the user requested
		if (color.equals("red")) {
			rob.setPenColor(255, 0, 0);
		}
		if (color.equals("blue")) {
			rob.setPenColor(0, 0, 255);;
		}
		if (color.equals("green")) {
			rob.setPenColor(0, 255, 0);
		}
        //6. If the user doesn’t enter anything, choose a random color
		else if (!color.equals("green") && !color.equals("red") && !color.equals("blue")){
			int rand1 = rand.nextInt(256);
			int rand2 = rand.nextInt(256);
			int rand3 = rand.nextInt(256);
			rob.setPenColor(rand1, rand2, rand3);
		}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		//4. Set the pen width to 10
		rob.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		rob.penDown();
		rob.setSpeed(20);
		for (int u = 0; u<4; u++) {
			rob.move(100);
			rob.turn(90);
		}
		
	}
	}
}
