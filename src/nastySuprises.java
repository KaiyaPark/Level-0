import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nastySuprises implements ActionListener {
	public static void main(String[] args) {
		nastySuprises n = new nastySuprises();
		n.createUI();
	}

	public void createUI() {
		JFrame f = new JFrame();
		f.setVisible(true);
		JPanel p = new JPanel();
		f.add(p);
		JButton b = new JButton();
		p.add(b);
		b.setText("Trick");
		b.addActionListener(this);
		JLabel t = new JLabel();
		p.add(t);
		t.setText("or");
		JButton b2 = new JButton();
		p.add(b2);
		b2.setText("Treat");
		b2.addActionListener(this);
		f.pack();

	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b3 = (JButton) e.getSource();
		if (b3.getText().equals("Trick")){
			showPictureFromTheInternet("http://i.imgur.com/n3vlmzi.jpg");
		}
		if(b3.getText().equals("Treat")){
			showPictureFromTheInternet("http://www.lovethispic.com/uploaded_images/86780-Chocolate-Candy-Tray.jpg");
		}
	}


}
