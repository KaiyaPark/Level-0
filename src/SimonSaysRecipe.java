import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.io.IOException;

public class SimonSaysRecipe extends KeyAdapter {
	JFrame frame = new JFrame();
	HashMap<Integer, String> images = new HashMap<Integer, String>();
	private int imageIndex;
	private int tries = 0;
	private int simonSays = 0;
	Date timeAtStart;

	private void makeAlbum() {
		images.put(new Integer(KeyEvent.VK_UP), "keyup1.gif");
		images.put(new Integer(KeyEvent.VK_DOWN), "imgres-1.png");
		images.put(new Integer(KeyEvent.VK_LEFT), "imgres.png");
		images.put(new Integer(KeyEvent.VK_RIGHT), "imgres-2.png");
		JOptionPane.showMessageDialog(null, "We are going to play Simon Says!");
		showImage();
	}

	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		// 16. make a points variable to track the score. tell the user their score at the end.
		int points = 0;
		// 17. if the keyCode matches the imageIndex and "Simon says..."
		// increase their score
		if (keyCode == imageIndex && simonSays == 1) {
			points++;
			speak("Correct you get one point");
		}
		else if (keyCode!= imageIndex && simonSays == 0) {
			points++;
			speak("Correct you get one point");
		}
		else {
			speak("You are wrong, minus one point");
		}

		tries++;
		if (tries>10){
			JOptionPane.showMessageDialog(null, points);
			System.exit(0);
	}	
	frame.dispose();
	showImage();
}	

	private void showImage() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.add(getNextRandomImage());
		frame.setSize(500, 500);
		frame.addKeyListener(this);
		Random number = new Random();
		simonSays = number.nextInt(2);
		if (simonSays==0) {
			speak("press this key");
		}
		else if (simonSays==1) {			
			speak("Kya says to press this key");
		}
	}

	private Component getNextRandomImage() {
		this.imageIndex = new Random().nextInt(4) + 37;
		return loadImage(images.get(imageIndex));
	}

	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		new SimonSaysRecipe().makeAlbum();
	}
}

/*
 * 20. add a timer ~~~ where the code starts running ~~~ timeAtStart = new
 * Date();
 *
 * ~~~ where the code ends ~~~ Date timeAtEnd = new Date();
 * System.out.println((timeAtEnd.getTime()-timeAtStart.getTime())/1000);
 * System.exit(0);
 */
