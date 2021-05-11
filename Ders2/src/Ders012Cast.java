
public class Ders012Cast {
	public static void main(String[] args) {
		// cast = means transform CAST-1
		float f1 = 4.5f;
		long l1 = 4515L;
		// assign low number to high number, vice versa CAST-2
		byte b5 = 45;
		long l5 = b5;
		// place high number into low number
		int i6 = 852;
		byte b6 = (byte) i6;

		// CAST-3
		System.out.println("a" + 6);
		System.out.println(6 + 6);
		// String to int
		String str = "7";
		int strConvert = Integer.valueOf(str);
		int number = 7;
		int result = strConvert + number;
		System.out.println(result);

		// turning the integer into the string
		int number1 = 15;
		String s1 = String.valueOf(number1);
	}
}
