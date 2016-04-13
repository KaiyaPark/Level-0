import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DuellingButtons implements ActionListener {
	
	public static void main(String[] args) {
		new DuellingButtons().createUI();
	}

	JButton leftButton = new JButton();
	JButton rightButton = new JButton();
	
	Dimension BIG = new Dimension(150,90);
	Dimension SMALL = new Dimension(100,30);
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	private void createUI() {
		frame.add(panel);
		frame.setVisible(true);
		leftButton.setText("CLick me!");
		rightButton.setText("Click me!");
		leftButton.addActionListener(this);
		rightButton.addActionListener(this);
		panel.add(leftButton);
		panel.add(rightButton);
		frame.pack();
		frame.setTitle("Demanding Button");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		
		
		/* If the buttonPressed was the leftButton....*/
		if (buttonPressed.equals(leftButton)) {
			rightButton.setText("No, click Me!");
			rightButton.setPreferredSize(BIG);
			leftButton.setText("CLick me!");
			leftButton.setPreferredSize(SMALL);
		}
		else {
			leftButton.setText("No, click Me!");
			leftButton.setPreferredSize(BIG);
			rightButton.setText("CLick me!");
			rightButton.setPreferredSize(SMALL);
		}
			// Set the text of the rightButton to "No, click Me!"
			// Set the PREFERRED size of the rightButton to BIG
			// Set the text of the leftButton to "Click Me!"
			// Set the PREFERRED size of the leftButton to SMALL
		
		
		/* If the buttonPressed was the rightButton, do the opposite. */
		

		frame.pack();
	}
}
