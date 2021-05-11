package com.ecodation.randomuuid;

public class Main {

	public static void main(String[] args) {
		RandomUUID uniqueID = new RandomUUID();
		String uuidWord = uniqueID.uuidMethod();
		System.err.println(uuidWord);

		uniqueID.dbWrite(uuidWord);
		uniqueID.telephoneSend(uuidWord);
		String mail = uniqueID.mailSend(uuidWord);
		uniqueID.mailOpen(mail);
		// 29 29 10 = 68 32
		boolean result = uniqueID.adminApprove();
		uniqueID.login(result);
	}
}
