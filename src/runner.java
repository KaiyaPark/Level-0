
public class runner {
public static void main(String[] args) {
	Smurf handy = new Smurf("handy", "white","boy");
	System.out.println("Hi my name is " + handy.getName() + "I have a " + handy.getHatColor() + "and I am a " + handy.isGirlOrBoy());
	handy.eat();
	Smurf papa = new Smurf("papa", "red","boy");
	System.out.println(papa.getName() + " I have a " + papa.getHatColor() + " hat and I am a " + papa.isGirlOrBoy());
	Smurf smurfette = new Smurf("smurfette", "white","girl");
	System.out.println("Hi my name is " + smurfette.getName() + "I have a " + smurfette.getHatColor() + "and I am a " + smurfette.isGirlOrBoy());
}
}
