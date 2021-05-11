package com.ecodation.abstracts;

public class HighlightPencil extends Pencil implements IColorOfPencil {

	private static final long serialVersionUID = 3367531375189591110L;

	@Override
	public void getPencilColor() {
		System.out.println("Highlight Pencil Color: yellow");
	}

	@Override
	public void pencilColorTrademark() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pencilGuarantee(String param) {
		// TODO Auto-generated method stub

	}

}
