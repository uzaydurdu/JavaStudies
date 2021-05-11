package com.ecodation.uzayenum;

public enum Months {
	january(1, "JANUARY"), february(2, "FEBRUARY"), march(3, "MARCH"), april(4, "APRIL"), may(5, "MAY"),
	june(6, "JUNE"), july(7, "JULY"), august(8, "AUGUST"), september(9, "SEPTEMBER"), october(10, "OCTOBER"),
	november(11, "NOVEMBER"), december(12, "DECEMBER");

	private final int key;
	private final String value;

	private Months(int key, String value) {
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}

}
