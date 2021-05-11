package com.ecodation.uzayenum;

public class MainControl {
	public static void main(String[] args) {
		/*
		 * Person student1 = new Students(); // polymorphism student1.setName("Uzay");
		 * student1.setSurname("Durdu"); student1.informations();
		 * System.out.println(student1);
		 * 
		 * System.out.println(
		 * "******************************************************************************************************************"
		 * );
		 * 
		 * Teacher teacher = new Teacher(); teacher.setName("Uzay Master");
		 * teacher.setSurname("Durdu Master"); // polymorphism teacher.informations();
		 * System.out.println(teacher); System.out.println(
		 * "*********************************************************************************************************"
		 * );
		 * 
		 * Days day = Days.wednesday; System.out.println(day + "\n" + day.ordinal() +
		 * "\n" + day.values()[3]);
		 * 
		 * Months month = Months.january; System.out.println(month + "\n" +
		 * month.ordinal() + "\n" + month.values()[6]);
		 * 
		 * Colours colour = Colours.black; System.out.println(colour + "\n" +
		 * colour.ordinal() + "\n" + colour.values()[4]);
		 */
		/*
		 * Level level = Level.MEDIUM; System.out.println(level.getLevelCode());
		 */
		Months month = Months.october;
		System.out.println(month.getKey());
		System.out.println(month.getValue());

	}
}
