package com.ecodation.uzayenum;

import java.io.Serializable;

public class Teacher implements Serializable {

	private static final long serialVersionUID = 4432999687857397590L;

	private Long id;
	private String name;
	private String surname;
	private String bloodGroup;

	public Teacher() {

	}

	public Teacher(long id, String name, String surname, String bloodGroup) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.bloodGroup = bloodGroup;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", surname=" + surname + ", bloodGroup=" + bloodGroup + "]";
	}

	public void informations() {
	}

}
