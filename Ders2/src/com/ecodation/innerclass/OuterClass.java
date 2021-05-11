package com.ecodation.innerclass;

public class OuterClass {
	int x = 25;

	class InnerClass {
		int y = 45;

	}

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		// OuterClass.InnerClass inner = outerClass.new InnerClass();
		OuterClass.InnerClass inner = outerClass.new InnerClass();
		System.out.println(inner.y + outerClass.x);
	}
}
