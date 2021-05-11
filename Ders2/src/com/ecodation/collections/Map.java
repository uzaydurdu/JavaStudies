package com.ecodation.collections;

import java.util.HashMap;

public class Map<T> {
	public static void main(String[] args) {
		// Map : Key , value
		// H H L T
		// H = HashTableMap H = HashMap(it is not important number of index) L =
		// LinkedHashMap(in rank added) T = TreeHashMap(ranking)

		// HashTable

		// K = Key V = Value H - HLT
		java.util.Map<Integer, String> mapList = new HashMap<Integer, String>();

		mapList.put(1, "Uzay");
		mapList.put(2, "Cebep");
		mapList.put(3, "Cebu");
		mapList.put(4, "Cuci");
		mapList.put(5, "Cebulu");
		mapList.put(6, "Cucilu");
		mapList.put(7, "Zeybeeeppp");

		if (mapList.isEmpty()) {
			System.out.println("There is no item of mapList.");
		} else {
			System.out.println("There is item in mapList.");
		}

		// mapList.remove(0);

		for (Object temp : mapList.keySet()) {
			System.out.println(temp);
		}
	}
}
