// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipies".
 */
public class XGeeks {
	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String Maria = "art";
		String Upneet = "sewing";
		String Skylar = "swim";
		String Kaiya = "Baking";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String answer = JOptionPane.showInputDialog("Enter a name");
		// 3. Show the superpower in a pop-up, depending on the name entered.
if (answer.equals("Kaiya")) {
	JOptionPane.showMessageDialog(null, "Kaiya's superpower is "+ Kaiya);
}
else if (answer.equals("Upneet")) {
	JOptionPane.showMessageDialog(null, "Upneet's superpower is " + Upneet);
} 
else if (answer.equals("Maria")) {
	JOptionPane.showMessageDialog(null, "Maria's superpower is " + Maria);
} 
else if (answer.equals("Skylar")) {
	JOptionPane.showMessageDialog(null, "Skylar's superpower is " + Skylar);
} 

	}
}
