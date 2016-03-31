
public class Person {
	int age;
	String name;
	String power;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.getAge() + "\t" + p.getName() + "\t" + p.getPower());
		p.setAge(12);
		p.setName("Chloe");
		p.setPower("Invisible");
		System.out.println("After calling setters");
		System.out.println(p.getAge() + "\t" + p.getName() + "\t" + p.getPower());
	}
}
