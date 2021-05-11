package com.ecodation.collections;

public class IO {
	public static void main(String[] args) {

		try {
			int x = 0 / 0;
		} catch (Exception e) {
			System.out.println("you cannot divide a number with zero");
			throw new ArithmeticException("Divide with zero");
		} finally {

		}
	}
}
