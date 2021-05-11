package com.ecodation.collections;

import java.util.Stack;
import java.util.Vector;

public class ObjectChange {
	// Object-->String-->Integer you cannot turn objects into integer directly.

	/*
	 * Vector: unless the process is finished, it does not continue. ArrasyList:
	 * even if the process is not finished, another process can come to queue and it
	 * can work synchronized
	 */
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>(4, 6);
		vector.add(21);

		Stack<Integer> lifo = new Stack();
		lifo.add(44);
		lifo.add(34);
	}

}
