import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DontForgetTheLyrics {
	/*
	 * For this game, we'll play the start of a song, and the player has to
	 * guess the rest of the lyrics.
	 * 
	 * 1. To record a sound clip, open Audacity and record your song.
	 * 
	 * 2. Click File -> Export Audio, and save your file on the Desktop.
	 * 
	 * 3. Drag your file from the Desktop into the "default package" under
	 * "src".
	 */

	public static void main(String[] args) {
		// 4. Make a pop-up to explain the game.
		JOptionPane
				.showMessageDialog(
						null,
						"We are going to play a game. You will hear a song. Then you will try to guess the next line.");
		// 5. Use the playSound method to play your song.
		playSound("song.wav");
		String answer = JOptionPane.showInputDialog("Now guess");
		if (answer.equals("Hello, tuck you in every night on the phone")) {
			JOptionPane.showMessageDialog(null, "Correct");
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong");	
		}
playSound("song2.wav");
		String answer2 = JOptionPane.showInputDialog("Now guess");
		if (answer2.equals("The fairest all around")) {
			JOptionPane.showMessageDialog(null, "Correct");
		}
		else {
			JOptionPane.showMessageDialog(null, "Wrong");
			
		}

		// 9. Record another sound and repeat steps 5-8.

		// 10. [optional] Add a points variable that will calculate their final
		// score.
	}

	public static void playSound(String fileName) {
		AudioClip audioClip = JApplet.newAudioClip(new DontForgetTheLyrics()
				.getClass().getResource(fileName));
		audioClip.play();
	}
}
