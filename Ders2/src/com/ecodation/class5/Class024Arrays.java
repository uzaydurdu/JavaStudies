package com.ecodation.class5;

import java.util.Arrays;
import java.util.Scanner;

public class Class024Arrays {

	public static void arrayExample() {

		Scanner scanner = new Scanner(System.in);
		int[] arrayName = new int[10];
		for (int i = 0; i <= arrayName.length - 1; i++) {
			System.out.println("Please enter a number " + "into number array " + i + "th item: ");
			arrayName[i] = scanner.nextInt();
		}
		Arrays.sort(arrayName);
		for (int temp : arrayName) {
			System.out.println(temp);
		}
	}

	public void ranking() {
		int[] numberArray = new int[4];

		numberArray[0] = 5;
		numberArray[1] = 5;
		numberArray[2] = 5;
		numberArray[3] = 5;

		Arrays.sort(numberArray);
		for (int temp : numberArray) {
			System.out.println(temp);
		}
	}

	public static void matrixCall() {
		int[][] arrayName = new int[2][2]; // 2 rows and 3 columns.
		arrayName[0][0] = 1;
		arrayName[0][1] = 2;
		arrayName[1][0] = 4;
		arrayName[1][1] = 5;

		for (int i = 0; i < 2; i++) {// row
			for (int j = 0; j < 2; j++) {// column
				System.out.print(arrayName[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void binarySearch() {
		int[] numberArray = new int[4];

		numberArray[0] = 5;
		numberArray[1] = 9;
		numberArray[2] = 6;

		Arrays.sort(numberArray);
		int result = Arrays.binarySearch(numberArray, 5);

		if (result < 0) {
			System.out.println("there is no anything you searched.");
		}

		System.out.println(result);
		for (int temp : numberArray) {
			System.out.println(temp);
		}
	}

	public static void compareArray() {
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 1, 2, 4 };

		if (Arrays.equals(array1, array2)) {
			System.out.println("Arrays are equal to each other.");
		} else {
			System.out.println("Arrays are not equal to each other.");
		}

	}

	public static void main(String[] args) {
		// arrayExample();
		// matrixCall();
		// binarySearch();
		compareArray();
	}
}
