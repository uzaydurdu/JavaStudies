package com.ecodation.genericclass;

public class TelephoneNormal {

	private long id;
	private String name;

	public TelephoneNormal() {
	}

	public TelephoneNormal(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
