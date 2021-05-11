
public class Examples007DoWhile {
	public static void main(String[] args) {
		int i = 0;
		do {
			System.out.println("Here will work one time.");
			System.out.println(i);
			i += 2;
		} while (i < 10);
		// if you want to print to the screen
		// if index is not needed
		int[] array = { 1, 2, 6, 5, 4, 8, 5 };
		for (int temp : array) {
			System.out.println(temp);
		}
	}
}
