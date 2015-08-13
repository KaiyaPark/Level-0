import java.io.IOException;

import javax.swing.JOptionPane;

public class NASA {
	public static void main(String[] args) throws InterruptedException,
	IOException {
		
for (int i = 10; i >= 0; i--) {
	Thread.sleep(1000);
	Runtime.getRuntime().exec("say " + i);
	if (i == 0) {
		Thread.sleep(1000);
		Runtime.getRuntime().exec("say blast off");
	}
}
	}
}
