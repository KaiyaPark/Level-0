import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class Binary implements ActionListener{
	
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b = new JButton();
	void createUI(){
	f.add(p);
	f.setVisible(true);
	JTextField t = new JTextField(20);
	p.add(t);
	p.add(b);
	b.addActionListener(this);
	b.setText("Convert Fools!");
	JTextField t2 = new JTextField(20);
	p.add(t2);
	f.pack();
	}
	public static void main(String[] args) {
		Binary bi = new Binary();
		bi.createUI();
		
	}
	String convert(String binary) {
	   	 int asciiValue = Integer.parseInt(binary, 2);
	   	 char theLetter = (char) asciiValue;
	   	 return "" + theLetter;
	    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String convert( );
	}

}
