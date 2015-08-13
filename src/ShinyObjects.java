import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class ShinyObjects {

	public static void main(String[] args) {

	String happy = JOptionPane.showInputDialog("How many shiny objects do you want?");
	int happy2 = Integer.parseInt(happy);	
	// 3. Play the sound that many times
		for (int i = 0; i < happy2; i++) {
			playMisterZee();

		}
	}

	public static void playMisterZee() {
		try {
			File soundFile = new File(
					"/Users/Guest/Google Drive/league-sounds/shiny-objects.wav");
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(soundFile);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
