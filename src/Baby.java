import java.io.IOException;

public class Baby {
	public static void main(String[] args) throws IOException,
			InterruptedException {
String o = ("Oh");
String n = ("No");
String b = ("Baby");
Runtime.getRuntime().exec("say You know you love me, I know you care " +
"Just shout whenever, and I'll be there " +
"You are my love, you are my heart " +
"And we would never ever ever be apart " +
"Are we an item? Girl, quit playing " +
"We're just friends, what are you saying? " +
"Say there's another and look right in my eyes " +
"My first love broke my heart for the first time, and I was like... ");
Thread.sleep(23500);		
for (int i = 0; i < 3; i++) {		
	Runtime.getRuntime().exec("say " + b);
			Thread.sleep(700);
		}
		Runtime.getRuntime().exec("say " + o);
		Thread.sleep(700);
		for (int i = 0; i < 3; i++) {
			Runtime.getRuntime().exec("say " + b);
			Thread.sleep(700);
		}
		Runtime.getRuntime().exec("say " + n);
		Thread.sleep(700);
		for (int i = 0; i < 3; i++) {
			Runtime.getRuntime().exec("say " + b);
			Thread.sleep(700);
		}
		Runtime.getRuntime().exec("say " + o);
		Thread.sleep(700);
		
		Runtime.getRuntime().exec("say Thought you'll always be mine");
		Thread.sleep(700);
	}
}
