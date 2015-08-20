import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;


public class RobotNarwal {
public static void main(String[] args) {
	Robot narwal = new Robot("mini");
	narwal.sparkle();
	narwal.setPenColor(Color.cyan);
	narwal.setSpeed(10);
	narwal.penDown();
for (int i = 0; i < 1000; i++) {
	narwal.move(3*i);
	narwal.turn(72);
	
}
}
}
