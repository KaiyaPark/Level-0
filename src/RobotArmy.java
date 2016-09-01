public class RobotArmy {
	public static void main(String[] asd){
		Human h = new Human("Kaiya");
		Robot r = new Robot("R2D2", false, 1022);
		Robot r2 = new Robot("BB8", false, 5005);
		r.destroy(h);
		r2.destroy(h);
		r.cuteBattle(r2);
	}


}

/**
 * Human Class
 */
class Human {
	String name;
	boolean isAlive;
	
	public Human(String name){
		this.name = name;
		this.isAlive = true;
	}

	public String getName() {
		return name;
	}
	public void die(){
		isAlive = false;
	}
}

/**
 * Robot Class
 */
class Robot {
	boolean isEvil;
	String name;
	int cutenessPower;
	public Robot(String name, boolean isEvil, int cutenessPower){
		this.name = name;
		this.isEvil = isEvil;
		this.cutenessPower = cutenessPower;
	}
	
	public void destroy(Human man){
		if(isEvil){
			System.out.println("Beep Boop Pew! Oh no! the robot " + name + " blasted " + man.getName() + "'s head off!");
			man.die();
		}
		else{
			System.out.println("No!! The robot " + name + " loves " +man.getName());
		}
	}
	public void cuteBattle(Robot r){
	if (cutenessPower< r.cutenessPower){
		System.out.println(r + " won the cuteness battle!");
	}
	
	
	}
}
