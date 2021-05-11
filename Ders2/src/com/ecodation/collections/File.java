package com.ecodation.collections;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class File<T> {

	public static void main(String[] args) {

		String path = "C:\\Users\\dell\\Desktop\\data.txt";
		java.io.File file = new java.io.File(path);

		System.out.println("*******************CAN**********************");
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println("********************SET*********************");
		System.out.println(file.setExecutable(false));
		System.out.println("********************EXIST*********************");
		System.out.println(file.exists());
		System.out.println("********************IS*********************");
		System.out.println(file.isAbsolute());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.isHidden());
		System.out.println("**********************SIZE***********************");
		System.out.println(file.length());
		System.out.println("***********************URL**********************");
		// System.out.println(file.toURL());
		System.out.println("*********************GET********************");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.getFreeSpace());
		System.out.println(file.getTotalSpace());
		System.out.println(file.getClass());
		System.out.println("*********************LAST MODIFIED DATE********************");
		System.out.println("Alteration date: " + file.lastModified());
		Locale locale = new Locale("tr", "TR");
		SimpleDateFormat sFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss", locale);
		Date date = new Date(file.lastModified());
		String str = sFormat.format(date);
		System.out.println(str);

		// forEach

		java.io.File fileLoop = new java.io.File("C:\\Users\\dell\\Desktop\\data.txt");
		for (String temp : fileLoop.list()) {
			System.out.println(temp);
		}

		java.io.File fileLoop2 = new java.io.File("C:\\Users\\dell\\Desktop");
		for (java.io.File temp : fileLoop2.listFiles()) {
			System.out.println(temp);
		}
	}
}
