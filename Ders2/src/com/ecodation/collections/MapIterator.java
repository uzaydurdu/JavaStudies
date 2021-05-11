package com.ecodation.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapIterator {
	public static void main(String[] args) {

		Map<Integer, String> mapList = new TreeMap<Integer, String>();

		mapList.put(1, "Uzay");
		mapList.put(2, "Cebep");
		mapList.put(3, "Cebu");
		mapList.put(4, "Cuci");
		mapList.put(5, "Cebulu");
		mapList.put(6, "Cucilu");
		mapList.put(7, "Zeybeeeppp");

		java.util.Set<Integer> set = mapList.keySet();
		Iterator iter = set.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
			System.out.println(mapList.get(iter.next()));
		}

		// mapList.entrySet().forEach(::);

		System.out.println("***************************");
		for (Map.Entry<Integer, String> m : mapList.entrySet()) {
			System.out.println(m);
		}
	}
}
