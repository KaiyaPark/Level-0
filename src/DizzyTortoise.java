import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class DizzyTortoise {

	public static void main(String[] args) {

		String spin = JOptionPane
				.showInputDialog("How many time do you want the turtle to spin?");
		int spin2 = Integer.parseInt(spin);
		dance(spin2);
	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}
