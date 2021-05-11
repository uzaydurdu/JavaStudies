package com.ecodation.uzayenum;

import java.io.Serializable;

public class Students extends Person implements Serializable {

	private static final long serialVersionUID = 2829015976288932537L;

	@Override
	public void informations() {
		System.out.println("Informations of student.");

	}

	@Override
	public void informations(long id) {
		// TODO Auto-generated method stub

	}

}
