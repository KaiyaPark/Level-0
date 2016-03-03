// Copyright Wintriss Technical Schools 2013
/* 
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. */

public class Smurf {

	private String name;
	private String hat;
	private String gender;
	Smurf(String name, String hat, String gender) {
		this.name = name;
		this.hat = hat;
		this.gender = gender;
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		return hat;
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		return gender;
	}

}


