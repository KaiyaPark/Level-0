
public class Bunny {
	String color;
	int num_of_carrots;

	public int getNum_of_carrots() {
		return this.num_of_carrots;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setNum_of_carrots(int num_of_carrots) {
		this.num_of_carrots = num_of_carrots;
	}

	public static void main(String[] args) {
		Bunny bun = new Bunny();
		System.out.println(bun.getColor() + "\t" + bun.getNum_of_carrots());
		bun.setColor("tan");
		bun.setNum_of_carrots(10000);
		System.out.println(bun.getColor() + "\t" + bun.getNum_of_carrots());
	}
}
