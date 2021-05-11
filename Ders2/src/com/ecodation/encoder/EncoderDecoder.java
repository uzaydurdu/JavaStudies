package com.ecodation.encoder;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncoderDecoder {
	public static String encoderMethod(String wordWillBeEncoded) {
		Encoder encoder = Base64.getEncoder();
		String encoded = encoder.encodeToString(wordWillBeEncoded.getBytes());
		return encoded;
	}

	public static String decoderMethod(String wordWillBeDecoded) {
		Decoder decoder = Base64.getMimeDecoder();
		String decoded = new String(decoder.decode(wordWillBeDecoded));
		return decoded;
	}
}
