package com.ecodation.genericclass;

public class MainControl {
	public static void main(String[] args) {
		TelephoneNormal normal = new TelephoneNormal();
		String counterString = "44";
		int number = Integer.valueOf(counterString);
		normal.setId(number);

		System.out.println("******************************");

		TelephoneGeneric<Integer> generic = new TelephoneGeneric<>();
		generic.setId(44);
		System.out.println(generic.getId());
		generic.tryingGenericMethods(40.55, "word");
	}
}
