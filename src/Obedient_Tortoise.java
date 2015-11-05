import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;


public class Obedient_Tortoise {
        public static void main(String[] args) {
			Tortoise.setSpeed(10);
        	Tortoise.show();
       String ask = JOptionPane.showInputDialog("Do you want for me to draw a circle, triangle, or square?");
 
       if (ask.equals("circle")) {
    	   drawCircle();
	}
       else if (ask.equals("square")) {
		drawSquare();
	}
       else if (ask.equals("triangle")) {
   		drawTriangle();
       }
       }

		private static void drawSquare() {
			for (int i = 0; i < 4; i++) {
			Tortoise.move(90);
			Tortoise.turn(90);
			}
		}

		private static void drawTriangle() {
			for (int i = 0; i < 3; i++) {
				Tortoise.move(90);
				Tortoise.turn(120);
			}
		}

		private static void drawCircle() {
			for (int i = 0; i < 360; i++) {
					Tortoise.move(1);
					Tortoise.turn(1);
			}
		}
}
