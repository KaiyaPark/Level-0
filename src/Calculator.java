import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame window = new JFrame();
	JButton add = new JButton("ADD");
	JButton sub = new JButton("SUBTRACT");
	JButton mult = new JButton("MULITIPLY");
	JButton div = new JButton("DIVIDE");
	JTextField field = new JTextField(10);
	JTextField field1 = new JTextField(10);

	public static void main(String[] args) {
		new Calculator();
	}

	Calculator() {
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pan = new JPanel();
		pan.setLayout(null);
		add.setBounds(50, 300, 100, 100);
		sub.setBounds(150, 300, 100, 100);
		mult.setBounds(250, 300, 100, 100);
		div.setBounds(350, 300, 100, 100);
		field.setBounds(50, 50, 150, 40);
		field1.setBounds(300, 50, 150, 40);
		pan.add(add);
		pan.add(sub);
		pan.add(mult);
		pan.add(div);
		pan.add(field);
		pan.add(field1);
		window.add(pan);
		window.setSize(500, 500);
		add.addActionListener(this);
		sub.addActionListener(this);
		mult.addActionListener(this);
		div.addActionListener(this);
	}

	private void add(JButton hello) {
		// TODO Auto-generated method stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton click = (JButton) e.getSource();
		String stuff = field.getText();
		int hi = Integer.parseInt(stuff);
		String stuff1 = field1.getText();
		int hi1 = Integer.parseInt(stuff1);
		if (click == add) {
			speak("" + (hi+hi1));
		}
		else if (click == sub) {
			speak("" + (hi-hi1));
		}
		else if (click == mult) {
			speak("" + (hi*hi1));
		}
		else if (click == div) {
			speak("" + (hi/hi1));
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
