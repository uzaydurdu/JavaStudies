package com.ecodation.inheritance1;

import java.util.Date;

public class Pencils {
	@Override
	public String toString() {
		return "Pencils [id=" + id + ", name=" + name + ", price=" + price + ", companyName=" + companyName
				+ ", dateOfProduce=" + dateOfProduce + ", colorOfPencil=" + colorOfPencil + ", endOfIt=" + endOfIt
				+ "]";
	}

	private int id;
	private String name = "mechanical pencil";
	private double price;
	private String companyName;
	private Date dateOfProduce;
	private String colorOfPencil;
	private String endOfIt;

	public String getColorOfPencil() {
		return colorOfPencil;
	}

	public void setColorOfPencil(String colorOfPencil) {
		this.colorOfPencil = colorOfPencil;
	}

	public String getEndOfIt() {
		return endOfIt;
	}

	public void setEndOfIt(String endOfIt) {
		this.endOfIt = endOfIt;
	}

	public int getId() {
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Date getDateOfProduce() {
		return dateOfProduce;
	}

	public void setDateOfProduce(Date dateOfProduce) {
		this.dateOfProduce = dateOfProduce;
	}

}
