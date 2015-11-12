import javax.swing.JOptionPane;

public class rollarcoster {
public static void main(String[] args) {
String hi = JOptionPane.showInputDialog("How tall are you?");
int stuff = Integer.parseInt(hi);
if (stuff<=4) {
	JOptionPane.showMessageDialog(null, "Grow taller!");
}
if (stuff>4) {
	JOptionPane.showMessageDialog(null, "You can ride");
	
} 
}

}
