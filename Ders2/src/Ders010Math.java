
public class Ders010Math {
	public static void main(String[] args) {
		System.out.println("E: " + Math.E);
		System.out.println("PI: " + Math.PI);

		System.out.println(Math.max(4.564, 4.563));
		System.out.println(Math.min(4.564, 4.563));

		System.out.println(Math.abs(-4)); // absolute
		System.out.println(Math.pow(2, 5)); // exponentiate
		System.out.println(Math.sqrt(16)); // Squareroot

		// Roundings floor = round down, ceil = round up, round = floor + ceil
		System.out.println(Math.floor(6.9));
		System.out.println(Math.ceil(6.1));
		System.out.println(Math.round(8.5));

		double random = Math.round(Math.random() * 5 + 1); // 1<=x<=5
		System.err.println("Random numbers: " + random);
	}
}
