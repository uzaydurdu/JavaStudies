package com.ecodation.class5;

public class Class023Throws {
	public static void mailSend() {
		System.out.println("Your mail is being sending.");

		for (int i = 0; i <= 1000; i++) {
			System.out.println("Programme " + i);
		}

		System.out.println("Result");
		int result = 4 / 0;

		System.out.println("Programme was ended.");
	}

	public static void cell() {
		mailSend();
	}

	public static void main(String[] args) throws ArithmeticException {

		cell();
	}
}
