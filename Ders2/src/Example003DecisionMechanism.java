import java.util.Scanner;

public class Example003DecisionMechanism {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number between 1 and 4.");
		int number = scanner.nextInt();

		switch (number) {
		case 1:
			System.out.println("your entered number is 1");
			break;

		case 2:
			System.out.println("your entered number is 2");
			break;

		case 3:
			System.out.println("your entered number is 3");
			break;

		case 4:
			System.out.println("your entered number is 4");
			break;

		default:
			System.out.println("Please enter numbers indicated in count by.");
			break;
		}
	}
}
