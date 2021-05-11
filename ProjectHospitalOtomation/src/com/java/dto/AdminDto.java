package com.java.dto;

import java.sql.Timestamp;

public class AdminDto extends CommonClass {

	private String userName = "";
	private String emailAddress = "";
	private String password = "";

	public AdminDto(long id, Timestamp creationDate) {
		super(id, creationDate);
		// TODO Auto-generated constructor stub
	}

	public AdminDto(long id, Timestamp creationDate, String userName, String emailAddress, String password) {
		super(id, creationDate);
		this.userName = userName;
		this.emailAddress = emailAddress;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
