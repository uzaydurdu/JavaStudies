package com.java.dto;

import java.sql.Timestamp;

public abstract class CommonClass {
	private long id;
	private Timestamp creationDate;

	public CommonClass(long id, Timestamp creationDate) {
		super();
		this.id = id;
		this.creationDate = creationDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

}
