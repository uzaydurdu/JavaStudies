package com.ecodation.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeHashMap {
	public static void main(String[] args) {

		Map<Integer, String> mapList = new TreeMap<Integer, String>();

		mapList.put(1, "Uzay");
		mapList.put(2, "Cebep");
		mapList.put(3, "Cebu");
		mapList.put(4, "Cuci");
		mapList.put(5, "Cebulu");
		mapList.put(6, "Cucilu");
		mapList.put(7, "Zeybeeeppp");

		for (Integer key : mapList.keySet()) {
			System.out.println(key);
		}

		for (String value : mapList.values()) {
			System.out.println(value);
		}

		for (Object object : mapList.keySet()) {
			String allOfThem;
		}
	}
}
