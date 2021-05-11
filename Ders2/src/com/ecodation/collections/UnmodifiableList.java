package com.ecodation.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableList<T> {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(44);
		list.add(22);
		list.add(34);

		list = Collections.unmodifiableList(list);
	}
}
