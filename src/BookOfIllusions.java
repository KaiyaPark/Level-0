import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * We’re going to make a slide show of cool optical illusions. When the user clicks on an illusion, a new one will be
 * loaded.
 **/

public class BookOfIllusions extends MouseAdapter {

	/*
	 * Here we are instantiating our BookOfIllusions class and calling it’s createBook() method. This is because we want
	 * to get out of the static main method, so that we can add a click listener to each illusion.
	 */
	JLabel l;

	public static void main(String[] args) throws Exception {
		BookOfIllusions illusions = new BookOfIllusions();
		illusions.createBook();
	}

	JFrame f = new JFrame();

	private void createBook() {
		f.setVisible(true);
		f.setSize(500, 500);
		String pic1 = "Funny.jpg";
		l = loadImageFromComputer(pic1);
		f.add(l);
		f.pack();
		f.addMouseListener(this);
	}

	public void mousePressed(MouseEvent e) {
		System.out.println("clicked!");
		f.remove(l);
		String pic2 = "Happy.jpg";
		JLabel l1 = loadImageFromComputer(pic2);
		f.add(l1);
		f.pack();
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}
