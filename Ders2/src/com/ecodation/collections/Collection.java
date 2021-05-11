package com.ecodation.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection {
	public static void main(String[] args) {

		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 *
		 */
		List<String> listProduct = new ArrayList<String>();
		System.out.println(listProduct);
		listProduct.add("trying");
		listProduct.add("trying2");
		listProduct.add("trying6");
		listProduct.add("trying3");
		listProduct.add("trying4");
		listProduct.add("trying7");
		listProduct.add("trying5");

		Iterator<String> iter = listProduct.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		System.out.println("-----------------------");

		for (Object temp : listProduct) {
			System.out.println(temp);
		}

		System.out.println("------------------------");

		for (int i = 0; i < listProduct.size(); i++) {
			System.out.println(listProduct.get(i));
		}

		/*
		 * System.out.println(listProduct.subList(0,2));
		 * System.out.println(listProduct.indexOf("trying4"));
		 * 
		 * for(String temp : listProduct) { System.out.println(temp); }
		 * 
		 * for(String temp : listProduct) { System.out.println(temp); }
		 * 
		 * System.out.println("--------------------------------");
		 * 
		 * java.util.Collections.sort(listProduct);
		 * 
		 * for(String temp : listProduct) { System.out.println(temp); }
		 */
	}
}
