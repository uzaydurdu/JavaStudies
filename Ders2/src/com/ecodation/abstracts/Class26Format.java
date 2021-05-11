package com.ecodation.abstracts;

public class Class26Format {
	public static void main(String[] args) {

		String word = "Java SE";
		int number = 44;
		float floatNumber = 34.34f;

		System.out.printf("%s %d %f", word , number , floatNumber);
		System.out.println();
		System.out.printf("%s %10d %f" , word , number , floatNumber);
		System.out.println();
		System.out.printf("%s %d %f" , word , number , floatNumber);

		/*
		 * System.out.print("inline"); System.out.println("block");
		 * System.err.println("error"); System.out.printf("format");
		 */
	}
}
