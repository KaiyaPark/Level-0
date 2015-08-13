// Copyright Wintriss Technical Schools 2013
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class TriangleShell {

	public static void main(String[] args) {
		Tortoise.setSpeed(10);
		int length = 25;

		for (int i = 0; i < 100; i++) {	
			Tortoise.setPenColor(Colors.getRandomColor());
			length = length+4;
		drawTriangle (length);
		Tortoise.turn(6);
		}
	}

	
	private static void drawTriangle(int length) {
		Tortoise.move(length);
		Tortoise.turn(120);
		Tortoise.move(length);
		Tortoise.turn(120);
		Tortoise.move(length);
		Tortoise.turn(120);
	}
}
