import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot rob = new Robot();
	public static void main (String[] args) {
		rob.miniaturize();
		rob.setSpeed(20);
		while (0==0) {
			String shape = JOptionPane.showInputDialog("which shape do you want to draw");
			String color = JOptionPane.showInputDialog("which color would you like to use");
			
			if (color.equals("red")) {
				rob.setPenColor(255, 0, 0);
			}
			if (color.equals("green")) {
				rob.setPenColor(0,255,0);
			}
			if (color.equals("blue")) {
				rob.setPenColor(0,0,255);
			}
			if (shape.equals("circle")) {
				drawCircle();
			}
			if (shape.equals("square")) {
				drawSquare();
			}
			if (shape.equals("triangle")) {
				drawTriangle();
			}
		}
	
}
	
	public static void drawSquare() {
		rob.penDown();
		for (int i =0; i<5; i++) {
			rob.move(50);
			rob.turn(90);
		}
	}
	public static void drawTriangle() {
		rob.penDown();
		for(int i = 0; i<4; i++) {
			rob.move(50);
			rob.turn(120);
		}
		
	}
	public static void drawCircle() {
		for (int u=0; u<360; u++) {
			rob.penDown();
			rob.move(5);
			rob.turn(1);
		}
	}
	

}