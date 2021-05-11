package com.ecodation.innerclass;

import com.ecodation.innerclass.OutClass.ConcentricClass;

public class Main {
	public static void main(String[] args) {

		OutClass outClass = new OutClass();
		outClass.setName("Uzay");
		outClass.setSurname("Durdu");

		// OutClass concentricClass = new OutClass.ConcentricClass();
		OutClass.ConcentricClass inner = new ConcentricClass();
		inner.setPrivateInformation("Try for inner class.");
		System.out.println(inner);

	}
}
