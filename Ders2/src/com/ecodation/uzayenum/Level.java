package com.ecodation.uzayenum;

public enum Level {
	// public static final double STABIL = 44.34;
	HIGH(3), MEDIUM(2), LOW(1);

	private final int levelCode;

	// Constructor
	private Level(int levelCode) {
		this.levelCode = levelCode;
	}

	public int getLevelCode() {
		return levelCode;
	}

}
