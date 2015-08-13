import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ColorTeacher implements ActionListener, KeyListener{
	public static void main(String[] args) {
		new ColorTeacher().createGUI();
	}

	JPanel panel = new JPanel();
	JButton yellow = new JButton();
	JButton red = new JButton();
	JButton blue = new JButton();
	JButton green = new JButton();

	private void createGUI() {
		JFrame frame = new JFrame("Color Teacher");
		produceButton(yellow, java.awt.Color.YELLOW);
		produceButton(red, java.awt.Color.RED);
		produceButton(blue, java.awt.Color.BLUE);
		produceButton(green, java.awt.Color.GREEN);
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
	}

	private void produceButton(JButton button, java.awt.Color color) {
		button.setBackground(color);
		button.setOpaque(true);
		button.addActionListener(this);
		button.addKeyListener(this);
		panel.add(button);
	}

	private void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(yellow)) {
			speak("yellow");
		}
		else if(e.getSource().equals(red)) {
			speak("red");
		}
		else if(e.getSource().equals(blue)) {
			speak("blue");
		}
		else if(e.getSource().equals(green)) {
			speak("green");
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if(e.getKeyChar() == KeyEvent.VK_1) {
			speak("yellow");
		}
		else if(e.getKeyChar() == KeyEvent.VK_2) {
			speak("red");
		}
		else if(e.getKeyChar() == KeyEvent.VK_3) {
			speak("blue");
		}
		else if(e.getKeyChar() == KeyEvent.VK_4) {
			speak("green");
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}
}
