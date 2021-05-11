package com.ecodation.collections;

public class HashMap {
	public static void main(String[] args) {

		// K = Key V = Value H - HLT
		// This list method gives us the items in rank our added.
		java.util.Map<Integer, String> mapList = new java.util.HashMap<Integer, String>();

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
		// accessing to keys
		for (Object key : mapList.keySet()) {
			System.out.println(key);
		}

		System.out.println("***********************************");

		// accessing to values
		for (String value : mapList.values()) {
			System.out.println(value);
		}
	}
}
