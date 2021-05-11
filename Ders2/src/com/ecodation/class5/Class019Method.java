package com.ecodation.class5;

import java.util.Scanner;

public class Class019Method {

	public static void main(String[] args) {

		methodName(34, "İstanbul", 23.23);

		String toFind = word();

		if (toFind.contains("malatya")) {
			System.out.println("Yes, there is word you got find.");
		} else {
			System.out.println("Sorry, there is no word tou wanted.");
		}

		System.out.println(collectionMethod(22, 22));

	}

	private static int collectionMethod(int x, int y) {
		return x + y;
	}

	// public protected private
	// static
	// void means it does not return anything.
	// methodName = camel case
	// camel case(parameters)
	public static void methodName(int k, String m, double f) {
		k = 5;
		m = "Uzay Durdu";
		f = 44.34;
		System.out.println(k);
		System.out.println(m);
		System.out.println(f);
	}

	public static String word() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a word:");
		String word = scanner.nextLine();
		return word;
	}
}
