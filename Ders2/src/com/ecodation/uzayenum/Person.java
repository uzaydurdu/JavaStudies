package com.ecodation.uzayenum;

import java.io.Serializable;

public abstract class Person implements Serializable {

	private static final long serialVersionUID = 5431084207223477011L;

	private Long id;
	private String name;
	private String surname;
	private String bloodGroup;

	// Constructor without parameter.
	public Person() {
		id = 1234567895L;
		name = "Uzay";
		surname = "Durdu";
		bloodGroup = "It is not expressed.";
	}

	public abstract void informations();

	public abstract void informations(long id);

	// Constructor with parameter
	public Person(long id, String name, String surname, String bloodGroup) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.bloodGroup = bloodGroup;
	}

	// getter and setter
	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", surname=" + surname + ", bloodGroup=" + bloodGroup + "]";
	}

}
