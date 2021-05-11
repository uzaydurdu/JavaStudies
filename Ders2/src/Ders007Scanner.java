import java.util.Scanner;

public class Ders007Scanner {
	public static void main(String[] args) {
		// System.out.println("Screen Output");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please entry your name: ");
		String word = scanner.nextLine(); // String
		System.out.println("Your name: " + word);
		System.out.println("Your spoke language");
		int languages = scanner.nextInt();
		System.out.println("Your spoke languages: " + languages);
		// scanner.next(); it stays as inline in that row
		scanner.close();
	}
}
