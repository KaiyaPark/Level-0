import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {
public static void main(String[] args) {
	GUI g = new GUI();
	g.hi();
}
void hi(){
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	f.add(p);
	JButton b = new JButton();
	p.add(b);
	JButton b2 = new JButton();
	p.add(b2);
	f.pack();
}
}
