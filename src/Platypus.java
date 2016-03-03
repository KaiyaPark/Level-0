public class Platypus {
	private String name;

	public Platypus(String string) {
		name = string;
	}

	void sayHi(){
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}
	
	public static void main(String[] args) {
		Platypus p = new Platypus("puffy");
		p.sayHi();
	}
}
