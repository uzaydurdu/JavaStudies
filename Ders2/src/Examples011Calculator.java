import java.util.Scanner;

public class Examples011Calculator {
	public static void main(String[] args) {
		double result = 0;
		Scanner scanner = new Scanner(System.in);
		System.err.println("------OPTIONS------\n" + "1-)Addition\n" + "2-)Extraction\n" + "3-)Multiplication\n"
				+ "4-)Division\n" + "5-)Quit\n" + "-------------------");
		System.out.println("Please select an option: ");
		String choice = scanner.nextLine();

		System.out.println("Please enter first number:\n");
		double number1 = scanner.nextDouble();

		System.out.println("Please enter second number:\n");
		double number2 = scanner.nextDouble();

		switch (choice) {
		case "1":
			System.out.println("Addition process: ");
			result = number1 + number2;
			System.out.println(result);
			break;

		case "2":
			System.out.println("Extraction process: ");
			result = number1 - number2;
			System.out.println(result);
			break;

		case "3":
			System.out.println("Multiplication process: ");
			result = number1 * number2;
			System.out.println(result);
			break;

		case "4":
			System.out.println("Division process: ");
			if (number2 == 0) {
				System.err.println("Zero cannot be entered for division.");
			}
			result = number1 / number2;
			System.out.println(result);
			break;

		case "5":
			System.out.println("Quiting...");
			System.exit(0);
			break;

		default:
			System.out.println("Please enter a number which is valid.");
			break;
		}

	}
}
