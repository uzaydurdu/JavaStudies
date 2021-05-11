package com.ecodation.class5;

public class Class022TryCatch {
	public static void mailSend() {
		System.out.println("Your mail is being sending.");
	}

	public static void main(String[] args) {

		for (int i = 0; i <= 1000; i++) {
			System.out.println("Programme " + i);
		}

		try {
			System.out.println("Result");
			int result = 4 / 0;
		} catch (Exception e) {
			System.err.println("Error occured. Please report to Admin 525252.");
			mailSend();
			// throw (e);
		}

		System.out.println("Programme was ended.");

	}
}
