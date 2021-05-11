import java.util.Scanner;

public class Example010Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number:\n");
		int number = scanner.nextInt();

		int temp = 1;

		for (int i = 1; i <= number; i++) {
			temp *= i;
			System.out.print(temp + " ");
		}
		System.out.println("\nFactorial " + number + ": " + temp);
	}
}
