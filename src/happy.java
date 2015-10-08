import javax.swing.JOptionPane;

public class happy {
	public static void main(String[] args) {
		int question = JOptionPane.showConfirmDialog(null, "Are you happy?");
		if (question == 1) {
			int no = JOptionPane.showConfirmDialog(null,
					"Do you want to be happy?");
			if (no == 1) {
				JOptionPane.showMessageDialog(null,
						"Keep doing whatever you're doing.");
			}
			if (no == 0) {
				JOptionPane.showMessageDialog(null, "Change something.");

			}
		}
		if (question == 0) {
			JOptionPane.showMessageDialog(null,
					"Keep doing whatever you're doing!");

		}
	}

}
