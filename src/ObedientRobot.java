import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	public static void main (String[] args) {
		Robot rob = new Robot();
		rob.setSpeed(40);
		rob.miniaturize();
		for (int i =0; i<5; i++) {
			rob.move(50);
			rob.turn(90);
		}
		
	}
	
	
	

}