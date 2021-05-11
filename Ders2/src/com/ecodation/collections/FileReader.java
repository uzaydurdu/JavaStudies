package com.ecodation.collections;

import java.io.BufferedReader;

public class FileReader {
	public static void main(String[] args) {

		String path = "C:\\Users\\dell\\Desktop\\data.txt";

		try (BufferedReader bR = new BufferedReader(new java.io.FileReader(path))) {
			String read = "";
			String row = "";

			while ((row = bR.readLine()) != null) {
				read += row + " ";
			}
			System.out.println("The process was completed.");

			System.out.println(" " + read + " ");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
	}
}
