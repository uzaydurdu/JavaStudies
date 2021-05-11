package com.ecodation.collection;

public class StaticArray {
	public static void main(String[] args) {
		int[] array = new int[10 * 10];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}

		for (Object o1 : array) {
			System.out.println(o1 + "\n");
		}
	}
}
