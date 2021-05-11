package com.ecodation.class5;

import java.util.Random;
import java.util.Scanner;

public class Class025ArrayExamples {

	public static void showSymbol() {
		Scanner scanner = new Scanner(System.in);

		int row, column;
		System.out.println("Please enter number of row: ");
		row = scanner.nextInt();
		System.out.println("Please enter number of column: ");
		column = scanner.nextInt();

		int array[][] = new int[row][column];
	}

	public static void showSingleSymbol() {
		Scanner scanner = new Scanner(System.in);
		int row, number1, number2, number3;
		System.out.println("Please enter number of row: ");
		row = scanner.nextInt();

		System.out.println("Please enter 1th number: ");
		number1 = scanner.nextInt();

		System.out.println("Please enter 2th number: ");
		number2 = scanner.nextInt();

		System.out.println("Please enter 3th number: ");
		number3 = scanner.nextInt();

	}

	public static void newExamplesArray() {
		Scanner scanner = new Scanner(System.in);
		Random rndm = new Random();
		int row, beginning, ending;

		System.out.print("Please enter number of array's item: ");
		row = scanner.nextInt();

		System.out.print("Please enter value of first variance: ");
		beginning = scanner.nextInt();

		System.out.print("Please enter value of last variance: ");
		ending = scanner.nextInt();

		int[] array = new int[row];

		for (int i = 0; i < array.length; i++) {
			int random = rndm.nextInt(ending) + beginning;
			array[i] = random;
		}
		for (Object temp : array) {
			System.out.print(temp + " ");
		}

		System.out.println("\nFirst number: " + array[0] + "\n");
		System.out.println("Last number: " + array[array.length - 1]);
	}

	public static void even() {
		int[] array = { 0, 1, 2, 3, 4 };
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.println("Even numbers: " + array[i] + " ");
			} else {
				System.out.println("Single numbers: " + array[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		// newExamplesArray();
		even();
	}
}
