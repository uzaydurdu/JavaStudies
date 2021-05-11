package com.ecodation.encoder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String word;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a word:");
		word = scanner.nextLine();

		String encoded = EncoderDecoder.encoderMethod(word);
		System.out.println(encoded);

		String decoded = EncoderDecoder.decoderMethod(encoded);
		System.err.println(decoded);
	}
}
