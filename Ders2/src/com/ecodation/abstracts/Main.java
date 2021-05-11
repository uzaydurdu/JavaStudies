package com.ecodation.abstracts;

public class Main {
	public static void main(String[] args) {

		/*
		 * Pencil pen = new Pencil(); pen.setId(9); System.out.println(pen);
		 */

		HighlightPencil highPen = new HighlightPencil();
		highPen.setName("Highlight Pencil");
		highPen.setPrice(10);
		highPen.getPencilInformation();
		highPen.getPencilColor(); // Polymorphism
		// System.out.println(highPen);

		// poly-morphism
		Pencil ballPen = new BallpointPen();
		ballPen.setName("Ballpoint Pencil");
		ballPen.setPrice(15);
		// System.out.println(ballPen);
		ballPen.getPencilInformation();
		ballPen.getPencilColor(); // Polymorphism
	}
}
