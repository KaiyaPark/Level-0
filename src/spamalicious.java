import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;
 
public class spamalicious implements ActionListener{
	JButton b = new JButton();
	JTextField t = new JTextField(12);
	JButton b2 = new JButton();
	static final String FAKE_USERNAME = "bob.bobby.bobby.bobby.joe@gmail.com";
	static final String FAKE_PASSWORD = "Bob.bobby1234";
 public static void main(String[] args) {
	spamalicious s = new spamalicious();
	s.createUI(); 
}
public void createUI(){
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	f.add(p);
	p.add(t);
	t.setText("Email Address");
	p.add(b);
	b.setText("BAD");
	p.add(b2);
	b2.setText("GOOD");
	f.setVisible(true);
	f.pack();
	b.addActionListener(this);
	b2.addActionListener(this);

}
private boolean sendSpam(String recipient, String subject, String content) {

	Properties props = new Properties();
	props.put("mail.smtp.auth", "true");
	props.put("mail.smtp.starttls.enable", "true");
	props.put("mail.smtp.host", "smtp.gmail.com");
	props.put("mail.smtp.port", "587");

	Session session = Session.getInstance(props, new javax.mail.Authenticator() {
		protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
			return new javax.mail.PasswordAuthentication(FAKE_USERNAME, FAKE_PASSWORD);
		}
	});

	try {

		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(FAKE_USERNAME));
		message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));
		message.setSubject(subject);
		message.setText(content);
		Transport.send(message);
		return true;

	} catch (MessagingException e) {
e.printStackTrace();
return false;
	}
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==b){
		sendSpam(t.getText(), "I'M A STALKER", "I watch you in your sleep, I know where you live. I'LL KILL YOU!" );
	}
	else{
		
	}
}

}