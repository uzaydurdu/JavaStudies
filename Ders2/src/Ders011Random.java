import java.util.Random;

public class Ders011Random {
	public static void main(String[] args) {
		/*
		 * double random = Math.floor((Math.random() * 5 + 1));
		 * System.err.println("random numbers: " + random);
		 */

		Random random = new Random();
		int number = random.nextInt(5) + 1;
		System.out.println(number);
		for (int i = 0; i <= 6; i++) {
			number = i;
			System.out.println(" " + random.nextInt(5));
		}
		System.out.println(number);
	}
}
