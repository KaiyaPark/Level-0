import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JPanel p = new JPanel();
	JFrame j = new JFrame();
	JButton b = new JButton();
	JButton b2 = new JButton();

	public static void main(String[] args) {
		ChuckleClicker c = new ChuckleClicker();
		c.makeButtons();
	}

	void makeButtons() {
		j.setSize(500, 500);
		j.setVisible(true);
		j.add(p);
		b.setText("Joke");
		b2.setText("Punchline");
		p.add(b);
		p.add(b2);
		b.addActionListener(this);
		b2.addActionListener(this);
		j.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == b) {
			JOptionPane.showMessageDialog(null, "Whenever the cashier at the grocery store asks my dad if he would like the milk in a bag he replies,");
		}
		if (e.getSource() == b2) {
			JOptionPane.showMessageDialog(null, "‘No, just leave it in the carton!’”");
		}

	}
}
