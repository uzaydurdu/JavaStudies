public class Main {
	public static void main(String[] args) {
		// db servisler JSON
		String word = "Ecodation Java";
		System.out.println("Size: " + word.length());
		System.out.println(word.charAt(0));
		System.out.println("Concat: " + word.concat(" SE"));
		String concated = word.concat(" SE");
		word = concated;
		System.out.println(word);
		System.out.println(word.startsWith("E"));
		boolean result = word.startsWith("E");
		if (result) {
			System.out.println("It starts with e");
		} else {
			System.out.println("It does not start with e");
		}
		// boolean result2 = word.endsWith("E");
		System.out.println("E");

		// Contains
		System.out.println("Contains: " + word.contains("Java"));
		boolean contain = word.contains("Java");
		if (contain) {
			System.out.println("There is such contain");
		} else {
			System.out.println("there is no such thing");
		}

		// equals
		boolean equal1 = word.equals("Java");
		if (equal1) {
			System.out.println("they are equal");
		} else {
			System.out.println("they are not equal");
		}

		// Is Empty
		// System.out.println(word.isEmpty());
		if (!word.isEmpty()) {
			System.out.println("fulled");
		} else {
			System.out.println("empty");
		}

		// Replace
		String word2 = "try";
		System.out.println(word.replace("try", "try2"));
		System.out.println(word2);
		System.out.println(word.toLowerCase());
		System.out.println(word.toUpperCase());

		System.out.println("Spaces were removed: " + word.trim());

		String name = "Uzay Durdu";
		String[] dizi = name.split(" ");
		for (String temp : dizi) {
			System.out.println(" " + temp);
		}
		System.out.println("------------------------");
		System.out.println(dizi[1] + " " + dizi[0]);

		System.out.println("------------------------");
		String word3 = "Ecodation";
		System.out.println(word3.substring(1));
		// System.out.println(word3.substring(10)); Hata verir
		System.out.println(word3.substring(0, 2));
	}
}
