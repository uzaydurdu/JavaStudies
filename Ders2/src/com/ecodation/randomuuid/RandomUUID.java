package com.ecodation.randomuuid;

import java.util.Scanner;
import java.util.UUID;

public class RandomUUID {
	public String uuidMethod() {
		UUID randomUuid = UUID.randomUUID();
		String toString = String.valueOf(randomUuid);
		return toString;
	}

	// the way of mail

	public String mailSend(String comingUUID) {

		System.out.println("Your mail was sended.");
		return comingUUID;
	}

	// Reading mail

	public String mailOpen(String outGoingUUID) {
		System.out.println("Please click to affirm your mail.");
		return outGoingUUID;
	}

	// the way of telephone

	public String telephoneSend(String comingUUID) {
		return comingUUID;
	}

	public void dbWrite(String comingUUID) {
		System.out.println("it was saved to Database: " + comingUUID);
	}

	// Admin's assent is necessary.

	public boolean adminApprove() {
		System.out.println("it is awaited that admin certify mail.");
		boolean adminAssent = true; // =false;
		return adminAssent;
	}

	// login

	public void login(boolean result) {
		// if admin have approved your mail.
		if (result) {
			String dbUserName = "Root", dbPassword = "Root";
			String userName, password;
			Scanner scanner = new Scanner(System.in);

			System.out.print("Please enter your user name: ");
			userName = scanner.nextLine();
			System.out.print("Please enter your password: ");
			password = scanner.nextLine();

			if ((userName.equals(dbUserName)) && (password.equals(dbPassword))) {
				System.out.println("you are being leaded to user page.");
			} else {
				System.out.println("Your user name or password are wrong.");
			}
		}
	}
}
