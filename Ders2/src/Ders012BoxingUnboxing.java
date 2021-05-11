
public class Ders012BoxingUnboxing {
	public static void main(String[] args) {
		// Boxing

		// primitive
		// whole numbers b<s<i<l
		byte b2;
		short s2;
		int i2;
		long l2;
		// fractional number
		float f2;
		double d2;
		// boolean
		boolean b3;
		// char
		char c2;

		// Wrapper Class
		Byte b5 = new Byte((byte) 5);
		short s5;// gc
		s5 = new Short((short) 6);
		Integer i5 = new Integer((int) 17);
		Long l5 = new Long(12);
		Float f5 = new Float(12.5);
		Double d5 = new Double(24.55);
		Boolean booleanB5 = new Boolean(true);
		Character c5 = new Character('a');
		String str5 = new String();
		String str6 = new String("Kelime");
		String str7 = "Merhaba Dünya";
		String str8;
		// CAST-4 unboxing
		// we might want to work level of object sometimes
		// boxing:turning primitive into wrapper
		int primitiveValue = 55;
		Integer WrapperValue = primitiveValue;// Boxing

		// unboxing
		Double wrapperDouble = new Double(44.34);
		double primitiveDouble = wrapperDouble;// unboxing
		// it is question why do we use
		wrapperDouble = null;
		// primitiveDouble = null;// you cannot give object to primitives

	}
}
