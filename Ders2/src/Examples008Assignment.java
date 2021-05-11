import java.util.Scanner;

public class Examples008Assignment {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double quiz;
		double finalExam;
		String nameSurname;

		System.out.println("Please enter your full name.");
		nameSurname = scanner.nextLine();

		System.out.println("Please enter your got grade from quiz.");
		quiz = scanner.nextDouble();

		System.out.println("Please enter your got grade from final.");
		finalExam = scanner.nextDouble();

		double result = (((quiz * 40) / 100) + ((finalExam * 60) / 100));

		if (result >= 91) {
			System.out.println("AA " + result);
		} else if (result >= 81) {
			System.out.println("BA " + result);
		} else if (result >= 71) {
			System.out.println("BB " + result);
		} else if (result >= 61) {
			System.out.println("CB " + result);
		} else if (result >= 51) {
			System.out.println("CC " + result);
		} else if (50 >= result && 40 <= result) {
			System.out.println("CD (You recieve a conditional pass.)" + result);
		} else {
			System.out.println("You will have to repeat the same class.");
		}
	}
}
