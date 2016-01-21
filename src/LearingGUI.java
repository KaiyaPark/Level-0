import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LearingGUI implements ActionListener {
	JFrame window = new JFrame();
	JButton hello = new JButton("HELLO BUTTON");
	JButton how = new JButton("HOW R U BUTTON");
	JTextField field = new JTextField();

	public static void main(String[] args) {
		new LearingGUI();
	}

	LearingGUI() {
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pan = new JPanel();
		pan.add(hello);
		pan.add(how);
		pan.add(field);
		window.add(pan);
		window.setSize(500, 500);
		hello.addActionListener(this);
		how.addActionListener(this);
	}

	private void add(JButton hello) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton click = (JButton) e.getSource();
		if (click == hello) {
			speak("Hello");
		} else if (click == how) {
			speak("How are you today?");
		}
	}

	private void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
