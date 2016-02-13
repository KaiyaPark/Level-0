
public class Odd {
	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0) {

				if (i % 15 != 0) {
					System.out.println(i);
				}

			}
			if (i % 5 == 0) {
				if (i % 15 != 0) {
					System.out.println(i);
				}
			}
		}
	}
}
