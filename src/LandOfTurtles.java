import javax.swing.JFrame;

import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";
		JFrame f = new JFrame();
		f.setSize(1000, 1000);
		f.add(panel);
		f.setVisible(true);
		panel.setBackgroundImage(galapagosIslands);
		for (int i = 0; i < 5000; i++) {
		Turtle t = new Turtle();
		panel.addTurtle(t);
		t.setX(600);
		t.setY(600);
		t.setSpeed(10);
		t.turn(i*12);
		t.move(i*12);
		}
	}
}
