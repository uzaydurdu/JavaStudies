package com.ecodation.inheritance1;

public class Main {
	public static void main(String[] args) {

		HighLightPencil highLightPencil = new HighLightPencil();
		System.out.println(highLightPencil);

		BlueBallpointPen blueBallpointPen = new BlueBallpointPen();
		blueBallpointPen.setName("Rotring");
		blueBallpointPen.setEndOfIt("Yellow");
	}
}
