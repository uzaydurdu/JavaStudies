
public class Ders018StringParcalama {
	public static void main(String[] args) {
		// Disintegrating a string
		String word = "FatihKaraOsman , MügeKalkan , SerdarÜnlü , TahirCanYıldız , UzayDurdu";

		// split
		String[] wordArray = word.split(",");
		for (String temp : wordArray) {
			System.out.println(temp);
		}
		// 2-) StringTokenize
	}
}
