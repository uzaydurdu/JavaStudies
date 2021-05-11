package com.ecodation.innerclass;

public class OutClass {

	private String name;
	private String surname;
	private int age;

	// getters and setters
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static class ConcentricClass {
		private String privateInformation;

		public String getPrivateInformation() {
			return privateInformation;
		}

		public void setPrivateInformation(String privateInformation) {
			this.privateInformation = privateInformation;
		}

	}

}
