package com.ecodation.collections;

import java.util.HashSet;
import java.util.Iterator;

public class Set<T> {
	public static void main(String[] args) {

		java.util.Set<String> listProduct = new HashSet<String>();

		listProduct.add("Uzay");
		listProduct.add("Durdu");
		listProduct.add("Java");
		listProduct.add("Full Stack");
		listProduct.add("Trying1");
		listProduct.add("Trying2");

		for (String temp : listProduct) {
			System.out.println(temp);
		}

		Iterator<String> iter = listProduct.iterator();
		while (iter.hasNext()) {
			System.out.println();
		}
	}
}
