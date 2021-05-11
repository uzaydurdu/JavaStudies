package com.ecodation.collections;

import java.io.BufferedWriter;

public class FileWriter {
	public static void main(String[] args) {

		String path = "C:\\Users\\dell\\Desktop\\data.txt";

		try (BufferedWriter bW = new BufferedWriter(new java.io.FileWriter(path))) {
			bW.write("deneme");
			System.out.println("The process was completed.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
	}
}
