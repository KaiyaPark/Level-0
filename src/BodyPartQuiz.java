import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BodyPartQuiz {

	// Get 3 celebrity photos from the internet, save them to your computer, and fill
	// in their paths here. To get the path, right click on the image, and copy its Location.
	String firstImage = "/Users/league/Desktop/Level-0/src/Justin-Bieber.jpg";
	String secondImage = "/Users/league/Desktop/Level-0/src/cute_dog_boo-1024x768.jpg";
	String thirdImage = "/Users/league/Desktop/Level-0/src/22fe4638-d675-47f8-9726-5f43e27bb084.jpg";

	Frame window = new Frame();
	
	private void startQuiz() {
		// Set the size of the window so that you can only see part of the image.
			window.setSize(500, 500);
		// Make an int variable to hold the score.
			int score = 0;
		// Ask the user who this person is and store their answer
			String answer = JOptionPane.showInputDialog("Who is this person?");
		// If they got the answer right:
			if (answer.equals("Justin Bieber")) {
				JOptionPane.showMessageDialog(null, "You are correct");
			score++;
			}
			else {
				JOptionPane.showMessageDialog(null, "Wrong");
			}
			showNextImage();
			String answer2 = JOptionPane.showInputDialog("Who is this person?");
			if (answer2.equals("Boo")) {
				JOptionPane.showMessageDialog(null, "Correct");
				score++;
			}
			else {
				JOptionPane.showMessageDialog(null, "Wrong");
			}
			showNextImage();
			String answer3 = JOptionPane.showInputDialog("Who is this person?");
			// If they got the answer right:
				if (answer3.equals("Taylor Swift")) {
					JOptionPane.showMessageDialog(null, "You are correct");
				score++;
				}
				else {
					JOptionPane.showMessageDialog(null, "Wrong");
				}
		// -- Tell them they are correct.
		// -- Increase the score by 1
			
			

		// Otherwise:
		// -- Tell them they are wrong

		// Use the method below to show the next image
		// Show the score
		// .... repeat for all your images.....
	}

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}

