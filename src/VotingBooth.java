import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String hi=JOptionPane.showInputDialog("How old are you?");
	int stuff= Integer.parseInt(hi);
			if (stuff<18) {
				JOptionPane.showMessageDialog(null, "no one cares");
		
	}
		if (stuff>18) {
			JOptionPane.showInputDialog("Who do you think should be presedent");
		}	
}
}
