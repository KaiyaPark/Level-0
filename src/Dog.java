import java.io.IOException;

public class Dog {
	String name;
	public Dog(String name) {
		this.name = name;
		System.out.println("My name is " + this.name);
	}
	private void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void sayName(){
		speak("My name is " + this.name);
	}
	
	public void woof(){
		speak("Woof, woof");
	}
	
	public void wag(){
		speak("I can wag my tail, wag, wag");
	}
	
	public static void main(String[] args) throws InterruptedException {
		Dog d = new Dog("Fluffy");
		d.sayName();
		Thread.sleep(1500);
		d.woof();
		Thread.sleep(1000);
		d.wag();
	}
}
