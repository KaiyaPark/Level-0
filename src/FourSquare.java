// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class FourSquare {
	public static void main(String[] args) {

		Tortoise.setSpeed(10);
		Tortoise.setPenWidth(5);
for (int i = 0; i < 4; i++) {
	Tortoise.setPenColor(Colors.getRandomColor());
		drawSquare();
Tortoise.turn(90);
}

	}

	static void drawSquare() {
		Tortoise.turn(90);
		Tortoise.move(50);
		Tortoise.turn(90);
		Tortoise.move(50);
		Tortoise.turn(90);
		Tortoise.move(50);
		Tortoise.turn(90);
		Tortoise.move(50);

	}
}
