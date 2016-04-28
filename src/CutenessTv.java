import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTv implements ActionListener{
	JFrame f = new JFrame();
	JPanel p = new JPanel();

	public static void main(String[] args) {
		CutenessTv c = new CutenessTv();
		c.createUI();
	}
	void createUI(){
		f.add(p);
		JButton b = new JButton();
		b.setSize(10, 10);
		b.addActionListener(this);
		p.add(b);
		b.setText("Ducks");
		JButton b1 = new JButton();
		b1.setSize(10,10);
		b1.addActionListener(this);
		p.add(b1);
		b1.setText("Frogs");
		JButton b2 = new JButton();
		b2.setSize(10,10);
		b2.addActionListener(this);
		p.add(b2);
		b2.setText("Fluffy Unicorns");
		f.setVisible(true);
		f.pack();
		
	}
	void showDucks() {
		playVideo("Drirjl5K9Yk");
	}

	void showBunnies() {
		playVideo("aSjCb-FfxhI");
	}

	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
