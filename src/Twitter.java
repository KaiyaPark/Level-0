import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class Twitter implements ActionListener{
	JButton b = new JButton();
	JTextField t = new JTextField(); 
public static void main(String[] args) {
	Twitter t = new Twitter();
	t.stuff();
}
 void stuff(){
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	f.add(p);
	p.add(t);
	t.setText("Write in here!");
	p.add(b);
	b.addActionListener(this);
	b.setText("Search the Twitterverse");
	f.setVisible(true);
	f.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource() == b){
	System.out.println("Tweet Tweet");
	System.out.println(getLatestTweet(t.getText()));
	
	}
	
}
private String getLatestTweet(String searchingFor) {

	twitter4j.Twitter twitter = new TwitterFactory().getInstance();
	AccessToken accessToken = new AccessToken(
			"2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
			"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
	twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
			"6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
	twitter.setOAuthAccessToken(accessToken);

	Query query = new Query(searchingFor);
	try {
		QueryResult result = twitter.search(query);
		return result.getTweets().get(0).getText();
	} catch (Exception e) {
		System.err.print(e.getMessage());
		return "What the heck is that?";
	}
}



}
