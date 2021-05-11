package com.ecodation.abstracts;

import java.io.Serializable;

public abstract class Pencil implements Serializable {
	// private anything => it is object variance.
	private static final long serialVersionUID = 45677544533456L;

	private long id;
	private String name;
	private String color;
	private double price;
	/*
	 * private String type; private double price; private Date dateOfProduced;
	 */

	// private static shop=> it is class variance.

	// constructor is without parameter.
	public Pencil() {

	}

	// constructor is with parameter.
	public Pencil(long id, String name, String color, double price) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
	}

	// methods
	public void getPencilInformation() {
		System.out.println("*************************************\n" + "ID: " + this.id + "\nName: " + this.name
				+ "\nColor: " + this.color + "\nPrice: " + this.price);
	}

	// method is without body.
	public abstract void getPencilColor();

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pencil [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + "]";
	}

}
